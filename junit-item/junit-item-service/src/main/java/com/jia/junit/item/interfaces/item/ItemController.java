package com.jia.junit.item.interfaces.item;

import com.jia.junit.item.interfaces.item.service.ItemService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ItemController {
	@Autowired
	ItemService itemService;

	//************************************************
	// 表锁/行锁相关
	//************************************************
	@ApiOperation(value = "测试: 根据索引字段更新数据", notes = "")
	@PutMapping("/test/index")
	public void testIndex() {
		itemService.testIndex();
	}

	@ApiOperation(value = "测试: 根据非索引字段更新数据", notes = "")
	@PutMapping("/test/no-index")
	public void testNoIndex() {
		itemService.testNoIndex();
	}

	@ApiOperation(value = "测试: 死锁", notes = "")
	@PutMapping("/test/dead-lock")
	public void testDeadLock() {
		itemService.testDeadLock();
	}

	//************************************************
	// sentinel相关
	//************************************************
	@ApiOperation(value = "测试: 流控", notes = "1. qps 2. 线程数")
	@GetMapping("/test/flow")
	public void testFlow() {
		log.info("test flow");
	}

	@ApiOperation(value = "测试: 熔断", notes = "1. 慢调用 2. 异常比例 3. 异常数")
	@GetMapping("/test/degrade")
	public void testDegrade() {
		int a = 1 / 0;
	}

	@ApiOperation(value = "测试: OpenFeign整合Sentinel", notes = "")
	@GetMapping("/test/open-feign")
	public void testOpenFeign() {
		itemService.testOpenFeign();
	}

	//************************************************
	// spring cloud stream相关
	//************************************************
	@GetMapping("/test/rabbit")
	public void testRabbit() {
		itemService.testRabbit();
	}

	@GetMapping("/test/kafka")
	public void testKafka() {
		itemService.testKafka();
	}
}
