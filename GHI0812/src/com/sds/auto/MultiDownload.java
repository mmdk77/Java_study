package com.sds.auto;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MultiDownload extends JFrame {
	JButton btn;
	ProgressBar bar1,bar2,bar3;
	
	Thread t1,t2,t3;

	public MultiDownload() {
		// TODO Auto-generated constructor stub
		setLayout(new FlowLayout());
		btn = new JButton("다운시작");
		bar1 = new ProgressBar(1000);
		bar2 = new ProgressBar(500);
		bar3 = new ProgressBar(1500);
		
		add(btn);
		add(bar1);
		add(bar2);
		add(bar3);
		
		//Runnable은 run 메소드를 재정의할경우
		//Thread 생성시 Runnable 객체를 인수로 넣어야 동작가능
		t1 = new Thread(bar1);
		t2 = new Thread(bar2);
		t3 = new Thread(bar3);	
		
		setSize(450, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				t1.start();
				t2.start();
				t3.start();
			}
		});

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MultiDownload();
	}

}
