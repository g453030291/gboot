package org.g.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 基于servlet的容器(类tomcat)
 * @author g
 * @date 2020/12/13
 */
public class GBoot {

	/**
	 * 如何确定一个http请求结束？
	 * 如何区分两次http请求？
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
//		GServlet gServlet = new GServlet();
//
//		ServerSocket serverSocket = new ServerSocket(8888,2);
//		JsonResource jsonResource = new JsonResource();
//		jsonResource.getFile();
//		URL url = Thread.currentThread().getContextClassLoader().getResource("application.json");
//		System.out.println(url);

		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		Object book = context.getBean("book");
		System.out.println(book.toString());
	}

}
