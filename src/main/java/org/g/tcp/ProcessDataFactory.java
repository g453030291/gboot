package org.g.tcp;

import org.g.http.HttpMethod;

import java.util.HashMap;
import java.util.Map;

/**
 * 获取到对应处理http请求的类
 * @author g
 * @date 2020/12/20 9:16 下午
 */
public class ProcessDataFactory {

	private static Map<String,HttpProcessDataStrategy> httpMethodHttpProcessDataStrategyMap = new HashMap<>();

	static {
		httpMethodHttpProcessDataStrategyMap.put(HttpMethod.GET,new GetProcessData());
		httpMethodHttpProcessDataStrategyMap.put(HttpMethod.POST,new PostProcessData());
	}

	public static HttpProcessDataStrategy getProcessDataStrategy(HttpMethod method){
		return httpMethodHttpProcessDataStrategyMap.get(method);
	}

}
