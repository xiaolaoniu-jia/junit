package com.jia.junit.order.interfaces.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName(value = "tb_order")
public class OrderEntity {
	@TableId
	private Long id;

	private String name;

	private Integer seqno;
}
