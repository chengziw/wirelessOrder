package com.wireless.web.service.impl;

import java.util.List;

import com.wireless.base.service.impl.BaseServiceImpl;
import com.wireless.entity.Tabletbl;
import com.wirelsee.web.service.TableService;

public class TableServiceImpl extends BaseServiceImpl implements TableService {
	//根据pageSize和pageNow显示信息
	public List getTableList(int pageNow, int pageSize) {
		String hql="from Tabletbl order by id";
		return getResultByPage(hql, null, pageNow, pageSize);
	}
	
	public int getPageCount(int pageSize){	
		String hql="select count(*) from Tabletbl";
		return this.queryPageCount(hql, null, pageSize);
	}

	//改变餐桌就餐状态
	public boolean changeTableFlag(Integer id) {
		Tabletbl table=(Tabletbl)findById(Tabletbl.class,id);
		if(table.getFlag().equals("1")){
			table.setFlag("0");
		}else{
			table.setFlag("1");
		}
		try{
			update(table);
			return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	public Tabletbl getATable(Integer id) {
		Tabletbl table=(Tabletbl)findById(Tabletbl.class, id);
		return table;
	}

	public boolean updTable(Tabletbl table) {
		// TODO Auto-generated method stub
		Tabletbl tbl=(Tabletbl)findById(Tabletbl.class, table.getId());
		tbl.setDescription(table.getDescription());
		tbl.setFlag(table.getFlag());
		tbl.setNum(table.getNum());
		tbl.setOrdId(table.getOrdId());
		try {
			update(tbl);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	public boolean delTable(Integer id) {
		// TODO Auto-generated method stub
		try {
			delById(Tabletbl.class, id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	public boolean addTable(Tabletbl table) {
		// TODO Auto-generated method stub
		try {
			save(table);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
}
