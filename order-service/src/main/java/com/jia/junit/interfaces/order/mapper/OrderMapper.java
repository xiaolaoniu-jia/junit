package com.jia.junit.interfaces.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jia.junit.interfaces.order.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<OrderEntity> {
}
