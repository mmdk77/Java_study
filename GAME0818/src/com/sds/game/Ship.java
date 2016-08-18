package com.sds.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;


public class Ship extends GameObj {
	
	Image img;

	public Ship(int x, int y, int width, int height, String name, ObjectManager objectManager) {
		super(x, y, width, height, name, objectManager);
		// TODO Auto-generated constructor stub
		img = getImage("ship.png");

	}

	public void fire() {
		Bullet bullet = new Bullet(x + width, y + (height / 2), 50, 30, "bullet", objectManager);
		objectManager.addObject(bullet);
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		x += velX;
		y += velY;

		rect.setBounds(x, y, width, height);
		

	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub

		g.setColor(Color.BLACK);
		g.fillRect(0, 0, GamePanel.WIDTH, GamePanel.HEIGHT);

		g.drawImage(img, x, y, width, height, null); // null - 현재컨테이너 X
		showRect(g);
		
		g.translate(x, y);
	}
}
