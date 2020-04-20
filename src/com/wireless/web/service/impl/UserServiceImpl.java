package com.wireless.web.service.impl;


import java.util.List;

import com.wireless.base.service.impl.BaseServiceImpl;
import com.wireless.entity.Usertbl;
import com.wirelsee.web.service.UserService;

public class UserServiceImpl extends BaseServiceImpl implements UserService {

	//��֤�û���¼
	public Usertbl checkUser(Usertbl user) {
		// TODO Auto-generated method stub
		String hql="from Usertbl where username=? and password=?";
		Object [] paras={user.getUsername(),user.getPassword()};
		List<Usertbl> list= getResult(hql, paras);
		if(list.size()==1){
			return list.get(0);
		}else{
			return null;
		}
	}
	//�����û���������
	public boolean updUser(Usertbl user) {
		//��ȡҪ���ĵ�obj
		Usertbl user1=(Usertbl) findById(Usertbl.class, user.getId());
		user1.setGender(user.getGender());
		user1.setName(user.getName());
		user1.setPermission(user.getPermission());
		user1.setRemark(user.getRemark());
		user1.setUsername(user.getUsername());
		try{
			update(user1);
			return true;
		}catch(Exception e){
			e.printStackTrace();	
		}
		return false;
	}
	//�����û�����
	public boolean updUserPwd(Usertbl user) {
		//��ȡҪ���ĵ�obj
		Usertbl user1=(Usertbl) findById(Usertbl.class, user.getId());
		user1.setPassword(user.getPassword());
		try{
			update(user1);
			return true;
		}catch(Exception e){
			e.printStackTrace();	
		}
		return false;
	}

}
