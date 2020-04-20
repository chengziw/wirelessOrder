package com.wireless.entity;

/**
 * Usertbl entity. @author MyEclipse Persistence Tools
 */

public class Usertbl implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private String password;
	private String name;
	private String gender;
	private Integer permission;
	private String remark;

	// Constructors

	/** default constructor */
	public Usertbl() {
	}

	/** minimal constructor */
	public Usertbl(Integer id, String username, String password, String name,
			Integer permission) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.permission = permission;
	}

	/** full constructor */
	public Usertbl(Integer id, String username, String password, String name,
			String gender, Integer permission, String remark) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.permission = permission;
		this.remark = remark;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getPermission() {
		return this.permission;
	}

	public void setPermission(Integer permission) {
		this.permission = permission;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}