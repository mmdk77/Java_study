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
	//���ּ� �߰�
	public void createShip() {
		ship = new Ship(10, 10, 100, 100, "ship", objManger);
		objManger.objList.add(ship); //List�� ship(GameObj)�� �߰�.
	}
	//���� �߰�
	public void createEnemy(){
		
		for(int i=0;i<7;i++){
			Random rand = new Random();
			
			int n=rand.nextInt(9);
			Enemy enemy = new Enemy(WIDTH-100 , n*50 , 100, 85, "enemy",objManger);
			objManger.addObject(enemy);
		}
	}
	
	//���� �߰�
	public void createBlock(){
		//�� ����
		for(int i=0;i<20;i++){
			Block block = new Block(i*50, 0, 50, 50, "block", objManger);
			objManger.addObject(block);
		}
		//�Ʒ�����
		for(int i=0;i<20;i++){
			Block block = new Block(i*50, HEIGHT-50, 50, 50, "block", objManger);
			objManger.addObject(block);
		}
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		//System.out.println("���� �۵���");
		
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
		
		// ��� ���� ������Ʈ�� �޼ҵ� ȣ��
		/*
		 * ObjectManager���� �絵<< ship.tick(); ship.render(g);
		 * --���� �����Ǵ� ��ü�� �޼ҵ� �̿� X, 
		 * --�θ� �Ǵ� GameObj�� ObjManager�� �̸� �����ϴ� ���·� ����
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
		// ���� ���� ( Thread ���� �� ����)
		if (gameThread != null) {
			return;
		}
		gameThread = new Thread(this);
		gameThread.start(); // Runnable �������� ����
		flag = true;
	}

	public void gamePause() {
		// ���� ����( Thread ����)
		flag = false;
		gameThread = null;

	}

	public void gameExit() {
		// �������� (Process����)
		System.exit(0);
	}
}