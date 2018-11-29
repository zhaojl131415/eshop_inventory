package com.zhao.eshop.inventory.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 测试用户Model类
 * @author Administrator
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

	/**
	 * 测试用户姓名
	 */
	private String name;
	/**
	 * 测试用户年龄
	 */
	private Integer age;

}
