package com.jia.junit.item.interfaces.item.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName(value = "tb_item")
public class ItemEntity {
	private Long id;

	private String name;

	private Integer seqno;
}
