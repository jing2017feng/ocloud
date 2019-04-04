package com.ocloudwork.cloud.service.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ocloudwork.cloud.service.domain.User;

@Mapper
public interface UserRepository extends JpaRepository<User, Integer>{
	
}
