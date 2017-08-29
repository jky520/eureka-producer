package com.jky.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

import com.jky.demo.entity.Product;
import com.jky.demo.mapper.ProductMapper;

@EnableDiscoveryClient
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		/*ProductMapper productMapper = context.getBean(ProductMapper.class);
		Product product = new Product();
		product.setPname("JAVA从入门到精通");
		product.setPrice(68d);
		product.setType("书籍");
		productMapper.add(product);
		System.out.println(context);*/
	}
}
