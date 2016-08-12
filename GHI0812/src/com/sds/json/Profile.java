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
	
	JPanel p_west; //Canvas�� ������ �г�
	//�̹����� �ʿ��� �Ӽ�
	Canvas can;
	Toolkit kit;
	Image img;	
	
	//����
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
		lb_name = new JLabel("�̸�");
		lb_age = new JLabel("����");
		lb_gen = new JLabel("����");
	
		setLayout(new BorderLayout());
		
		//Canvas�� ũ�� ����
		can.setPreferredSize(new Dimension(100, 100));
		can.setBackground(Color.LIGHT_GRAY);
		
		//canvas�� panel�� ������ �α����� panelũ�� ����
		p_west.setPreferredSize(new Dimension(120,120));
		
		//p_west�� Canvas�� ������ p_west�� Border.WEST ��ġ
		p_west.add(can);
		add(p_west,BorderLayout.WEST);
		
		//Center�� GridLayout
		p_center.setLayout(new GridLayout(3, 1));
		p_center.add(lb_name);
		p_center.add(lb_age);
		p_center.add(lb_gen);
		
		//p_center�� BorderLayout.CENTER�� ����
		add(p_center);
		p_center.setBackground(Color.GREEN);
		
		//������ ũ������
		setPreferredSize(new Dimension(700, 120));
	}	

}