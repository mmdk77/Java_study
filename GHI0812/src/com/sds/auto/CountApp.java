/*
 * �������� ��Ƽ �½�ŷ
 * �ϳ��� ������ ���� ���ÿ� ���� ���μ����� �����Ű�� ��� - Multi-Tasking
 * 
 * Multi - Threading
 * �ϳ��� ���μ��������� ���������� ����ɼ��ִ� ���� ���� ����- ������
 * ������ ������ ����- ��Ƽ������
 * */

package com.sds.auto;

public class CountApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		MyThread mt = new MyThread();
		StarThread st = new StarThread();
		//JVM
		mt.start();
		st.start(); 
	}

}