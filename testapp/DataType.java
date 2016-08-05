class DataType{
	/*
	변수데이터를 선언시 데이터용량 표시가 자료형

	1.문자 : char(2byte),  
	2.숫자 : byte(1byte) < short(2byte) < int(4byte) < long(8byte)
	3.논리값 : boolean
	*/

	public static void main(String[] args){
		char[] arr= new char[4];

		arr[0] ='대';
		arr[1] ='한';
		arr[2] ='민';
		arr[3] ='국';

		char[] arr2={'아','메','리','카'};

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
			System.out.println(arr2[i]);
		}	
	}
}