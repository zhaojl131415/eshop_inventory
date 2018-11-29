package com.zhao.eshop.inventory;

import com.zhao.eshop.inventory.listener.InitListener;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: zhaojinliang
 * @Date: 2018/11/27 15:02
 * @Description:
 */
@SpringBootApplication
@MapperScan("com.zhao.eshop.inventory.mapper")
public class EshopInventoryApplication {

	@Bean
	public JedisCluster JedisClusterFactory() {
		Set<HostAndPort> jedisClusterNodes = new HashSet<HostAndPort>();
		jedisClusterNodes.add(new HostAndPort("192.168.1.222", 7000));
		jedisClusterNodes.add(new HostAndPort("192.168.1.222", 7001));
//		jedisClusterNodes.add(new HostAndPort("192.168.1.222", 7002));

		jedisClusterNodes.add(new HostAndPort("192.168.1.223", 7003));
//		jedisClusterNodes.add(new HostAndPort("192.168.1.223", 7004));
		jedisClusterNodes.add(new HostAndPort("192.168.1.223", 7005));

//		jedisClusterNodes.add(new HostAndPort("192.168.1.224", 7006));
//		jedisClusterNodes.add(new HostAndPort("192.168.1.224", 7007));
//		jedisClusterNodes.add(new HostAndPort("192.168.1.224", 7008));
		JedisCluster jedisCluster = new JedisCluster(jedisClusterNodes);
		return jedisCluster;
	}

	/**
	 * 注册监听器
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
	public ServletListenerRegistrationBean servletListenerRegistrationBean() {
		return new ServletListenerRegistrationBean<>(new InitListener());
	}

	public static void main(String[] args) {
		SpringApplication.run(EshopInventoryApplication.class, args);
	}
}
