package com.wireless.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Menutbl entity. @author MyEclipse Persistence Tools
 */

public class Menutbl implements java.io.Serializable {

	// Fields

	private Integer id;
	private Menutypetbl menutypetbl;
	private String name;
	private String price;
	private String pic;
	private String remark;
	private Set orderdetailtbls = new HashSet(0);

	// Constructors

	/** default constructor */
	public Menutbl() {
	}

	/** minimal constructor */
	public Menutbl(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Menutbl(Integer id, Menutypetbl menutypetbl, String name,
			String price, String pic, String remark, Set orderdetailtbls) {
		this.id = id;
		this.menutypetbl = menutypetbl;
		this.name = name;
		this.price = price;
		this.pic = pic;
		this.remark = remark;
		this.orderdetailtbls = orderdetailtbls;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Menutypetbl getMenutypetbl() {
		return this.menutypetbl;
	}

	public void setMenutypetbl(Menutypetbl menutypetbl) {
		this.menutypetbl = menutypetbl;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPic() {
		return this.pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set getOrderdetailtbls() {
		return this.orderdetailtbls;
	}

	public void setOrderdetailtbls(Set orderdetailtbls) {
		this.orderdetailtbls = orderdetailtbls;
	}

}