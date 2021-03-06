package com.sds.graphic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ThumbnailGallery extends JFrame{

	JPanel p_left,p_right;
	Image crnt_img;
	
	String[] url = {
			"C:/java_workspace/GUI0811/res/img0.jpg",
			"C:/java_workspace/GUI0811/res/img1.jpg",
			"C:/java_workspace/GUI0811/res/img2.jpg",
			"C:/java_workspace/GUI0811/res/img3.jpg",
			"C:/java_workspace/GUI0811/res/img4.jpg",
			"C:/java_workspace/GUI0811/res/img5.jpg",
			"C:/java_workspace/GUI0811/res/img6.jpg",
			};
	MyCanvas[] can = new MyCanvas[url.length];
	
	public ThumbnailGallery() {
		// TODO Auto-generated constructor stub
		
		p_left = new JPanel();

		for(int i=0;i<can.length;i++){
			can[i] = new MyCanvas(url[i], this);	
			can[i].setPreferredSize(new Dimension(50, 50));
			p_left.add(can[i]);
		}
		
		crnt_img=can[0].img;
		p_right = new JPanel(){
			@Override
			public void paint(Graphics g) {
				// TODO Auto-generated method stub
				g.drawImage(crnt_img, 0, 0, 400, 350, this);
	
				
			}
		};
		p_right.setPreferredSize(new Dimension(380, 380));
		
		
		//grid
		setLayout(new GridLayout(1, 2));
		
		//panel ����
		p_left.setBackground(Color.ORANGE);
		p_right.setBackground(Color.white);
		
		add(p_left);
		add(p_right);
		
		
		//grid
		setLayout(new GridLayout(1, 2));
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(650, 450);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThumbnailGallery();
	}

}
