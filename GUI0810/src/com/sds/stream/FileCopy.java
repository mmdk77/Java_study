/*
������ �������� �ڹ� ���α׷����� �о�鿩
���ϴ� ���丮�� ���� == ����

�ڹ� - Input/Output ����� �����ϴ� ��Ű�� :  java.io

�ǽ� - ����� ����� ���� ����

����ó���� ����: ������������ ����
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