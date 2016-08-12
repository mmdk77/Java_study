package com.sds.json;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonProfile extends JFrame{
	JPanel p_west;
	JButton btn;
	JPanel p_center;
	JScrollPane scroll;
	
	JFileChooser chooser;
	
	StringBuffer sb;
	FileReader fr;
	BufferedReader buf_rd;
	public JsonProfile() {
		// TODO Auto-generated constructor stub
		p_west = new JPanel();
		btn = new JButton("����");
		p_center = new JPanel();
		scroll = new JScrollPane(p_center);
		
		chooser = new JFileChooser();
		//���� �г� ��ư ���� �� �г� ���ʺ���
		p_west.add(btn);
		p_west.setBackground(Color.PINK);
		add(p_west, BorderLayout.WEST);
		
		
		
		//���Ϳ� ��ũ�� ����
		p_center.setBackground(Color.cyan);
		p_center.setPreferredSize(new Dimension(700, 600));
		add(scroll);
		
		
		
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		btn.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				openFile();
				
			}
		});
	}
	public void openFile(){
		if(chooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
			//���̽� ����.
			File file = chooser.getSelectedFile();//���ϼ���	
			try {
				fr = new FileReader(file);
				buf_rd = new BufferedReader(fr);
				
				sb = new StringBuffer();
				String data=null;
				while((data=buf_rd.readLine())!=null){
					sb.append(data);
				}
				System.out.println(sb.toString());
				
				createProfile();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
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
	
	//�����ͼ��� ���� Profile �ν��Ͻ� ���� �޼��� ����
	public void createProfile(){
		
		//�Ľ� ����
		JSONParser jsonParser = new JSONParser();
		try {
			JSONObject jsonObj=(JSONObject)jsonParser.parse(sb.toString());
			JSONArray jsonArr=(JSONArray)jsonObj.get("members");
			for(int i=0;i<jsonArr.size();i++){
				JSONObject member = (JSONObject)jsonArr.get(i);
				String name = (String)member.get("name");
				Long age = (Long)member.get("age");
				String gender = (String)member.get("gender");
				String photo = (String)member.get("photo");
				
				
				Profile profile = new Profile(photo);
				profile.lb_name.setText("�̸�>>"+name);
				profile.lb_age.setText("����>>"+age);
				profile.lb_gen.setText("����>>"+gender);
	
				p_center.add(profile);
			}
			p_center.updateUI();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JsonProfile();
	}

}