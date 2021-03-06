package com.sds.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

public class Member extends JFrame {

	JPanel p_west;
	JLabel lb_id, lb_pwd, lb_name;
	JTextField tf_id, tf_pwd, tf_name;
	JButton btn_ok, btn_list;

	JPanel p_east;
	JTable table;
	TableModel model;
	JScrollPane scroll;
	
	ArrayList<String> list;

	public Member() {
		// TODO Auto-generated constructor stub
		super("회원등록");

		p_west = new JPanel();

		lb_id = new JLabel("ID");
		lb_pwd = new JLabel("pwd");
		lb_name = new JLabel("name");

		tf_id = new JTextField(15);
		tf_pwd = new JTextField(15);
		tf_name = new JTextField(15);

		btn_ok = new JButton("등록");
		btn_list = new JButton("목록");

		p_west.setLayout(new FlowLayout());
		p_west.add(lb_id);
		p_west.add(tf_id);
		p_west.add(lb_pwd);
		p_west.add(tf_pwd);
		p_west.add(lb_name);
		p_west.add(tf_name);
		p_west.add(btn_ok);
		p_west.add(btn_list);

		add(p_west);

		p_east = new JPanel();
		table = new JTable(model = new MemberTable());
		scroll = new JScrollPane(table);


		p_east.add(scroll);
		add(p_east, BorderLayout.EAST);

		setSize(660, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		btn_ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object obj = e.getSource();
				list = new ArrayList<String>();
				
				String[] column = {"ID","Password","Name"};
				
				if (obj == btn_ok) {
					// 테이블에 등록
					String id = tf_id.getText();
					String pwd = tf_pwd.getText();
					String name = tf_name.getText();		
					
				
					
					list.add(id);
					list.add(pwd);
					list.add(name);
									
					for(int i=0;i<list.size();i++){
						list.get(i);
					}

				}
			}
		});

		btn_list.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object obj = e.getSource();

				if (obj == btn_list) {
					// 테이블 목록
					table.setModel(model=new MemberTable());
					table.updateUI();

				}
			}
		});

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Member();
	}

}
