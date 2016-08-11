/*
 * ��Ʈ���� ����
 * ���⼺ - �Է�,���
 * �������� ���� :  ���ڱ��(2byte�� ��Ʈ��)
 * 						����Ʈ���(1byte�� ��Ʈ��)
 * 
 * ���� ��Ʈ�� �ǽ�
 * 
 * */

package com.sds.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DocumentReader {
	/*FileInputStream fis;
	FileOutputStream fos;*/
	FileReader fr;
	FileWriter fw;
	BufferedReader buf_rd; //���� ó���� ���ڱ�� �Է�
	BufferedWriter buf_wr; //���� ó���� ���ڱ�� ���
	
	String path = "C:/java_workspace/GUI0811/res/memo.txt";
	String dest = "C:/java_workspace/GUI0811/res/memo1.txt";
	

	public DocumentReader() {
		// TODO Auto-generated constructor stub
		
		
		try {
			//fis=new FileInputStream(path);
			fr = new FileReader(path);
			buf_rd = new BufferedReader(fr);
			//fos = new FileOutputStream(dest);
			fw = new FileWriter(dest);
			buf_wr = new BufferedWriter(fw);
			String data =null;
			while((data = buf_rd.readLine())!=null){
				System.out.print(data);
				buf_wr.write(data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(fw!=null){	
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fr!=null){
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DocumentReader();
	}

}