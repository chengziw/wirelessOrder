package com.wirelsee.web.service;

import com.wireless.entity.Usertbl;

public interface UserService {
	
	//验证用户登录，如果正确，则返回User，错误则返回NUll
	public Usertbl checkUser(Usertbl user);
	
	//更改用户基本资料
	public boolean updUser(Usertbl user);
	
	//更改用户密码
	public boolean updUserPwd(Usertbl user);

}
