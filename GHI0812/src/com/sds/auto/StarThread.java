package com.sds.auto;

public class StarThread extends Thread{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=0 ;i<100000;i++){
				System.out.println("¡Ú");
			}
		}
}
