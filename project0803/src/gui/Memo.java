package gui;

import java.awt.Frame;
import java.awt.MenuBar;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.TextArea;
class Memo{

	public static void main(String[] args){
		//�޸��� ������ ����
		Frame frame = new Frame();
		
		
		//�޴��� ����
		MenuBar bar = new MenuBar();
		//�޴���
		String[] menuTitle={"����","����","����","����","����"};
		Menu[] menus = new Menu[5];
		for(int i=0;i<5 ;i++ ){
			menus[i] = new Menu(menuTitle[i]);
			bar.add(menus[i]);
		}
		//�������� �޴��� ����
		frame.setMenuBar(bar);

		
		//�޴������۵�
		String[] temTitle={"���θ����","����","�ٸ� �̸����� ����","������ ����","�μ�","������"};
		MenuItem[] menuTem = new MenuItem[6];
		for(int i=0;i<menuTem.length ;i++ ){
			menuTem[i] = new Menu(temTitle[i]);
			menus[0].add(menuTem[i]);
		}

		//TextArea
		TextArea area = new TextArea(30,40);
		frame.add(area);

		//Visible
		frame.setSize(600,500);
		frame.setVisible(true);
	}
}