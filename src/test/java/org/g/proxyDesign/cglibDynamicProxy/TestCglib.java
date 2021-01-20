package org.g.proxyDesign.cglibDynamicProxy;

/**
 * @author g
 * @date 2021/1/19 11:00 下午
 */
public class TestCglib {

	public static void main(String[] args) {

		CglibProxy proxy = new CglibProxy();
		UserService userService = (UserService) proxy.getProxy(UserService.class);
		userService.add();

	}
}
