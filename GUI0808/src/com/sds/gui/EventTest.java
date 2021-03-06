/*
	1.리스터선택
	2.리스너 메소드 재정의
	3.이벤트 소스와 리스너와 연결
*/
package com.sds.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventTest extends JFrame implements ActionListener, KeyListener, WindowListener{

		private JPanel panel;
		private JTextField tf;
		private JButton btn;

		public EventTest() {
			// TODO Auto-generated constructor stub
			super("이벤트 구현");
			panel = new JPanel();
			tf = new JTextField(15);
			btn = new JButton("확인");
			
			this.setVisible(true);
			this.setSize(300,400);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			panel.add(tf);
			panel.add(btn);
			
			this.add(panel);
			
			btn.addActionListener(this);
			tf.addKeyListener(this);
			this.addWindowListener(this);
		}	
		
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		System.out.println("눌렀눌렀");	
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		int key = e.getKeyCode();
		System.out.println(key);
		if(key== 10){
			System.out.println("키보드눌렀");
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Window Activated");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Window Closed");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Window Closing");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Window Deactivated");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Window Deiconified");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Window Iconified");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Window Opened");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EventTest();
	}





}
