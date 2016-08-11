//Thumbnail class���� ���
package com.sds.graphic;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyCanvas extends Canvas implements MouseListener{
	Toolkit kit;
	Image img;
	ThumbnailGallery tg;
		
	public MyCanvas(String url, ThumbnailGallery tg) {
		// TODO Auto-generated constructor stub
		this.tg=tg;
		
		kit=Toolkit.getDefaultToolkit();
		img=kit.getImage(url);
		
		//���� MouseListener ����
		this.addMouseListener(this);
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(img, 0, 0, 50,50,this);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseClicked");
		tg.crnt_img=img;
		tg.p_right.repaint();
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("mouseEntered");
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("mouseExited");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("mousePressed");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("mouseReleased");
	}

}