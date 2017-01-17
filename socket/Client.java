package com.server.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import org.junit.Test;

public class Client {
	@Test
	public void testClient(){
		for(int i=0;i<100;i++){
			sendClient();
		}
	}
	public void sendClient(){
		try {
			Socket socket=new Socket("localhost", 1234);
			//�ͻ���
			//1�������ͻ���Socket��ָ����������ַ�Ͷ˿�
			//2����ȡ���������������˷�����Ϣ
			OutputStream os = socket.getOutputStream();//�ֽ������
			PrintWriter pw =new PrintWriter(os);//���������װ�ɴ�ӡ��
			pw.write("�û�����admin��\n���룺123");
			pw.flush();
			socket.shutdownOutput();
			//3����ȡ������������ȡ�������˵���Ӧ��Ϣ
			InputStream is = socket.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String info = null;
			while((info=br.readLine())!=null){
			 System.out.println("���ǿͻ��ˣ�������˵��"+info);
			}
			//4���ر���Դ
			br.close();
			is.close();
			pw.close();
			os.close();
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
