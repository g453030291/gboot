package org.g.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
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
		InputStream inputStream = null;
		try {
			inputStream = socket.getInputStream();
			int len = 0;
			while ((len = inputStream.read(bytes)) != -1){
				sb.append(new String(bytes,0,len,"UTF-8"));
				System.out.println(sb.toString());
			}
			String[] split = sb.toString().split("\r\n");
			if(split[0].startsWith(HttpMethod.GET.toString())){
				doGet(split);
			}
			inputStream.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 执行get请求
	 * @param split
	 */
	private void doGet(String[] split){
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
	}

}
