/*
 * 윈도우의 멀티 태스킹
 * 하나의 윈도우 내에 동시에 여러 프로세스를 실행시키는 방법 - Multi-Tasking
 * 
 * Multi - Threading
 * 하나의 프로세스내에서 독립적으로 실행될수있는 세부 실행 단위- 쓰레드
 * 쓰래드 여러개 수행- 멀티쓰레딩
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
