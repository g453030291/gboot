package org.g.proxyDesign.jdkDynamicProxy;

/**
 * @author g
 * @date 2021/1/19 9:40 下午
 */
public class TestMain {

	public static void main(String[] args) {
		UserServiceImpl service = new UserServiceImpl();
		MyInvocationHandler myInvocationHandler = new MyInvocationHandler(service);
		UserService userService = (UserService) myInvocationHandler.getProxy();
		userService.add();
	}

}
