package use;

import com.iot.main.Phone;

class UsePhone{
	public static void main(String[] args){
		Phone p = new Phone("겔럭시");
		p.setName("아이폰");
		p.setType("스마트폰");
		p.setTel("KT");

	
		System.out.println(p.getName());
		System.out.println(p.getType());
		System.out.println(p.getTel());
	}
}
