package org.g.proxyDesign.jdkDynamicProxy;

/**
 * @author g
 * @date 2021/1/19 8:46 上午
 */
public class UserServiceImpl implements UserService {
	@Override
	public String add() {
		System.out.println("add方法执行");
		return "add方法执行";
	}
}
