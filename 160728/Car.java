public class Car {
	int price=100;
	
	public static void main(String[] args) {
		int x=5; //A
		Car car = new Car(); //B
		{
			int y=3; //C
		}
		System.out.println(y);//D
		System.out.println(car);//E
	}//F
}
