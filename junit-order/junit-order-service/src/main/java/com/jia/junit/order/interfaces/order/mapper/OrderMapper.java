package com.jia.junit.order.interfaces.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jia.junit.order.interfaces.order.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<OrderEntity> {
}
