package org.g.proxyDesign;

/**
 * @author g
 * @date 2021/1/18 10:51 下午
 */
public class IwantProxyedProxy implements ProxyImpl {

	private IwantProxyed iwantProxyed;

	public IwantProxyedProxy(IwantProxyed iwantProxyed) {
		this.iwantProxyed = iwantProxyed;
	}

	@Override
	public String dailifangfa() {
		System.out.println("代理类在代理方法前做一些事");
		String result = iwantProxyed.dailifangfa();
		System.out.println("代理类在代理方法后做一些事");
		return result;
	}
}
