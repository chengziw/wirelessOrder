package com.wirelsee.web.service;

import java.util.List;

import com.wireless.entity.Ordertbl;

public interface OrderService {
	//����pageSize��pageNow��ʾ��Ϣ
	public List getOrderList(int pageNow ,int pageSize);
	//��ȡҳ��
	public int getPageCount(int pageSize);
	//�ı�����Ͳ�״̬
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
