package com.jia.junit.item.application.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author jjsai
 * @date 2022/6/26 20:59
 **/
@Slf4j
@Component(value = "testKafkaConsumer")
public class TestKafkaConsumer implements java.util.function.Consumer<String> {
    @Override
    public void accept(String s) {
        try {
            log.info("kafka消费消息: " + s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
