package com.wireless.base.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
import com.wireless.base.service.BaseService;

/**
 * 基础服务类。向数据库进行操作
 * 抽象类，不能被实例化
 */

@Transactional
public abstract class BaseServiceImpl implements BaseService {

	@Resource
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	//通过id查找一个对象
	public Object findById(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession().load(clazz, id);
	}
	//删
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(obj);
	}

	//查
	public List getResult(String hql, Object[] parameters) {
		// TODO Auto-generated method stub
		
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		//注入?
		if(parameters!=null&&parameters.length>0){
			
			for(int i=0;i<parameters.length;i++){
				query.setParameter(i, parameters[i]);
			}
		}
		return query.list();
	}
	//增
	public void save(Object obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(obj);
	}
	//改
	public void update(Object obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(obj);
	}
	//分页
	public List getResultByPage(String hql,Object [] parameters,int pageNow,int pageSize){
		
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		
		if(parameters!=null && parameters.length>0){
			for(int i=0;i<parameters.length;i++){
				query.setParameter(i, parameters[i]);
			}
		}
		//体现分页
	    return query.setFirstResult((pageNow-1)*pageSize).setMaxResults(pageSize).list();
	}
	//查询并计算总共有几页
	public int queryPageCount(String hql, Object[] parameters, int pageSize) {
		//获取rowCount
		Object obj=this.uniqueQuery(hql, parameters);
		int rowCount=Integer.parseInt(obj.toString());
		return (rowCount-1)/pageSize+1;
	}
	
	public void delById(Class clazz,Serializable id) {
		// TODO Auto-generated method stub
		Session session=this.sessionFactory.getCurrentSession();
		session.delete(this.findById(clazz, id));
	}
	public Object uniqueQuery(String hql, Object[] parameters) {
		Query query=this.sessionFactory.getCurrentSession().createQuery(hql);
		if(parameters!=null && parameters.length>0){
			for(int i=0;i<parameters.length;i++){
				query.setParameter(i, parameters[i]);
			}
		}
		return query.uniqueResult();
	}
}
