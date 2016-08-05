class Dog{

	String name="BBomi";

	/*
		인스턴스 초기화 블럭
		-Class 인스턴스가 있을때마다 영역이 수행됨
		*/
		
		{
			System.out.println("인스턴스 초기화 블럭수행");
		}
		static{
			System.out.println("static 초기화");
		}
	

	public static void main(String[] args){
		new Dog();
		Dog dog = new Dog();	
	}
}