/*
 * �ϳ��� ���μ��������� ���������� ���డ���� ���� �������- Thread
 * Thread Class��������
 * 
 * */

package com.sds.auto;

public class MyThread extends Thread{
	//���������� ������ �ڵ�� run()�޼��带 ������
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100000;i++){
			System.out.println(i);
		}
	}
}
