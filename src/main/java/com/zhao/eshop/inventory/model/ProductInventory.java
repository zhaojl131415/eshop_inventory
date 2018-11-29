package com.zhao.eshop.inventory.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 库存数量model
 * @author Administrator
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductInventory {

	/**
	 * 商品id
	 */
	private Integer productId;
	/**
	 * 库存数量
	 */
	private Long inventoryCnt;

}
