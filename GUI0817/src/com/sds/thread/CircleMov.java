package com.sds.thread;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class CircleMov extends JFrame implements KeyListener,Runnable {

	Canvas can;
	Thread thread;
	int x =0;
	
	public CircleMov() {
		// TODO Auto-generated constructor stub
	
		
		can = new Canvas(){
			@Override
			public void paint(Graphics g) {
				// TODO Auto-generated method stub
				
				mov(x);
				g.drawOval(x, 10, 50, 50);
				repaint();
			}
		};
		
		add(can);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 400);
	
		can.addKeyListener(this);
		
	
	}
	
	
	
	public void mov(int x){
		this.x = x;
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			thread.sleep(100);
			x+=10;
			mov(x);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		/*���X*/
	}
	
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		int result = e.getKeyCode();
		//System.out.println(e);
		if(result==32){
			thread.start();
			//System.out.println(x);
		}
		
		
	}
	

	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		/*���X*/
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CircleMov();
	}






}
