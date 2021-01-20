package org.g.proxyDesign.cglibDynamicProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author g
 * @date 2021/1/19 10:33 下午
 */
public class CglibProxy implements MethodInterceptor {

	public Object getProxy(Class clazz){
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("cglib dynamic proxy before");
		Object invoke = proxy.invokeSuper(obj, args);
		System.out.println("cglib dynamic proxy after");
		return invoke;
	}
}
