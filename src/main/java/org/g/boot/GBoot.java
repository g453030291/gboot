//package org.g.boot;
//
//import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import java.io.IOException;
//
///**
// * 基于servlet的容器(类tomcat)
// * @author g
// * @date 2020/12/13
// */
//public class GBoot {
//
//	/**
//	 * //		GServlet gServlet = new GServlet();
//	 * //
//	 * //		ServerSocket serverSocket = new ServerSocket(8888,2);
//	 * //		JsonResource jsonResource = new JsonResource();
//	 * //		jsonResource.getFile();
//	 * //		URL url = Thread.currentThread().getContextClassLoader().getResource("application.yaml");
//	 * //		System.out.println(url);
//	 * 如何确定一个http请求结束？
//	 * 如何区分两次http请求？
//	 * @param args
//	 * @throws IOException
//	 */
//	public static void main(String[] args) throws IOException {
//
//		AbstractApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
////		ExtendFactory extend = (ExtendFactory)context.getBean("extend");
////		context.addBeanFactoryPostProcessor(extend);
//		Object book = context.getBean("book");
//		System.out.println(book.toString());
//		Object book4 = context.getBean("book4");
//		System.out.println(book4);
//
//	}
//
//}
