package com.iot.main;
/*
	About String class
*/
class UseString{
	public void test(String[] k){
		System.out.println(k.length);
		for(int i=0;i<k.length;i++){	
			System.out.println(k[i]);
		}
	}
	public static void main(String[] args){
		String s = "korea";
		String s1= new String("korea");
		String s2= new String("korea");
		String s3 = "korea";

		System.out.println(s.charAt(3));
		
		for (int i=0;i<s.length();i++ ){
			char c = s1.charAt(i);
			System.out.print(c);
		}
		System.out.println("\n");

		System.out.println(s1==s2);
		System.out.println(s==s1);
		System.out.println(s==s3);

		//APIȰ�� 5��.
		String str="korea java";
		System.out.println(str.charAt(3));
		System.out.println(str.substring(4));

		//
		System.out.println("����� �迭ũ��"+args.length);
		
		UseString us = new UseString();

		String[] arr = new String[3];
		arr[0]="���";
		arr[1]="����";
		arr[2]="����";

		us.test(arr);
	}
}