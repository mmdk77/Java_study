package com.sds.gallery;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class MyCanvas extends Canvas{
	Toolkit kit = Toolkit.getDefaultToolkit();
	Image img = kit.getImage("C:/java_workspace/GUI0880/res");
	
	public MyCanvas() {
		// TODO Auto-generated constructor stub
	
		setBackground(Color.YELLOW);
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawRect(100, 50, 200, 200);
		g.drawString("��Ʈ��", 100, 100);
		g.drawOval(10, 10, 100, 100);
		g.drawImage(img, 0, 100, this);
	
	}
}