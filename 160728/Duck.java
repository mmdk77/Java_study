public class Duck {
	int age=3; //A
	boolean fly; //B
	
	
	public static void main(String[] args){
		age=5;//C
		
		{
			int x=3;//D
			Duck d = new Duck(); //E
		}
		System.out.println(d.age);
	}
}
