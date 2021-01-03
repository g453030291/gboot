package org.g;

/**
 * @author g
 * @date 2020/12/26 10:06 下午
 */
public class HandlerA extends Handler {
	@Override
	public boolean handler() {
		boolean handled = false;
		System.out.println("handlerA start");
		return handled;
//		if(!handled && successor != null){
//			successor.handler();
//		}
	}
}
