package com.jia.junit.item.interfaces.item.dao;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jia.junit.item.interfaces.item.entity.ItemEntity;
import com.jia.junit.item.interfaces.item.mapper.ItemMapper;
import org.springframework.stereotype.Component;

/**
 * @author jjsai
 * @date 2022/7/1 11:24
 **/
@Component
public class ItemDao extends ServiceImpl<ItemMapper, ItemEntity> {
}
