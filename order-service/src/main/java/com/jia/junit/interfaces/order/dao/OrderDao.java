package com.jia.junit.interfaces.order.dao;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jia.junit.interfaces.order.entity.OrderEntity;
import com.jia.junit.interfaces.order.mapper.OrderMapper;
import org.springframework.stereotype.Component;

/**
 * @author jjsai
 * @date 2022/7/1 11:27
 **/
@Component
public class OrderDao extends ServiceImpl<OrderMapper, OrderEntity> {
}
