package com.sds.auto;

import java.awt.Dimension;

import javax.swing.JProgressBar;

public class ProgressBar extends JProgressBar implements Runnable{
	
	int interval;
	int n;
	
	public ProgressBar(int interval) {
		// TODO Auto-generated constructor stub
		this.interval = interval;
		this.setPreferredSize(new Dimension(400, 50));
		
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try {
				Thread.sleep(interval);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			n++;
			this.setValue(n);
		}
	}

}
