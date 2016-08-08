package com.sds.gui;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class MyListener implements ActionListener{
	EventTest2 et;
	
	public void setEt(EventTest2 et) {
		this.et = et;
		System.out.println("받은 주소\n"+et);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		
		JTextField tf = et.tf;
		tf.setText("눌렀");		
	}
}
