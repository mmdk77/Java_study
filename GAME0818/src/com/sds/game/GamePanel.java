package com.sds.game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {
	public static final int WIDTH = 1024;
	public static final int HEIGHT = 768;
	Thread gameThread;

	boolean flag = true;

	Ship ship;
	Enemy enemy;
	ObjectManager objManger;
	KeyBoard keyBoard;

	public GamePanel() {
		// TODO Auto-generated constructor stub
		setPreferredSize(new Dimension(WIDTH, HEIGHT));

		objManger = new ObjectManager();
		createShip();
		createEnemy();
		createBlock();
		
	}
	//우주선 추가
	public void createShip() {
		ship = new Ship(10, 10, 100, 100, "ship", objManger);
		objManger.objList.add(ship); //List에 ship(GameObj)를 추가.
	}
	//적군 추가
	public void createEnemy(){
		
		for(int i=0;i<7;i++){
			Random rand = new Random();
			
			int n=rand.nextInt(9);
			Enemy enemy = new Enemy(WIDTH-100 , n*50 , 100, 85, "enemy",objManger);
			objManger.addObject(enemy);
		}
	}
	
	//블락 추가
	public void createBlock(){
		//윗 블락
		for(int i=0;i<20;i++){
			Block block = new Block(i*50, 0, 50, 50, "block", objManger);
			objManger.addObject(block);
		}
		//아래블락
		for(int i=0;i<20;i++){
			Block block = new Block(i*50, HEIGHT-50, 50, 50, "block", objManger);
			objManger.addObject(block);
		}
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		//System.out.println("게임 작동중");
		
		/*try {
			Image img = ImageIO.read(this.getClass().getClassLoader().getResource("space.jpg"));
			g.drawImage(img, 0, 0, WIDTH,HEIGHT,this);
			repaint();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		// 모든 게임 오브젝트의 메소드 호출
		/*
		 * ObjectManager에게 양도<< ship.tick(); ship.render(g);
		 * --각자 생성되는 객체의 메소드 이용 X, 
		 * --부모가 되는 GameObj를 ObjManager가 이를 관리하는 형태로 만듬
		 */
		
		for(int i=0;i<objManger.objList.size();i++){
			GameObj go = objManger.objList.get(i);
			go.render(g);
			go.tick();

		}
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (flag) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			repaint();
		}
	}


	public void gameStart() {
		// 게임 시작 ( Thread 생성 및 시작)
		if (gameThread != null) {
			return;
		}
		gameThread = new Thread(this);
		gameThread.start(); // Runnable 영역으로 진입
		flag = true;
	}

	public void gamePause() {
		// 게임 멈춤( Thread 종료)
		flag = false;
		gameThread = null;

	}

	public void gameExit() {
		// 게임종료 (Process종료)
		System.exit(0);
	}
}
