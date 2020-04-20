package com.wireless.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Menutypetbl entity. @author MyEclipse Persistence Tools
 */

public class Menutypetbl implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Set menutbls = new HashSet(0);

	// Constructors

	/** default constructor */
	public Menutypetbl() {
	}

	/** minimal constructor */
	public Menutypetbl(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Menutypetbl(Integer id, String name, Set menutbls) {
		this.id = id;
		this.name = name;
		this.menutbls = menutbls;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getMenutbls() {
		return this.menutbls;
	}

	public void setMenutbls(Set menutbls) {
		this.menutbls = menutbls;
	}

}