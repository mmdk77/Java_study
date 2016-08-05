package use;

import office.Desk;
class UseDesk{
	public static void main(String[] args){
		Desk desk = new Desk();
		desk.print();
		System.out.println(desk.name);
	}
}