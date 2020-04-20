package com.wireless.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.wirelsee.web.service.OrderService;
import com.wirelsee.web.service.TableService;

@SuppressWarnings("unchecked")
public class OrderServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/xml;charset=utf-8");
		//ie禁用缓存
		response.setHeader("Cache-Control", "no-cache"); 
		
		PrintWriter out = response.getWriter();  
		
		// 获取spring容器
		WebApplicationContext ctx = WebApplicationContextUtils
				.getWebApplicationContext(this.getServletContext());
		// 从spring容器中，取出了 TableService 类型的bean
		OrderService orderService=(OrderService)ctx.getBean("orderService");
		String oid=request.getParameter("oid");
		String delid=request.getParameter("delid");
		Integer id=0;
		if(oid!=null){
			id=Integer.parseInt(oid);
			//更改状态
			orderService.changeOrderPayFlag(id);
		}
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}
}
