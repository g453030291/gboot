package org.g.b;

/**
 * @author g
 * @date 2020/12/27 9:09 下午
 */
public class Main {

	public static void main(String[] args) {
		HandlerChin handlerChin = new HandlerChin();
		handlerChin.addHandler(new HandlerA());
		handlerChin.addHandler(new HandlerB());

		handlerChin.handler();
	}

}
