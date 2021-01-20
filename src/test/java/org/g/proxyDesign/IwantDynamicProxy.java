package org.g.proxyDesign;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author g
 * @date 2021/1/19 7:27 上午
 */
public class IwantDynamicProxy {

	private IwantProxyed iwantProxyed;

	public IwantDynamicProxy() {
		this.iwantProxyed = new IwantProxyed();
	}

	public Object createProxy(Object proxyObject){
		Class<?>[] interfaces = proxyObject.getClass().getInterfaces();
		DynamicProxyHandler dynamicProxyHandler = new DynamicProxyHandler(interfaces);
		return Proxy.newProxyInstance(proxyObject.getClass().getClassLoader(),interfaces,dynamicProxyHandler);
	}

	private class DynamicProxyHandler implements InvocationHandler {

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
}
