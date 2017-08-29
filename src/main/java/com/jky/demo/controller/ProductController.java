package com.jky.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jky.demo.entity.Product;
import com.jky.demo.mapper.ProductMapper;
import com.jky.demo.util.R;

@RestController
public class ProductController {
	
	@Autowired
	private ProductMapper productMapper;
	
	@PostMapping("/soa/product/add")
	public R add(Product product) {
		Integer rs = productMapper.add(product);
		return rs == 1 ? R.ok() : R.error(500, "添加失败！");
	}
	
	@PostMapping("/soa/product/update")
	public R update(Product product) {
		Integer rs = productMapper.update(product);
		return rs == 1 ? R.ok() : R.error(500, "更新失败！");
	}
	
	@GetMapping("/soa/product/{id}")
	public Product load(@PathVariable("id") int id) {
		Product product =  productMapper.load(id);
		//return R.ok().put("product", product);
		return product;
	}
	
	@DeleteMapping("/soa/product/{id}")
	public R delete(@PathVariable("id") int id) {
		int n =  productMapper.delete(id);
		return n == 1 ?  R.ok() : R.error("删除成功！");
	}
	
	@GetMapping("/soa/product/list")
	public R list() {
		return R.ok().put("products", productMapper.list());
	}
}
