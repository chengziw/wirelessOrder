package com.wireless.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Tabletbl entity. @author MyEclipse Persistence Tools
 */

public class Tabletbl implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer ordId;
	private String num;
	private String flag;
	private String description;
	private Set ordertbls = new HashSet(0);

	// Constructors

	/** default constructor */
	public Tabletbl() {
	}

	/** minimal constructor */
	public Tabletbl(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Tabletbl(Integer id, Integer ordId, String num, String flag,
			String description, Set ordertbls) {
		this.id = id;
		this.ordId = ordId;
		this.num = num;
		this.flag = flag;
		this.description = description;
		this.ordertbls = ordertbls;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrdId() {
		return this.ordId;
	}

	public void setOrdId(Integer ordId) {
		this.ordId = ordId;
	}

	public String getNum() {
		return this.num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set getOrdertbls() {
		return this.ordertbls;
	}

	public void setOrdertbls(Set ordertbls) {
		this.ordertbls = ordertbls;
	}

}