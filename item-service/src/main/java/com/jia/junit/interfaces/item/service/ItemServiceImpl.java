package com.jia.junit.interfaces.item.service;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.jia.junit.infrastructure.plugin.IdWorker;
import com.jia.junit.interfaces.item.dao.ItemDao;
import com.jia.junit.interfaces.item.entity.ItemEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;

@Slf4j
@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemDao itemDao;

	@Autowired
	IdWorker idWorker;

	@Autowired
	private TransactionDefinition transactionDefinition;

	@Autowired
	private DataSourceTransactionManager dataSourceTransactionManager;

	/**
	 * 测试: 根据索引字段更新数据
	 * <p>
	 * test1: 根据索引更新, 锁行
	 * test2: 锁行时, 可以查询数据, 但是不可以更新数据
	 * test3: 锁行时, 出现死锁 Deadlock found when trying to get lock; try restarting transaction
	 */
	@Override
	public void testIndex() {
		TransactionStatus transactionStatus = dataSourceTransactionManager.getTransaction(transactionDefinition);
		try {
			UpdateWrapper<ItemEntity> updateWrapper = new UpdateWrapper<>();
			updateWrapper.set("`name`", "index");
			updateWrapper.eq("`id`", 1L);
			itemDao.update(updateWrapper);

			// dataSourceTransactionManager.commit(transactionStatus);
		} catch (Exception e) {
			dataSourceTransactionManager.rollback(transactionStatus);
		}
	}

	/**
	 * 测试: 根据非索引字段更新数据
	 * <p>
	 * test1: 根据非索引更新, 锁表
	 * test2: 锁表时, 可以查询数据, 但是不可以更新数据
	 * test3: 锁表时, 不会出现死锁, 更新报错为: Lock wait timeout exceeded; try restarting transaction
	 */
	@Override
	public void testNoIndex() {
		TransactionStatus transactionStatus = dataSourceTransactionManager.getTransaction(transactionDefinition);
		try {
			UpdateWrapper<ItemEntity> updateWrapper = new UpdateWrapper<>();
			updateWrapper.set("`name`", "no-index");
			updateWrapper.eq("`seqno`", 1);
			itemDao.update(updateWrapper);

			// dataSourceTransactionManager.commit(transactionStatus);
		} catch (Exception e) {
			dataSourceTransactionManager.rollback(transactionStatus);
		}
	}

	/**
	 * 测试: 死锁
	 * <p>
	 * 1. 事务A更新第一行数据, 行锁数据1
	 * 2. 事务B更新第二行数据, 行锁数据2
	 * 3. 事务B更新第一行数据, 尝试拿锁, 进入阻塞, 并进行死锁监测
	 * 4. 事务A更新第二行数据, 尝试拿锁, 进入阻塞, 并进行死锁监测, 事务互相依赖, 无限等待, 抛出异常
	 */
	@Override
	public void testDeadLock() {

	}
}
