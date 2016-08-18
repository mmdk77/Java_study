package com.sds.game;

import java.awt.Graphics;
import java.awt.Image;

public class Bullet extends GameObj{
	Image img;
	
	public Bullet(int x, int y, int width, int height, String name,ObjectManager objectManager) {
		super(x, y, width, height, name,objectManager);
		// TODO Auto-generated constructor stub
		img=getImage("Bullet.png");
		velX=5;
	}

	
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		x+=velX;
		
		rect.setBounds(x, y, width, height);

		hitTest();
	}
	
	public boolean hitTest(){
		for(int i=0;i<objectManager.objList.size();i++){
			GameObj gameObj = objectManager.objList.get(i);
			if(gameObj.name.equals("enemy")){
				boolean result = this.rect.intersects(gameObj.rect);
				if(result){
					//System.out.println("�浹");
					objectManager.objList.remove(this);
					objectManager.objList.remove(gameObj);
				}
			}
		}
		
		return false;
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(img, x, y, width, height, null);
		showRect(g);
	}
	

}
