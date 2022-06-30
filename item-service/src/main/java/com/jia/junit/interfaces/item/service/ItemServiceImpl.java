package com.jia.junit.interfaces.item.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jia.junit.interfaces.item.entity.ItemEntity;
import com.jia.junit.interfaces.item.mapper.ItemMapper;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl extends ServiceImpl<ItemMapper, ItemEntity> implements ItemService {
}
