package com.wirelsee.web.service;

import java.util.List;

import com.wireless.entity.Ordertbl;

public interface OrderService {
	//根据pageSize和pageNow显示信息
	public List getOrderList(int pageNow ,int pageSize);
	//获取页数
	public int getPageCount(int pageSize);
	//改变餐桌就餐状态
	public boolean changeOrderPayFlag(Integer id);
	//find a order
	public Ordertbl getOrder(Integer id);
	//upd order
	public boolean updOrder(Ordertbl order);
	//del order
	public boolean delOrder(Integer id);
	//add order
	public boolean addOrder(Ordertbl order);
	//
	public List getTableList();
	//
	public List getMenuList();
}
