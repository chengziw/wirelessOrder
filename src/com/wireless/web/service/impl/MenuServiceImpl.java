package com.wireless.web.service.impl;

import java.util.List;
import java.util.UUID;

import com.wireless.base.service.impl.BaseServiceImpl;
import com.wireless.entity.Menutbl;
import com.wireless.entity.Menutypetbl;
import com.wirelsee.web.service.MenuService;

public class MenuServiceImpl extends BaseServiceImpl implements MenuService {

	public List getMenuList(int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		String hql="from Menutbl order by id";
		return getResultByPage(hql, null, pageNow, pageSize);
	}

	public int getPageCount(int pageSize) {
		String hql="select count(*) from Menutbl";
		return this.queryPageCount(hql, null, pageSize);
	}

	public Menutbl getMenu(Integer id) {
		// TODO Auto-generated method stub
		Menutbl menu=(Menutbl)findById(Menutbl.class, id);
		return menu;
	}

	public boolean updMenu(Menutbl menu) {
		// TODO Auto-generated method stub
		Menutbl tbl=(Menutbl)findById(Menutbl.class, menu.getId());
		tbl.setMenutypetbl(menu.getMenutypetbl());
		tbl.setName(menu.getName());
		tbl.setPic(menu.getPic());
		tbl.setPrice(menu.getPrice());
		tbl.setRemark(menu.getRemark());
		try {
			update(tbl);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	public boolean delMenu(Integer id) {
		// TODO Auto-generated method stub
				try {
					delById(Menutbl.class, id);
					return true;
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				return false;
	}

	public boolean addMenu(Menutbl menu) {
		// TODO Auto-generated method stub
		try {
			save(menu);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	public Menutypetbl getMenuType(Integer id) {
		// TODO Auto-generated method stub
		Menutypetbl menuTypetbl=(Menutypetbl)findById(Menutypetbl.class, id);
		return menuTypetbl;
	}

	public List getMenuTypeList() {
		// TODO Auto-generated method stub
		String hql="from Menutypetbl order by id";
		return getResult(hql, null);
	}

	//使用uuid值代替原文件名
	public String getNewFileName(String fileName) {
		// TODO Auto-generated method stub
		//获取原文件的后缀名
		int beginIndex = fileName.lastIndexOf(".");
		/*
		 * subString(beginIndex,endIndex)-<--------> [beginIndex,endIndex)
		 */
		String newFileName = UUID.randomUUID()
				+ fileName.substring(beginIndex, fileName.length());
		return newFileName;
	}
}
