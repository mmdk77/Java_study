package com.sds.gui;

import java.awt.Canvas;
import java.awt.Graphics;

public class MyCanvas extends Canvas{
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawOval(100, 100, 40, 40);
	}

}
