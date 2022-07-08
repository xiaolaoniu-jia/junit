package com.jia.junit.item.interfaces.item;

import com.jia.junit.item.interfaces.item.service.ItemService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
	@Autowired
	ItemService itemService;

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
}
