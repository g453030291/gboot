package org.g.boot;

import org.g.tcp.HttpHandle;

import java.io.IOException;
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
		while (true){
			Socket socket = serverSocket.accept();
			new Thread(new HttpHandle(socket)).start();
		}
	}

}
