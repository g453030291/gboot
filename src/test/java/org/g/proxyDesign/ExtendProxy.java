package org.g.proxyDesign;

/**
 * @author g
 * @date 2021/1/18 11:07 下午
 */
public class ExtendProxy extends IwantProxyed {

	private IwantProxyed iwantProxyed;

	public ExtendProxy() {
		this.iwantProxyed = new IwantProxyed();
	}

	@Override
	public String dailifangfa() {
		System.out.println("继承代理之前。。。");
		String result = iwantProxyed.dailifangfa();
		System.out.println("继承代理之后。。。");
		return result;
	}


}
