 package com.sds.game;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
	public final static int WID= 1024; 
	public final static int HEI=768;
	
	//오브젝트 매니저
	ObjectManager obj_manager;
	
	//심장부
	Thread thread;
	boolean flag=true;
	
	//Hero선언
	Hero hero;
	
	//Enemy 선언
	Enemy[] enemy = new Enemy[5];
	
	public GamePanel() {
		// TODO Auto-generated constructor stub
		this.setPreferredSize(new Dimension(WID, HEI));
		obj_manager = new ObjectManager();
		createHero();
		createEnemy();
	}
	
	//Hero 생성 메소드
	public void createHero(){
		hero = new Hero(100, 200, 50, 50, "Hero");
		
		//리스트 등록
		obj_manager.addObject(hero);
	}
	
	//Enemy 생성 메소드
	public void createEnemy(){
		for(int i=0;i<enemy.length;i++){
			enemy[i] = new Enemy(600+(i*50),100+(i*50),30,30,"Enemy");
			
			//리스트 등록
			obj_manager.addObject(enemy[i]);
		}
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		/*	hero 그림등장
		hero.render(g);
		//enemy 그림 등장
		for(int i=0;i<enemy.length;i++){
			enemy[i].render(g);
		}
		*/
		//모든 GameObject의 list에 있는 tic과 render를 호출
		for(int i=0;i<obj_manager.listObj.size();i++){
			GameObject obj = obj_manager.listObj.get(i);
			obj.tic();
			obj.render(g);
		}
	}
	
	public void gameStart(){
		if(thread != null){
			return;
		}
		flag=true;
		thread = new Thread(this);
		thread.start();
	}
	public void gamePause(){
		flag=false;
		thread=null;
	}
	public void gameExit(){
		System.exit(0);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(flag){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println("게임작동중");
			repaint();
		}
	}
}
