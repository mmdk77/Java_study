package use;

import com.iot.main.Account;

class UseAccount{
	public static void main(String[] args){
		Account acc = new Account();

		System.out.println("�Ѿ� : "+acc.getTotal());
		acc.setTotal("780,000");
		System.out.println("�Ѿ� : "+acc.getTotal());
	}
}