package org.g.proxyDesign;

/**
 * @author g
 * @date 2021/1/18 10:29 下午
 */
public class IwantProxyed implements ProxyImpl{

	@Override
	public String dailifangfa() {
		System.out.println("做了一些什么事");
		return "做了一些什么事";
	}
}
