package com.sds.gallery;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class XCanvas extends Canvas {
	Toolkit kit = Toolkit.getDefaultToolkit();
	Image[] imgs;
	String[] path = { 
			"C:/java_workspace/GUI0808/res/img0.jpg", 
			"C:/java_workspace/GUI0808/res/img1.jpg",
			"C:/java_workspace/GUI0808/res/img2.jpg", 
			"C:/java_workspace/GUI0808/res/img3.jpg",
			"C:/java_workspace/GUI0808/res/img4.jpg", 
			"C:/java_workspace/GUI0808/res/img5.jpg",
			"C:/java_workspace/GUI0808/res/img6.jpg",
	};

	int cnt = 0;

	public XCanvas() {
		// TODO Auto-generated constructor stub
		imgs = new Image[path.length];

		for (int i = 0; i < imgs.length; i++) {
			imgs[i] = kit.getImage(path[i]);
		}

	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(imgs[cnt], 0, 0, 700, 600, this);
	}
	
	

}
