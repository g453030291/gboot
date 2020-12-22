package org.g.tcp;

import org.g.http.HttpData;

/**
 * @author g
 * @date 2020/12/20 9:15 下午
 */
public class PostProcessData implements HttpProcessDataStrategy {
	@Override
	public HttpData processData(String str) {
		System.out.println("http post收到数据,处理中...");
		return null;
	}
}
