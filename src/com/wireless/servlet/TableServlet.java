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

import com.wirelsee.web.service.TableService;

@SuppressWarnings("unchecked")
public class TableServlet extends HttpServlet {

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
		TableService tableService = (TableService) ctx.getBean("tableService");
		String tid=request.getParameter("tid");
		String delid=request.getParameter("delid");
		Integer id=0;
		if(tid!=null){
			id=Integer.parseInt(tid);
			//更改状态
			tableService.changeTableFlag(id);
		}
		if(delid!=null){
			id=Integer.parseInt(delid);
			//删除
			tableService.delTable(id);
		}
		System.out.println(id);

		
	
		

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}
}
