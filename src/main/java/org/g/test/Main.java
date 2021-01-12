package org.g.test;

import java.util.ServiceLoader;

/**
 * @author g
 * @date 2021/1/8 10:31 上午
 */
public class Main {

	public static void main(String[] args) {

		ServiceLoader<IShout> iShouts = ServiceLoader.load(IShout.class);
		for (IShout s:iShouts){
			s.shout();
		}

	}

}
