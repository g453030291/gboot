package org.g.b;

/**
 * @author g
 * @date 2020/12/26 10:20 下午
 */
public class HandlerB extends Handler {
	@Override
	public boolean handler() {
		boolean handled = false;
		System.out.println("handlerB start");
		return handled;
//		if(!handled && successor != null){
//			successor.handler();
//		}
	}
}
