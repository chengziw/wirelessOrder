package com.wireless.base.service;

import java.io.Serializable;
import java.util.List;

public interface BaseService {
	
	//通过一个hql,和传入的参数完成相应的查询任务
	public List getResult(String hql,Object [] parameters);
	//保存一个对象
	public void save(Object obj);
	//删除一个对象
	public void delete(Object obj);
	//更新一个对象
	public void update(Object obj);
	//根据 id返回一个对象
	public Object findById(Class clazz,Serializable id);
	//通过一个hql和分页的参数来完成分页查询
	public List getResultByPage(String hql,Object [] parameters,int pageNow,int PageSize);
	//查询并计算总共有几页
	public int queryPageCount(String hql, Object[] parameters, int pageSize);
	//根据id删除一个对象
	public void delById(Class clazz,Serializable id);
	//查询单一结果
	public Object uniqueQuery(String hql, Object[] parameters) ;
	
	

}
