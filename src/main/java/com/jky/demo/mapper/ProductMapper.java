package com.jky.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.jky.demo.entity.Product;

@Mapper
public interface ProductMapper {
	@Insert("insert into products(pname,type,price) values(#{pname},#{type},#{price})")
	int add(Product product);
	@Select("select * from products where pid = #{pid}")
	Product load(int id);
	@Delete("delete from products where pid = #{id}")
	int delete(int id);
	@Update("update products set pname=#{pname},type=#{type},price=#{price}")
	int update(Product product);
	@Select("select * from products order by pid desc")
	List<Product> list();
}
