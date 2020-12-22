package org.g.tcp;

import org.g.http.HttpMethod;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.HashMap;

/**
 * 获取到请求类型,get post put delete option
 * 封装http请求头 请求体 参数
 * @author g
 * @date 2020/12/13 5:33 下午
 */
public class HttpHandle implements Runnable {

	private Socket socket;

	public HttpHandle(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		byte[] bytes = new byte[1024];
		StringBuilder sb = new StringBuilder();
		HttpRequest httpRequest = new HttpRequest();
		HttpRequest.Header header = new HttpRequest.Header();
		HashMap<String,String> map = new HashMap<String,String>();
		InputStream inputStream = null;
		int data;
		try {
			inputStream = socket.getInputStream();
			while ((data = inputStream.read(bytes)) != -1){
				sb.append(new String(bytes,0,data,"UTF-8"));
			}
			System.out.println(sb.toString());
			doGet(sb.toString());
			inputStream.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void doGet(String str){
		HttpProcessDataStrategy processDataStrategy = null;
		if(str.startsWith("GET")){
			processDataStrategy = ProcessDataFactory.getProcessDataStrategy(HttpMethod.GET);
		}else if(str.startsWith("POST")){
			processDataStrategy = ProcessDataFactory.getProcessDataStrategy(HttpMethod.POST);
		}else{

		}
		processDataStrategy.processData(str);
	}

//	private Map<String,String> doGet(String[] split){
//		GET /?aa=99 HTTP/1.1
//		Host: localhost:8888
//		Connection: keep-alive
//		sec-ch-ua: "Google Chrome";v="87", " Not;A Brand";v="99", "Chromium";v="87"
//		sec-ch-ua-mobile: ?0
//		Upgrade-Insecure-Requests: 1
//		User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36
//		Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9
//Sec-Fetch-Site: none
//Sec-Fetch-Mode: navigate
//Sec-Fetch-User: ?1
//Sec-Fetch-Dest: document
//Accept-Encoding: gzip, deflate, br
//Accept-Language: zh-CN,zh;q=0.9,en;q=0.8
//Cookie: Webstorm-47bc3066=5b3d46d2-5415-40ef-9c18-410f6d0fd04c
//		Map<String,String> map = new HashMap<String,String>();
//		for (int i = 0; i < split.length; i++) {
//			String param = split[0].split(" ")[1];
//			String param2 = param.substring(2,param.length());
//			String [] param3 = param2.split("&");
//			for (int j = 0; j < param3.length; j++) {
//				String[] param4 = param3[j].split("=");
//				map.put(param4[0],param4[1]);
//			}
//		}
//		return  map;
//	}

}
