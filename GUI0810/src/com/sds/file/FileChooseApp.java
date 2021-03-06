package com.sds.file;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FileChooseApp extends JFrame implements ActionListener{
	JPanel p_north, p_center, p_south;
	JLabel lb_orgin, lb_save;
	JButton btn_open, btn_save, btn_ok;
	JTextField tf_open, tf_save;
	
	JFileChooser chooser;
	
	
	public FileChooseApp() {
		// TODO Auto-generated constructor stub
		p_north = new JPanel();
		lb_orgin = new JLabel("원본");
		tf_open = new JTextField(20);
		btn_open = new JButton("열기");
		
		p_center = new JPanel();
		lb_save = new JLabel("저장경로");
		tf_save = new JTextField(20);
		btn_save = new JButton("저장");
		
		p_south = new JPanel();
		btn_ok = new JButton("실행");
		
		
		p_north.add(lb_orgin);
		p_north.add(tf_open);
		p_north.add(btn_open);
		
		p_center.add(lb_save);
		p_center.add(tf_save);
		p_center.add(btn_save);
		
		p_south.add(btn_ok);
		
		chooser = new JFileChooser();
		
		add(p_north,BorderLayout.NORTH);
		add(p_center,BorderLayout.CENTER);
		add(p_south,BorderLayout.SOUTH);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 200);
		
		btn_ok.addActionListener(this);
		btn_open.addActionListener(this);
		btn_save.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		if(obj==btn_open){
			//파일열기
			openFile();
		}else if(obj==btn_save){
			//파일저장
			saveFile();
		}else if(obj==btn_ok){
			//실행
			runFile();
		}
	}
	
	public void openFile(){
		int result = chooser.showOpenDialog(btn_open);
		if(result == JFileChooser.APPROVE_OPTION){
			File file = chooser.getSelectedFile();
			String path = file.getAbsolutePath();
			tf_open.setText(path);
		}
	}
	public void saveFile(){
		int result = chooser.showSaveDialog(btn_save);
		if(result == JFileChooser.APPROVE_OPTION){
			File file = chooser.getSelectedFile();
			String path = file.getAbsolutePath();
			tf_save.setText(path);
		}
	}
	public void runFile(){
		JOptionPane.showMessageDialog(this, "완 to the 료");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FileChooseApp();
	}



}
