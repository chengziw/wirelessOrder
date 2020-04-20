package com.wireless.web.service.impl;

import java.util.List;

import com.wireless.base.service.impl.BaseServiceImpl;
import com.wireless.entity.Ordertbl;
import com.wireless.entity.Tabletbl;
import com.wirelsee.web.service.OrderService;
import com.wirelsee.web.service.TableService;

public class OrderServiceImpl extends BaseServiceImpl implements OrderService {
	//根据pageSize和pageNow显示信息
	public List getOrderList(int pageNow, int pageSize) {
		String hql="from Ordertbl order by id";
		return getResultByPage(hql, null, pageNow, pageSize);
	}
	
	public int getPageCount(int pageSize){	
		String hql="select count(*) from Ordertbl";
		return this.queryPageCount(hql, null, pageSize);
	}

	
	public boolean changeOrderPayFlag(Integer id) {
		Ordertbl order=(Ordertbl)findById(Ordertbl.class,id);
		if(order.getIdPay().equals(1)){
			order.setIdPay(0);
		}else{
			order.setIdPay(1);
		}
		try{
			update(order);
			return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	public Ordertbl getOrder(Integer id) {
		Ordertbl order=(Ordertbl)findById(Ordertbl.class,id);
		return order;
	}

	public boolean updOrder(Ordertbl order) {
		// TODO Auto-generated method stub
		Ordertbl tbl=(Ordertbl)findById(Ordertbl.class,order.getId());
//		tbl.setDescription(table.getDescription());
//		tbl.setFlag(table.getFlag());
//		tbl.setNum(table.getNum());
//		tbl.setOrdId(table.getOrdId());
		try {
			update(tbl);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	public boolean delOrder(Integer id) {
		// TODO Auto-generated method stub
		try {
			delById(Ordertbl.class, id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	public boolean addOrder(Ordertbl order) {
		// TODO Auto-generated method stub
		try {
			save(order);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	public List getTableList() {
		// TODO Auto-generated method stub
		String hql="from Tabletbl order by id";
		return getResult(hql, null);
	}

	public List getMenuList() {
		// TODO Auto-generated method stub
		String hql="from Menutbl order by id";
		return getResult(hql, null);
	}


}
