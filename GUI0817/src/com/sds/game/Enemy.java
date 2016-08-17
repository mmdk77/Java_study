package com.sds.game;

import java.awt.Color;
import java.awt.Graphics;

public class Enemy extends GameObject{
	
	
	public Enemy(int x, int y, int width, int height,String name) {
		super(x, y, width, height, name);
		// TODO Auto-generated constructor stub
		
		
	}

	public void tic(){
		x-=velX;
		y-=velY;
	}
	public void render(Graphics g){
		
		g.setColor(Color.CYAN);
		g.drawOval(x, y, 30, 30);
		
	}
}
