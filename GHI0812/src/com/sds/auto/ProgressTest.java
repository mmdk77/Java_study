package com.sds.auto;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressTest extends JFrame {

	JButton btn;
	JProgressBar bar;
	
	Thread thread;
	int n;
	
	public ProgressTest() {
		// TODO Auto-generated constructor stub
		setLayout(new FlowLayout());
		btn = new JButton("�ٿ�ε�");
		bar = new JProgressBar();
		bar.setPreferredSize(new Dimension(380, 50));
		bar.setBackground(Color.CYAN);
		
		add(btn);
		add(bar);
		
		setSize(400,150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		thread = new Thread(){
			public void run() {
				try {
					while(true){
						thread.sleep(300);
						fill();
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

	public void fill(){
		n++;
		bar.setValue(n);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ProgressTest();
	}

}
