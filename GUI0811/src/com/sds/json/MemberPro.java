package com.sds.json;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MemberPro extends JFrame{
	
	JPanel p_west,p_center;
	JButton btn;
	JScrollPane scroll;
	//파일 
	JFileChooser chooser;
	
	InnerPanel ip;
	String[] url={
			
	};
	
	public MemberPro() {
		// TODO Auto-generated constructor stub
		super("프로필");
		
		p_west = new JPanel();
		p_west.setBackground(Color.green);
		
		p_center = new JPanel();	
		scroll = new JScrollPane(p_center);
		p_center.setBackground(Color.WHITE);
		//ip = new InnerPanel(url);
		
		chooser = new JFileChooser();
		
		
		btn = new JButton("받기");
		
		p_west.add(btn);
		
		add(p_west,BorderLayout.WEST);
		add(scroll,BorderLayout.CENTER);
		
		setVisible(true);
		setSize(600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		btn.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int result = chooser.showOpenDialog(getParent());
				if(result==JFileChooser.APPROVE_OPTION){
					File file =chooser.getSelectedFile();
					String path=file.getAbsolutePath();
					System.out.println(path);
				}
			}
		});
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MemberPro();
	}

}
