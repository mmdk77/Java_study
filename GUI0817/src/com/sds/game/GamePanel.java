 package com.sds.game;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
	public final static int WID= 1024; 
	public final static int HEI=768;
	
	//������Ʈ �Ŵ���
	ObjectManager obj_manager;
	
	//�����
	Thread thread;
	boolean flag=true;
	
	//Hero����
	Hero hero;
	
	//Enemy ����
	Enemy[] enemy = new Enemy[5];
	
	public GamePanel() {
		// TODO Auto-generated constructor stub
		this.setPreferredSize(new Dimension(WID, HEI));
		obj_manager = new ObjectManager();
		createHero();
		createEnemy();
	}
	
	//Hero ���� �޼ҵ�
	public void createHero(){
		hero = new Hero(100, 200, 50, 50, "Hero");
		
		//����Ʈ ���
		obj_manager.addObject(hero);
	}
	
	//Enemy ���� �޼ҵ�
	public void createEnemy(){
		for(int i=0;i<enemy.length;i++){
			enemy[i] = new Enemy(600+(i*50),100+(i*50),30,30,"Enemy");
			
			//����Ʈ ���
			obj_manager.addObject(enemy[i]);
		}
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		/*	hero �׸�����
		hero.render(g);
		//enemy �׸� ����
		for(int i=0;i<enemy.length;i++){
			enemy[i].render(g);
		}
		*/
		//��� GameObject�� list�� �ִ� tic�� render�� ȣ��
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
			//System.out.println("�����۵���");
			repaint();
		}
	}
}