package com.wirelsee.web.service;

import com.wireless.entity.Usertbl;

public interface UserService {
	
	//��֤�û���¼�������ȷ���򷵻�User�������򷵻�NUll
	public Usertbl checkUser(Usertbl user);
	
	//�����û���������
	public boolean updUser(Usertbl user);
	
	//�����û�����
	public boolean updUserPwd(Usertbl user);

}
