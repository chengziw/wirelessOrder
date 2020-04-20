package com.wirelsee.web.service;

import java.util.List;

import com.wireless.entity.Tabletbl;

public interface TableService {
	//根据pageSize和pageNow显示信息
	public List getTableList(int pageSize ,int pageNow);
	//获取页数
	public int getPageCount(int pageSize);
	//改变餐桌就餐状态
	public boolean changeTableFlag(Integer id);
	//find a table
	public Tabletbl getATable(Integer id);
	//upd table
	public boolean updTable(Tabletbl table);
	//del table
	public boolean delTable(Integer id);
	//add table
	public boolean addTable(Tabletbl table);
}
