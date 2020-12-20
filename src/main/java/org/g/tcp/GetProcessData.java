package org.g.tcp;

import java.util.HashMap;
import java.util.Map;

/**
 * @author g
 * @date 2020/12/20 9:14 下午
 */
public class GetProcessData implements HttpProcessDataStrategy {
	@Override
	public HttpRequest processData(String str) {
		Map<String,String> map = new HashMap<>();
		System.out.println("http get收到请求,处理数据中...");
		String[] split = str.split("\r\n");
		for (int i=0;i < split.length;i++){
			//处理get请求中uri的数据
			if(i==0){
				String s = split[0].split(" ")[1];
				String s1 = s.substring(2,s.length());
				String[] split1 = s1.split("&");
				for (int j=0;j<split1.length;j++){
					int k = split1[i].indexOf("=");
					map.put(split1[i].substring(0,k),
							split1[i].substring(k+1,split1[i].length()));
				}
			}
		}
		System.out.println("数据为");
		for (Map.Entry entry:map.entrySet()){
			System.out.println(entry.getKey()+"---"+entry.getValue());
		}
		return null;
	}
}
