package com.jia.junit.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author jjsai
 * @date 2022/7/8 15:44
 **/
@FeignClient(name = "junit-order-service", fallbackFactory = JunitOrderFallbackFactory.class)
public interface JunitOrderFeignClient {
	@GetMapping("/test/open-feign")
	void testOpenFeign();
}
