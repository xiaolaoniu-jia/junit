package com.jia.junit.interfaces.order.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jia.junit.interfaces.order.entity.OrderEntity;
import com.jia.junit.interfaces.order.mapper.OrderMapper;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, OrderEntity> implements OrderService {
}
