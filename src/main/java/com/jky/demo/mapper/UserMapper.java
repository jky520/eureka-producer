package com.jky.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.jky.demo.entity.User;

@Mapper
public interface UserMapper {
	@Insert("insert into t_user(username,password,age,balance) values(#{username},#{password},#{age},#{balance})")
	int add(User user);
	@Select("select * from t_user where id = #{id}")
	User load(int id);
	@Delete("delete from t_user where id = #{id}")
	int delete(int id);
	@Update("update t_user set username=#{username},password=#{password},age=#{age},balance=#{balance}")
	int update(User user);
	@Select("select * from t_user order by id desc")
	List<User> list();
}
