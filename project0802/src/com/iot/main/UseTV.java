package com.iot.main;
class UseTV{
	
	public void showPrice(){
		Tv tv = new TV();
		tv.printPrice();
	}

	public void test(boolean b, int k){
		System.out.println(b+","+k);		
	}

	public void getInfo(TV tv, int k){
		System.out.println(tv.name);
		System.out.println(k);
	}

	public static void main(String[] args){
	
		UseTV ut = UseTV();
		ut.showPrice();
		ut.test(true,10);
		ut.getInfo("SBS",10);
	}
}