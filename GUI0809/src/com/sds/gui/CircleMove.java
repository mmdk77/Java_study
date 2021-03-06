package com.sds.gui;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CircleMove extends JFrame{
	JButton btn_left,btn_right,btn_up,btn_down;
	JButton[] btn = new JButton[4];
	
	JPanel p_north;
	Canvas can;
	
	int x;
	int y;
	

	public CircleMove() {
		// TODO Auto-generated constructor stub
		p_north = new JPanel();
		
		btn_up = new JButton("up");
		btn_right = new JButton("right");
		btn_left = new JButton("left");
		btn_down = new JButton("down");
		
		btn[0]=btn_left;
		btn[1]=btn_right;
		btn[2]=btn_up;
		btn[3]=btn_down;
		
		can = new Canvas(){
			@Override
			public void paint(Graphics g) {
				// TODO Auto-generated method stub
				g.drawOval(x, y, 40, 40);
			}
		};
		
		add(can);
		
		p_north.add(btn_left);
		p_north.add(btn_right);
		p_north.add(btn_up);
		p_north.add(btn_down);
		
		add(p_north, BorderLayout.NORTH);
		
		for(int i=0;i<btn.length;i++){
			btn[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					//System.out.println(btn[i].getText());
					Object obj = e.getSource();
					JButton bt = (JButton)obj;
					System.out.println(bt.getText());
					
					switch (bt.getText()) {
					case "left":
						moveHorizon(-5);
						break;
					case "right":
						moveHorizon(5);
						break;
					case "up":
						moveVertical(-5);
						break;
					case "down":
						moveVertical(5);
						break;
					}
				}
			});
		}
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 400);
		setVisible(true);
	
	}
	//좌우 이동 메서드
	public void moveHorizon(int x){
		this.x+=x;
		can.repaint();
		
	}

	//위아래 이동 메서드
	public void moveVertical(int y){
		this.y+=y;
		can.repaint();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CircleMove();
	}
  
}
