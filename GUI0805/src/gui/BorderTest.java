/*
 *�ڹ��� GUI���� API���� JAVA.AWT��Ű���� ����,
 *������� ���� ������Ʈ���� �����ϴ� ��ü�� ��ġ - 5������ ��ġ������ �ǽ�. */

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
			
			
			//borderLayout ����
			BorderLayout b_layout = new BorderLayout();
			/*
			 * Window�� �⺻������ ��ġ�����ڰ� ����Ǹ�,
			 * Frame default�� ��ġ�����ڴ� BorderLayout
			 * ��ġ ���� X, ��ġ��ġ�� default => CENTER;
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
