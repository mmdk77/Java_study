package com.sds.game;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class Block extends GameObj{

	public Block(int x, int y, int width, int height, String name, ObjectManager objectManager) {
		super(x, y, width, height, name, objectManager);
		// TODO Auto-generated constructor stub
	}

	public void tick() {}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		//벽돌 이미지 보류
		showRect(g);
	}

}
     