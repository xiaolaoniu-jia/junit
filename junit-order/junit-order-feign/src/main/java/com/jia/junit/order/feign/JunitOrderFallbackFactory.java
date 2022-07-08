package com.jia.junit.order.feign;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author jjsai
 * @date 2022/7/8 16:28
 **/
@Slf4j
@Component
public class JunitOrderFallbackFactory implements FallbackFactory<JunitOrderFeignClient> {
	@Override
	public JunitOrderFeignClient create(Throwable cause) {
		return new JunitOrderFeignClient() {
			@Override
			public void testOpenFeign() {
				log.error("异常触发, 此处处理, 错误信息: " + cause.getMessage());
			}
		};
	}
}
