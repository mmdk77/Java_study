/*
 *모든 객체에 대한 공통적인 특성과 동작을 보유한 상위 객체 생성
*/

package com.sds.game;

import java.awt.Graphics;


abstract public class GameObject {
	String name;
	int x;
	int y;
	int width;
	int height;
	int velX;
	int velY;
	
	public GameObject(int x, int y, int width, int height, String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.x =x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	abstract public void tic();
	abstract public void render(Graphics g);
}
