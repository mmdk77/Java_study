package com.sds.gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class EventTest2 extends JFrame{
	
	 JButton btn;
	 JTextField tf;
	 MyListener ml;
	
	public EventTest2() {
		// TODO Auto-generated constructor stub
		super("�̺�Ʈ �׽�Ʈ2");
		
		this.setVisible(true);
		this.setSize(300, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		btn = new JButton("Ȯ��");
		tf = new JTextField(12);
		
		
		this.add(btn);
		this.add(tf);
		
		
		btn.addActionListener(ml = new MyListener());
		System.out.println("setEt()�޼ҵ� �ּ�\n"+this);
		ml.setEt(this);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EventTest2();
	}

}