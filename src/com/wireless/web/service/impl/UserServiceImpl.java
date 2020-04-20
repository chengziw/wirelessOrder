package com.wireless.web.service.impl;


import java.util.List;

import com.wireless.base.service.impl.BaseServiceImpl;
import com.wireless.entity.Usertbl;
import com.wirelsee.web.service.UserService;

public class UserServiceImpl extends BaseServiceImpl implements UserService {

	//验证用户登录
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
	//更改用户基本资料
	public boolean updUser(Usertbl user) {
		//获取要更改的obj
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
	//更改用户密码
	public boolean updUserPwd(Usertbl user) {
		//获取要更改的obj
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
