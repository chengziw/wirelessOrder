package com.wirelsee.web.service;

import java.util.List;

import com.wireless.entity.Tabletbl;

public interface TableService {
	//����pageSize��pageNow��ʾ��Ϣ
	public List getTableList(int pageSize ,int pageNow);
	//��ȡҳ��
	public int getPageCount(int pageSize);
	//�ı�����Ͳ�״̬
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
