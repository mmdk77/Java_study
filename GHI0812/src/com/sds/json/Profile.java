package com.sds.json;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Profile extends JPanel {
	
	JPanel p_west; //Canvas를 포함할 패널
	//이미지에 필요한 속성
	Canvas can;
	Toolkit kit;
	Image img;	
	
	//내용
	JPanel p_center;
	JLabel lb_name,lb_gen,lb_age;
	
	public Profile(String url) {
		// TODO Auto-generated constructor stub
	
		p_west = new JPanel();
		kit = Toolkit.getDefaultToolkit();
		img = kit.getImage(url);
		can = new Canvas(){
			@Override
			public void paint(Graphics g) {
				// TODO Auto-generated method stub
				g.drawImage(img, 0, 0, 100,100,this);
			}
		};
		
		p_center = new JPanel();
		lb_name = new JLabel("이름");
		lb_age = new JLabel("나이");
		lb_gen = new JLabel("성별");
	
		setLayout(new BorderLayout());
		
		//Canvas의 크기 설정
		can.setPreferredSize(new Dimension(100, 100));
		can.setBackground(Color.LIGHT_GRAY);
		
		//canvas와 panel의 간격을 두기위해 panel크기 설정
		p_west.setPreferredSize(new Dimension(120,120));
		
		//p_west에 Canvas를 포함후 p_west를 Border.WEST 위치
		p_west.add(can);
		add(p_west,BorderLayout.WEST);
		
		//Center의 GridLayout
		p_center.setLayout(new GridLayout(3, 1));
		p_center.add(lb_name);
		p_center.add(lb_age);
		p_center.add(lb_gen);
		
		//p_center를 BorderLayout.CENTER에 부착
		add(p_center);
		p_center.setBackground(Color.GREEN);
		
		//프로필 크기지정
		setPreferredSize(new Dimension(700, 120));
	}	

}
