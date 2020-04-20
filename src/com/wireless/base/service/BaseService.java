package com.wireless.base.service;

import java.io.Serializable;
import java.util.List;

public interface BaseService {
	
	//ͨ��һ��hql,�ʹ���Ĳ��������Ӧ�Ĳ�ѯ����
	public List getResult(String hql,Object [] parameters);
	//����һ������
	public void save(Object obj);
	//ɾ��һ������
	public void delete(Object obj);
	//����һ������
	public void update(Object obj);
	//���� id����һ������
	public Object findById(Class clazz,Serializable id);
	//ͨ��һ��hql�ͷ�ҳ�Ĳ�������ɷ�ҳ��ѯ
	public List getResultByPage(String hql,Object [] parameters,int pageNow,int PageSize);
	//��ѯ�������ܹ��м�ҳ
	public int queryPageCount(String hql, Object[] parameters, int pageSize);
	//����idɾ��һ������
	public void delById(Class clazz,Serializable id);
	//��ѯ��һ���
	public Object uniqueQuery(String hql, Object[] parameters) ;
	
	

}
