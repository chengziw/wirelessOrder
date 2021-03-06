/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.wireless.web.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.wireless.entity.Usertbl;
import com.wireless.web.forms.UserForm;
import com.wirelsee.web.service.UserService;

/** 
 * MyEclipse Struts
 * Creation date: 08-15-2013
 * 
 * XDoclet definition:
 * @struts.action validate="true"
 */
public class LoginAction extends DispatchAction {

	
	private UserService userService;
	

	public UserService getUserService() {
		return userService;
	}


	public void setUserService(UserService userService) {
		System.out.println("setUserService---------");
		this.userService = userService;
	}


	public ActionForward login(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		//获取表单内容
		UserForm userForm=(UserForm)form;
		//获取输入验证码
		String validateCode = userForm.getValidateCode();
		//获取当前图片验证码
		String validateCodesession = (String) request.getSession().getAttribute("validateCode");
		if(!validateCode.equals(validateCodesession)){
			return mapping.findForward("loginErr");
		}
		Usertbl user=new Usertbl();
		user.setUsername(userForm.getUname());
		user.setPassword(userForm.getPassword());
//		System.out.println(user.getUsername()+" : "+user.getPassword());
//		if(userService==null){
//			System.out.println("null");
//		}else{
//			System.out.println("not--null");
//		}
		user=userService.checkUser(user);
		if(user!=null){
			//登录成功
			//将user放入session对象
			request.getSession().setAttribute("user", user);
			return mapping.findForward("loginOK");
		}else{
			return mapping.findForward("loginErr");
		}
	}
	public ActionForward logout(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
			
			
		//清空所有session
		request.getSession().invalidate();
		
		//清空一个session
//		request.getSession().removeAttribute("name");
		
//		request.removeAttribute("user");
	
		return mapping.findForward("logout");
		
	}
}