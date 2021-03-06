package com.sds.stream;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Editor extends JFrame{
	JButton btn;
	JTextArea area;
	JScrollPane scoll;
	JFileChooser chooser;
	
	FileReader fr; //���ڿ��� �������ʱ� ���� ��ü
	BufferedReader buf_rd; //�о���϶� ���پ� �������� ��ü
	

	public Editor() {
		// TODO Auto-generated constructor stub
		btn = new JButton("����");
		area = new JTextArea();
		scoll = new JScrollPane(area);
		
		chooser = new JFileChooser();
		
		add(btn, BorderLayout.NORTH);
		add(scoll);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 500);
		setVisible(true);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				openFile();
			}
		});
	}
	public void openFile(){
		//���پ� �о� area�� ���
		//�������� ���� ���� ���
		int result = chooser.showOpenDialog(this);
		File file = chooser.getSelectedFile();
		if(result==JFileChooser.APPROVE_OPTION){
		
			try {
				fr = new FileReader(file);
				buf_rd = new BufferedReader(fr);
				String data = null;
				while((buf_rd.readLine())!=null){
					area.append(data+"\n");				
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(buf_rd!=null){
					try {
						buf_rd.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		new Editor();
	}

}
