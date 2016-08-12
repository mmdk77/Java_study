/*
 * 하나의 프로세스내에서 독립적으로 실행가능한 세부 실행단위- Thread
 * Thread Class에서지원
 * 
 * */

package com.sds.auto;

public class MyThread extends Thread{
	//독립적으로 수행할 코드는 run()메서드를 재정의
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100000;i++){
			System.out.println(i);
		}
	}
}
