package org.g.boot;

import org.g.tcp.HttpHandle;
import org.g.tcp.HttpMethod;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author g
 * @date 2020/12/13
 */
public class GBoot {

	/**
	 * 如何确定一个http请求结束？
	 * 如何区分两次http请求？
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(8888,2);
		Socket socket = serverSocket.accept();
		byte[] bytes = new byte[1024];
		StringBuilder sb = new StringBuilder();
		InputStream inputStream = socket.getInputStream();
		int len = 0;
		while ((len = inputStream.read(bytes)) != -1){
			sb.append(new String(bytes,0,len,"UTF-8"));
			System.out.println(sb.toString());
		}
		String[] split = sb.toString().split("\r\n");
		if(split[0].startsWith(HttpMethod.GET.toString())){
			HttpHandle.doGet(split);
		}

		System.out.println(split.length);
		System.out.println(split[split.length-1]);
		inputStream.close();
		socket.close();
		serverSocket.close();
	}

}
