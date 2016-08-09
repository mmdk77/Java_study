package com.sds.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CreateButton extends JFrame{
	
	JButton btn_cre, btn_col,btn;
	JPanel p_north,p_center;

	
	public CreateButton() {
		// TODO Auto-generated constructor stub
		super("버튼생성기");
		
		
		btn_col = new JButton("색상");
		btn_cre = new JButton("생성");
		btn = new JButton("버튼");
		p_north = new JPanel();
		p_center = new JPanel();
		
		p_north.add(btn_cre);
		p_north.add(btn_col);
		
		
		add(p_north,BorderLayout.NORTH);
	
			
			
	
		
		
		btn_cre.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object obj = e.getSource();
				
				addBtn();
				
				
			}
		});
		
		btn_col.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				btn.setBackground(new Color(255));
			}
		});
		
		
		setVisible(true);
		setSize(600, 650);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void addBtn(){
		p_center.add(btn);
		add(p_center,BorderLayout.CENTER);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CreateButton();
	}

}
