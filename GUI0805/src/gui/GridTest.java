/* 
 * GridLayout 실습
 * Gird = 격자(row, col)형태
 *  */


package gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame();
		
		frame.setLayout(new GridLayout(4,5));
		
		Button[] btns = new Button[20];
		for(int i=0; i<btns.length; i++){
			btns[i] = new Button(i+"번째 버튼");
			frame.add(btns[i]);
		}
		
		frame.setSize(300, 400);
		frame.setVisible(true);
	}

}
