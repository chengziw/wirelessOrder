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
 * ���������ࡣ�����ݿ���в���
 * �����࣬���ܱ�ʵ����
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
	
	//ͨ��id����һ������
	public Object findById(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession().load(clazz, id);
	}
	//ɾ
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(obj);
	}

	//��
	public List getResult(String hql, Object[] parameters) {
		// TODO Auto-generated method stub
		
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		//ע��?
		if(parameters!=null&&parameters.length>0){
			
			for(int i=0;i<parameters.length;i++){
				query.setParameter(i, parameters[i]);
			}
		}
		return query.list();
	}
	//��
	public void save(Object obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(obj);
	}
	//��
	public void update(Object obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(obj);
	}
	//��ҳ
	public List getResultByPage(String hql,Object [] parameters,int pageNow,int pageSize){
		
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		
		if(parameters!=null && parameters.length>0){
			for(int i=0;i<parameters.length;i++){
				query.setParameter(i, parameters[i]);
			}
		}
		//���ַ�ҳ
	    return query.setFirstResult((pageNow-1)*pageSize).setMaxResults(pageSize).list();
	}
	//��ѯ�������ܹ��м�ҳ
	public int queryPageCount(String hql, Object[] parameters, int pageSize) {
		//��ȡrowCount
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
