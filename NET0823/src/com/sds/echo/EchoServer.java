package com.sds.echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	ServerSocket server;
	Socket client;
	int port = 7777;
	
	BufferedReader buf_reader;
	BufferedWriter buf_writer;
	
	public EchoServer() {
		// TODO Auto-generated constructor stub
		try {
			server = new ServerSocket(port);
			System.out.println("��������");
			server.accept(); //������ ����
			
			client  = server.accept();
			System.out.println("������ �߰�");
			String ip =client.getInetAddress().getHostAddress();
			System.out.println(ip+"�ȳ�?");
			
			buf_reader= new BufferedReader(new InputStreamReader(client.getInputStream()));
			buf_writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			String data = null;
			while(true){
				data = buf_reader.readLine();
				System.out.println(data);
				buf_writer.write(data+"\n"); //\n�� buffer�� ������ ���� ����
				buf_writer.flush();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(server!=null){
				try {
					server.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EchoServer();
	}

}