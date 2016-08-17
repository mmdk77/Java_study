package com.sds.game;

import java.awt.Color;
import java.awt.Graphics;

public class Hero extends GameObject{
	

	public Hero(int x, int y, int width, int height, String name) {
		super(x, y, width, height, name);
		// TODO Auto-generated constructor stub
	}
	public void tic(){
		//물리량의 변화값을 결정
		x+=velX;
		y+=velY;
	}
	public void render(Graphics g){
		//자신이 어떻게 그려져야할지 정할 메서드
		
		//지우개 역활
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, GamePanel.WID, GamePanel.HEI);
		
		//주인공그리기
		g.setColor(Color.YELLOW);
		g.drawRect(x,y,50,50);
	}
	
}
