package com.sds.gallery;

import java.awt.Graphics;

import javax.swing.JButton;

public class MyButton extends JButton{
	public MyButton(String title) {
		// TODO Auto-generated constructor stub
		super(title);
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		System.out.println("paint»£√‚");
	}

}
