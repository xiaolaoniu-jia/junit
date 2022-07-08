package com.jia.junit.item.interfaces.item.service;

public interface ItemService {
	/**
	 * 测试: 根据索引字段更新数据
	 */
	void testIndex();

	/**
	 * 测试: 根据非索引字段更新数据
	 */
	void testNoIndex();

	/**
	 * 测试: 死锁
	 */
	void testDeadLock();

	/**
	 * 测试: OpenFeign整合Sentinel
	 */
	void testOpenFeign();
}
