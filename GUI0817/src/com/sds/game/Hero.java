package com.sds.game;

import java.awt.Color;
import java.awt.Graphics;

public class Hero extends GameObject{
	

	public Hero(int x, int y, int width, int height, String name) {
		super(x, y, width, height, name);
		// TODO Auto-generated constructor stub
	}
	public void tic(){
		//�������� ��ȭ���� ����
		x+=velX;
		y+=velY;
	}
	public void render(Graphics g){
		//�ڽ��� ��� �׷��������� ���� �޼���
		
		//���찳 ��Ȱ
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, GamePanel.WID, GamePanel.HEI);
		
		//���ΰ��׸���
		g.setColor(Color.YELLOW);
		g.drawRect(x,y,50,50);
	}
	
}
