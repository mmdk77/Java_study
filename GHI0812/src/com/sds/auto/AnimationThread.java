package com.sds.auto;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AnimationThread extends JFrame {

	JButton btn;
	JPanel p_north;
	Canvas can;
	Toolkit kit;
	Image img;

	Thread thread;

	String path = "C:/java_workspace/GHI0812/res/bullet.png";

	int x = 700;

	public AnimationThread() {
		// TODO Auto-generated constructor stub

		btn = new JButton("Ȯ��");
		p_north = new JPanel();
		kit = Toolkit.getDefaultToolkit();
		img = kit.getImage(path);
		can = new Canvas() {

			@Override
			public void paint(Graphics g) {
				// TODO Auto-generated method stub
				g.drawImage(img, x, 0, 50, 50, this);
			}
		};

		p_north.add(btn);
		add(p_north, BorderLayout.NORTH);
		add(can);
		setVisible(true);
		setSize(900, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		thread = new Thread(){
			public void run() {
				try {		
					while(true){
							thread.sleep(150);
							int cnt = 0;
							cnt+=10;
							moveBull(cnt);					
						}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
		};
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				thread.start();
			}
		});

	}

	public void moveBull(int x) {
		this.x -= x;
		can.repaint();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AnimationThread();
	}

}
