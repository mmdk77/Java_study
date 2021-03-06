package com.sds.json;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class InnerPanel extends JPanel{
	
	JPanel p_west, p_grid;
	Image img;
	Toolkit kit;
	JLabel lb_name,lb_gen,lb_age;
	Canvas can;
	
	String imgs;
	
	public InnerPanel(String url) {
		// TODO Auto-generated constructor stub
		
		kit = Toolkit.getDefaultToolkit();
		img = kit.getImage(url);
		
		can = new Canvas(){
			@Override
			public void paint(Graphics g) {
				// TODO Auto-generated method stub
				g.drawImage(img, 0, 0, 100, 100, this);
			}
		};
		can.setPreferredSize(new Dimension(50, 50));
		
		lb_name = new JLabel("이름");
		lb_age = new JLabel("나이");
		lb_gen = new JLabel("성별");
		
		
		p_west.add(can,BorderLayout.WEST);
		
		p_grid.setLayout(new GridLayout(3,1));
		p_grid.add(lb_name);
		p_grid.add(lb_age);
		p_grid.add(lb_gen);
		
		add(p_west);
		add(p_grid);
		
	}
}
