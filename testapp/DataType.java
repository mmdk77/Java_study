class DataType{
	/*
	���������͸� ����� �����Ϳ뷮 ǥ�ð� �ڷ���

	1.���� : char(2byte),  
	2.���� : byte(1byte) < short(2byte) < int(4byte) < long(8byte)
	3.���� : boolean
	*/

	public static void main(String[] args){
		char[] arr= new char[4];

		arr[0] ='��';
		arr[1] ='��';
		arr[2] ='��';
		arr[3] ='��';

		char[] arr2={'��','��','��','ī'};

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
			System.out.println(arr2[i]);
		}	
	}
}