package com.wireless.entity;

/**
 * Orderdetailtbl entity. @author MyEclipse Persistence Tools
 */

public class Orderdetailtbl implements java.io.Serializable {

	// Fields

	private Integer id;
	private Menutbl menutbl;
	private Ordertbl ordertbl;
	private Integer num;
	private String remark;

	// Constructors

	/** default constructor */
	public Orderdetailtbl() {
	}

	/** minimal constructor */
	public Orderdetailtbl(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Orderdetailtbl(Integer id, Menutbl menutbl, Ordertbl ordertbl,
			Integer num, String remark) {
		this.id = id;
		this.menutbl = menutbl;
		this.ordertbl = ordertbl;
		this.num = num;
		this.remark = remark;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Menutbl getMenutbl() {
		return this.menutbl;
	}

	public void setMenutbl(Menutbl menutbl) {
		this.menutbl = menutbl;
	}

	public Ordertbl getOrdertbl() {
		return this.ordertbl;
	}

	public void setOrdertbl(Ordertbl ordertbl) {
		this.ordertbl = ordertbl;
	}

	public Integer getNum() {
		return this.num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}