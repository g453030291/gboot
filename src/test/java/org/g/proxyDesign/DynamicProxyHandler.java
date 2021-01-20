package org.g.proxyDesign;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author g
 * @date 2021/1/19 7:22 上午
 */
public class DynamicProxyHandler implements InvocationHandler {

	private Object object;

	public DynamicProxyHandler(Object object) {
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("dynamic before..");
		Object invoke = method.invoke(object, args);
		System.out.println("dynamic after..");
		return invoke;
	}
}
