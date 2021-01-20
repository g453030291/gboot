package org.g.proxyDesign;

/**
 * @author g
 * @date 2021/1/18 10:49 下午
 */
public class MainTest {

	public static void main(String[] args) {
		//接口代理
//		IwantProxyedProxy iwantProxyedProxy = new IwantProxyedProxy(new IwantProxyed());
//		iwantProxyedProxy.dailifangfa();

//		IwantProxyed iwantProxyed = new IwantProxyed();
//		iwantProxyed.dailifangfa();
		//继承代理
//		ExtendProxy extendProxy = new ExtendProxy();
//		extendProxy.dailifangfa();
		//动态代理
		IwantDynamicProxy iwantDynamicProxy = new IwantDynamicProxy();
		Object proxy = iwantDynamicProxy.createProxy(new IwantProxyed());
		System.out.println(proxy instanceof IwantProxyed);
		System.out.println(((IwantProxyed) proxy).dailifangfa());

	}

}
