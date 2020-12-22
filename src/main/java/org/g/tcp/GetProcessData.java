package org.g.tcp;

import org.g.http.HttpData;

import java.util.HashMap;

/**
 * @author g
 * @date 2020/12/20 9:14 下午
 */
public class GetProcessData implements HttpProcessDataStrategy {
	@Override
	public HttpData processData(String str) {
		HttpData data = new HttpData();
		HashMap<String,Object> map = new HashMap<String,Object>();
		System.out.println("http get收到请求,处理数据中...");
		String[] split = str.split("\r\n");
		for (int i=0;i < split.length;i++){
			//处理get请求中uri的数据
			if(i==0){
				String[] str_array = split[0].split(" ");
				String s = str_array[1];
				String s1 = s.substring(2,s.length());
				String[] split1 = s1.split("&");
				for (int j=0;j<split1.length;j++){
					int k = split1[i].indexOf("=");
					map.put(split1[i].substring(0,k),
							split1[i].substring(k+1,split1[i].length()));
				}
				data.setMethod(str_array[0]);
				data.setVersion(str_array[2]);
			}
			if(data.getHost()==null){
				if(split[i].startsWith("HOST")){
					split[i].
					data.setHost(null);
				}
			}
		}
		data.setParam(map);
		return null;
	}
}
