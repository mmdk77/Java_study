class Dog{

	String name="BBomi";

	/*
		�ν��Ͻ� �ʱ�ȭ ��
		-Class �ν��Ͻ��� ���������� ������ �����
		*/
		
		{
			System.out.println("�ν��Ͻ� �ʱ�ȭ ������");
		}
		static{
			System.out.println("static �ʱ�ȭ");
		}
	

	public static void main(String[] args){
		new Dog();
		Dog dog = new Dog();	
	}
}