/*
사진을 실행중인 자바 프로그램으로 읽어들여
원하는 디렉토리에 복원 == 복사

자바 - Input/Output 기능을 지원하는 패키지 :  java.io

실습 - 입출력 기능중 파일 관련

예외처리의 목적: 비정상종료의 방지
*/
package com.sds.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class FileCopy{

	FileInputStream fs;
	FileOutputStream fos;
	String filePath = "C:/java_workspace/GUI0810/res/taeyeon1.jpg";
	String dest="C:/java_workspace/GUI0810/res/taeyeon_copy.jpg";
	
	public FileCopy(){
		try{
			fs = new FileInputStream(filePath);			
			fos = new FileOutputStream(dest);
			int data;
			while((data=fs.read())!=-1){
				data=fs.read();//1byte 
				System.out.println(data);
				fos.write(data);
				
			}
		}catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}finally{
			if(fos!=null){		
				try{
					fos.close();
				}catch(IOException ioe){
					ioe.printStackTrace();
				}
			}
			if(fs!=null){		
				try{
					fs.close();
				}catch(IOException ioe){
					ioe.printStackTrace();
				}
			}
		}

		
	}

	public static void main(String[] args){
		new FileCopy();	
	}
}