/*
 * inner Class 실습
 * inner class - 재사용성이 떨어지는 클래스는 innerClass로 정의
 * 	(주로, Event 처리에 관한 Listener들을 내부클래스로 처리함)
*/

package com.sds.ocjp;

import java.awt.Canvas;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnonyTest extends JFrame {
	Canvas can;
	JButton btn1,btn2;

	public AnonyTest() {
		// TODO Auto-generated constructor stub
		can = new Canvas(){
			@Override
			public void paint(Graphics g) {
				// TODO Auto-generated method stub
				g.drawLine(0, 0, 300, 400);
			}
			
		};
		btn1 = new JButton("버튼1");
		//btn2 = new JButton("버튼2");
		
		setLayout(new FlowLayout());
		add(can);	
		//add(can = new Canvas(){ ... }); -이것도 가능
		add(btn1);
		//add(btn2);
		add(btn2 = new JButton(){
			@Override
			public void paint(Graphics g) {
				// TODO Auto-generated method stub
				g.drawString("버튼2", 0, 0);
			}
		});
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("버튼1");
			}
		});
		//end of addActionListener(btn1)
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("버튼2");
			}
		});
		//end of addActionListener(btn2)
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AnonyTest();
	}

}
