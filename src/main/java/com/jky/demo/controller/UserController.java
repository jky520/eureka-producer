package com.jky.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jky.demo.entity.User;
import com.jky.demo.mapper.UserMapper;
import com.jky.demo.util.R;

@RestController
public class UserController {
	
	@Autowired
	private UserMapper userMapper;
	
	@PostMapping("/soa/user/add")
	public R add(User user) {
		return userMapper.add(user) == 1 ? R.ok() : R.error("添加失败");
	}
	
	@PostMapping("/soa/user/update")
	public R update(User user) {
		return userMapper.update(user) == 1 ? R.ok() : R.error("更新失败");
	}
	
	@GetMapping("/soa/user/{id}")
	public User load(@PathVariable("id") int id) {
		return userMapper.load(id);
	}
	
	@DeleteMapping("/soa/user/{id}")
	public R delete(@PathVariable("id") int id) {
		return userMapper.delete(id) == 1 ? R.ok() : R.error("删除失败");
	}
	
	@DeleteMapping("/soa/user/list")
	public List<User> list() {
		return userMapper.list();
	}
}
