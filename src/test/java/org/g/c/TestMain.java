package org.g.c;

import java.util.ArrayList;
import java.util.List;

/**
 * @author g
 * @date 2021/1/16 2:49 下午
 */
public class TestMain {
	public static void main(String[] args) {
		List<Human> humans = new ArrayList<>();
		humans.add(new Boy());
		humans.add(new Girl());


		for (Human human:humans){
			System.out.println(human.eat());
		}
	}
}
