/*
 *자바의 GUI관련 API들은 JAVA.AWT패키지에 지원,
 *윈도우와 같은 컴포넌트들을 포함하는 객체는 배치 - 5가지의 배치관리자 실습. */

package gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;

public class BorderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Frame frame = new Frame();
			Button btn_north = new Button("North");
			Button btn_west = new Button("West");
			Button btn_center = new Button("Center");
			Button btn_east = new Button("East");
			Button btn_south = new Button("South");
			
			
			//borderLayout 적용
			BorderLayout b_layout = new BorderLayout();
			/*
			 * Window는 기본적으로 배치관리자가 적용되며,
			 * Frame default의 배치관리자는 BorderLayout
			 * 위치 지정 X, 배치위치의 default => CENTER;
			*/
			
			frame.setLayout(b_layout);
			
			//frame.add(btn_north,BorderLayout.NORTH);
			//frame.add(btn_west,BorderLayout.WEST);
			//frame.add(btn_center,BorderLayout.CENTER);
			//frame.add(btn_east,BorderLayout.EAST);
			//frame.add(btn_south,BorderLayout.SOUTH);
			
			btn_center.setPreferredSize(new Dimension(100, 50));
			frame.add(btn_center,BorderLayout.WEST);
			
			frame.setSize(300, 200);
			frame.setVisible(true);
			
	}

}
