package com.ocloudwork.cloud.service.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "user")
public class User implements Serializable {

	private static final long serialVersionUID = 9174216117528433153L;
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(nullable = false, length = 128, unique = true)
	private String name;

	@Column(length = 3)
	private Integer age;

	/**
	 * 不持久化的属性
	 */
	@Transient
	private String message;

	public User() {
	}

	public User(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


}
