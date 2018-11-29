package com.zhao.eshop.inventory.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 请求的响应
 * @author Administrator
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Response {

	public static final String SUCCESS = "success";
	public static final String FAILURE = "failure";
	
	private String status;
	private String message;

	
	public Response(String status) {
		this.status = status;
	}

}
