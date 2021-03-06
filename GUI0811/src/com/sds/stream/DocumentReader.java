/*
 * 스트림의 종류
 * 방향성 - 입력,출력
 * 문자지원 여부 :  문자기반(2byte씩 스트림)
 * 						바이트기반(1byte씩 스트림)
 * 
 * 문자 스트림 실습
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
	BufferedReader buf_rd; //버퍼 처리된 문자기반 입력
	BufferedWriter buf_wr; //버퍼 처리된 문자기반 출력
	
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
