//package org.g.servlet;
//
//import javax.servlet.*;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * @author g
// * @date 2020/12/25 8:45 上午
// */
//public class GServlet extends HttpServlet {
//
//	@Override
//	public void init(ServletConfig config) throws ServletException {
//		super.init(config);
//	}
//
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("GServlet执行doGet");
//		System.out.println(req.getRequestURL());
//		super.doGet(req, resp);
//	}
//
//
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("GServlet执行doPost");
//
//		super.doPost(req, resp);
//	}
//
//
//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("GServlet执行service");
//		super.service(req, resp);
//	}
//
//}
