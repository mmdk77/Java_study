/*
 * Stream �̶�? �������� �帧
 * 
 * �з��� ���� 2����
 * 
 * 1.���⼺ - �������� ���α׷� ���� (���μ���) : �Է�(input)/���(output)
 * 
 * 2.������ ó����� - ����Ʈ��� ��Ʈ�� : 1byte�� ����
 * 							���ڱ�� ��Ʈ�� : 2byte�� ����. (����ǥ�� ����-�񿵾��)
 * 							���۱�� ��Ʈ�� : ������ ������ ���� �߰��Ҷ����� ���ۿ� ��Ƶ� �����͸� �о���̴� ��Ʈ��
 * 			
 * */

package com.sds.stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.BufferedReader;

public class KeyBoardStream {

	InputStream is;
	InputStreamReader reader;
	BufferedReader buffer;
	public KeyBoardStream() {
		// TODO Auto-generated constructor stub
		// Keyboard, ���ڵ彺ĳ�ʵ� �ý����� ������� ��Ʈ���� �����ڰ� ���ϴ� ������ ������� ���� X
		// ���� �ý������κ��� ���;��Ѵ�.
		is = System.in;
		reader = new InputStreamReader(is);
		buffer = new BufferedReader(reader);

			
		String data;
		int count=0;

		try {
			while (true) {
				data = buffer.readLine();
				
				System.out.println(data);
				count++;
				System.out.println("����Ƚ��"+count);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyBoardStream();
	}

}