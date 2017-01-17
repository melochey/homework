package com.server.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.net.SocketServer;
import org.junit.Test;

public class ImServer {
	public static Map<String,Socket> ids=new HashMap<>();
	@Test
	public void initServer() {
		ServerSocket server = null;
		Socket socket;
		try {
			server = new ServerSocket(1234);
			while(true){
				socket=server.accept();
				new RequestHandler(socket).start();//deal request
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
