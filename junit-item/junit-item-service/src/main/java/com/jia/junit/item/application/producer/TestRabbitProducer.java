package com.jia.junit.item.application.producer;

import com.alibaba.nacos.common.utils.JacksonUtils;
import com.jia.junit.item.interfaces.item.entity.ItemEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.util.MimeTypeUtils;

/**
 * @author jjsai
 * @date 2022/6/26 20:58
 **/
@Slf4j
@Component
public class TestRabbitProducer {
    @Autowired
    private StreamBridge streamBridge;

    public boolean sendMessage(ItemEntity entity) {
        final Message<String> message = MessageBuilder.withPayload(JacksonUtils.toJson(entity))
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.TEXT_PLAIN)
                .build();

        return streamBridge.send("testRabbitProducer-out-0", message, MimeTypeUtils.TEXT_PLAIN);
    }
}
