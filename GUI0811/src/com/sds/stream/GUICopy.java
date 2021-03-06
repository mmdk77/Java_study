package com.sds.stream;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUICopy extends JFrame{
	JLabel la_ori, la_dest;
	JTextField t_ori, t_dest;
	JButton bt_ori, bt_dest;
	JButton bt_copy;
	JPanel p_center;
	JPanel p_south;
	
	JFileChooser chooser;
	
	FileInputStream fis;
	FileOutputStream fos;
	
	public GUICopy() {
		la_ori  =new JLabel("원본 선택");
		la_dest  =new JLabel("복사 경로");
		t_ori  = new JTextField(25);
		t_dest = new JTextField(25);
		bt_ori = new JButton("찾기");
		bt_dest = new JButton("열기");
		bt_copy = new JButton("복사시작");
		p_center = new JPanel();
		p_south = new JPanel();
		
		chooser = new JFileChooser();
		//디자인 
		t_ori.setBackground(Color.YELLOW);
		t_ori.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.RED));
		
		t_dest.setBackground(Color.YELLOW);
		t_dest.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.RED));
		
		p_center.add(la_ori);
		p_center.add(t_ori);
		p_center.add(bt_ori);
		p_center.add(la_dest);
		p_center.add(t_dest);
		p_center.add(bt_dest);		
		
		p_south.add(bt_copy);
		
		add(p_center);
		add(p_south, BorderLayout.SOUTH);
		
		//Event
		bt_ori.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int result = chooser.showOpenDialog(getParent());
				if(result == JFileChooser.APPROVE_OPTION){
					File file = chooser.getSelectedFile();
					String path = file.getAbsolutePath();
					t_ori.setText(path);
				}
			}
		});
		
		bt_dest.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int result = chooser.showOpenDialog(getParent());
				if(result == JFileChooser.APPROVE_OPTION){
					File file=chooser.getSelectedFile();
					String path=file.getAbsolutePath();
					t_dest.setText(path);
				}
				
			}
		});
		
		bt_copy.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				copy();
				
			}
		});
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(450, 150);
	}
	public void copy(){
		//입력 스트림으로 읽어들인 데이터를 출력스트림으로 
		try {
			fis = new FileInputStream(t_ori.getText());
			fos = new FileOutputStream(t_dest.getText());
			int data;
			while((data = fis.read())!=-1){
				fos.write(data);
			}
			JOptionPane.showMessageDialog(this, "복사완료");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this, "파일이 존재X");
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(fis!=null){
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		new GUICopy();
	}

}
