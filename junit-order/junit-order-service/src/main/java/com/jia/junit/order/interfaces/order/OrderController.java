package com.jia.junit.order.interfaces.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jjsai
 * @date 2022/6/9 17:05
 **/
@Slf4j
@RestController
public class OrderController {
	@GetMapping("/test/open-feign")
	public void testOpenFeign() {
		log.info("调用成功");
	}
}
