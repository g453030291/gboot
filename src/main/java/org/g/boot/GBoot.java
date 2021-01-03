package org.g.boot;

import org.g.core.JsonResource;

import java.io.IOException;
import java.net.URL;

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
		JsonResource jsonResource = new JsonResource();
		jsonResource.getFile();
		URL url = Thread.currentThread().getContextClassLoader().getResource("application.json");
		System.out.println(url);
	}

}
