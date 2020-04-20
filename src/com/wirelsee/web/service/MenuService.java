package com.wirelsee.web.service;

import java.util.List;

import com.wireless.entity.Menutbl;
import com.wireless.entity.Menutypetbl;
import com.wireless.entity.Tabletbl;

public interface MenuService {
	// ����pageSize��pageNow��ʾ��Ϣ
	public List getMenuList(int pageNow, int pageSize);
	// ��ȡҳ��
	public int getPageCount(int pageSize);


	// find a menu
	public Menutbl getMenu(Integer id);

	// upd table
	public boolean updMenu(Menutbl menu);

	// del table
	public boolean delMenu(Integer id);

	// add table
	public boolean addMenu(Menutbl menu);
	
	//find menuType
	public Menutypetbl getMenuType(Integer id);
	
	//get munuType list
	public List getMenuTypeList();
	
	//get new filename
	public  String getNewFileName(String fileName);
}
