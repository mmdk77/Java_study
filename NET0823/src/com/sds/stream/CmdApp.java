package com.sds.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CmdApp {
	
	ArrayList<String> list; 

	InputStream is;
	InputStreamReader reader;
	BufferedReader buffer;

	String data;

	public CmdApp() {
		// TODO Auto-generated constructor stub
		list = new ArrayList<String>();
		
		is = System.in;
		reader = new InputStreamReader(is);
		buffer = new BufferedReader(reader);

		try {
			System.out.println("���ϴ� �޴��� �����ϼ���");
			System.out.println("1.�Է�");
			System.out.println("2.��ȸ");
			while (true) {
				data = buffer.readLine();
				list.add(data);
				if (data.equals("1")) {
					System.out.println(data);
					System.out.println("���Ḧ ���Ͻø� exit or quit �� ġ����");
					if (data.equals("exit")) {
						System.exit(0);
						System.out.println("�����մϴ�.");
					}
				} else if (data.equals("2")) {
					System.out.println("��ȸ�� ������ �Է��ϼ���");
					data = buffer.readLine();
					if(data.equals(data)){
						for(int i=0; i<list.size(); i++){
							System.out.println(list.get(i));
							
						
							
						}
					}
				}
			
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CmdApp();
	}

}
















