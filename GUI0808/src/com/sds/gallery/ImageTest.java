
/*Grapics ��ü*/
package com.sds.gallery;

import java.awt.Canvas;

import javax.swing.JFrame;

public class ImageTest extends JFrame{
	MyButton btn;
	MyCanvas can;
	
	public ImageTest() {
		// TODO Auto-generated constructor stub
		btn = new MyButton("��ư");
		can = new MyCanvas();
		
		add(can);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 400);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImageTest();
	}

}
