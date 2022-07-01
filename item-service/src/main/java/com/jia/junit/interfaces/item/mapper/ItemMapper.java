package com.jia.junit.interfaces.item.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jia.junit.interfaces.item.entity.ItemEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ItemMapper extends BaseMapper<ItemEntity> {
}
