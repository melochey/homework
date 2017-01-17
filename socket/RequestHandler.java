package com.server.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

import org.hamcrest.core.Is;

public class RequestHandler extends Thread {
	
	private Socket s;
	
	public RequestHandler(Socket s){
		this.s=s;
	}
	
	public void run(){
		try {
			InputStream in=s.getInputStream();
			InputStreamReader reader=new InputStreamReader(in);
			BufferedReader bf=new BufferedReader(reader);
			String str;
			while((str=bf.readLine())!=null){
				System.out.println("client words:"+str);
			}
			OutputStream out=s.getOutputStream();
			PrintWriter write=new PrintWriter(out);
			write.write("200 received!");
			write.flush();
			write.close();
			out.close();
			bf.close();
			reader.close();
			in.close();
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
