package use;

import com.iot.main.Phone;

class UsePhone{
	public static void main(String[] args){
		Phone p = new Phone("�ַ���");
		p.setName("������");
		p.setType("����Ʈ��");
		p.setTel("KT");

	
		System.out.println(p.getName());
		System.out.println(p.getType());
		System.out.println(p.getTel());
	}
}
