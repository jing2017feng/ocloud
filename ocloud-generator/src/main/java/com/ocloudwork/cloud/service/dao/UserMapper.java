package com.ocloudwork.cloud.service.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.ocloudwork.cloud.service.domain.User;

@Mapper
public interface UserMapper {
	
	@Select("select id,name,age from user")
	List<User> getAllUsers();
	
	@Insert("insert into user(id,name,age) values(${id},#{name},${age})")
	int insertUser(User user);
}
