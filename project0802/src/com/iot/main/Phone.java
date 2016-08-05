package com.iot.main;

public class Phone{

	private String name;
	private String type;
	private String tel;
  
	public Phone(String name){
		/**
			객체 인스턴스 생성시 초기화.			
		*/
		this.name = name;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

	public void setType(String type){
		this.type = type;
	}
	public String getType(){
		return type;
	}

	public void setTel(String tel){
		this.tel = tel;
	}
	public String getTel(){
		return tel;
	}

}