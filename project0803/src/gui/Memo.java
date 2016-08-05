package gui;

import java.awt.Frame;
import java.awt.MenuBar;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.TextArea;
class Memo{

	public static void main(String[] args){
		//메모장 윈도우 선언
		Frame frame = new Frame();
		
		
		//메뉴바 선언
		MenuBar bar = new MenuBar();
		//메뉴들
		String[] menuTitle={"파일","편집","서식","보기","도움말"};
		Menu[] menus = new Menu[5];
		for(int i=0;i<5 ;i++ ){
			menus[i] = new Menu(menuTitle[i]);
			bar.add(menus[i]);
		}
		//윈도우의 메뉴바 부착
		frame.setMenuBar(bar);

		
		//메뉴아이템들
		String[] temTitle={"새로만들기","저장","다른 이름으로 저장","페이지 설정","인쇄","끝내기"};
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