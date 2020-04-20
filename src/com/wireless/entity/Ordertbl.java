package com.wireless.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Ordertbl entity. @author MyEclipse Persistence Tools
 */

public class Ordertbl implements java.io.Serializable {

	// Fields

	private Integer id;
	private Tabletbl tabletbl;
	private String orderTime;
	private Integer userId;
	private Integer personNum;
	private Integer idPay;
	private String remark;
	private Set orderdetailtbls = new HashSet(0);

	// Constructors

	/** default constructor */
	public Ordertbl() {
	}

	/** minimal constructor */
	public Ordertbl(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Ordertbl(Integer id, Tabletbl tabletbl, String orderTime,
			Integer userId, Integer personNum, Integer idPay, String remark,
			Set orderdetailtbls) {
		this.id = id;
		this.tabletbl = tabletbl;
		this.orderTime = orderTime;
		this.userId = userId;
		this.personNum = personNum;
		this.idPay = idPay;
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

	public Tabletbl getTabletbl() {
		return this.tabletbl;
	}

	public void setTabletbl(Tabletbl tabletbl) {
		this.tabletbl = tabletbl;
	}

	public String getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getPersonNum() {
		return this.personNum;
	}

	public void setPersonNum(Integer personNum) {
		this.personNum = personNum;
	}

	public Integer getIdPay() {
		return this.idPay;
	}

	public void setIdPay(Integer idPay) {
		this.idPay = idPay;
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