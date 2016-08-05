package music;

class FinalTest{
	static int a=3;
	//final int b=5;
	int c=5;


	public static void main(String[] args){
		//FinalTest ft = new FinalTest();
		final int b=5; //이후 문장에서 더이상 변경 X
		b=10;
		
	}
}