package com.sds.gui;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

import com.sds.collection.MemberModel;
import com.sds.collection.PetModel;

public class TablePrac  extends JFrame implements ItemListener{
	JPanel p_west,p_east;
	Choice ch;
	JTable table;
	JScrollPane scroll;
	TableModel model;
	
	public TablePrac() {
		// TODO Auto-generated constructor stub
		super("���̺��ǽ�");
		
		p_west = new JPanel();
		p_east = new JPanel();
	
		table = new JTable(model);
		scroll = new JScrollPane(table);
		ch = new Choice();
		
		ch.add("����");
		ch.add("�ֿϵ���");
		ch.add("ȸ������");
		
		p_west.add(ch);
		p_east.add(scroll);
		
		add(p_west, BorderLayout.WEST);
		add(p_east, BorderLayout.EAST);
		
		setSize(700,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ch.addItemListener(this);
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getItem();
		if(obj.equals("����")){
			JOptionPane.showMessageDialog(this, "�����ض�.");
		}else if(obj.equals("�ֿϵ���")){
			table.setModel(model=new PetModel());
		}else if(obj.equals("ȸ������")){
			table.setModel(model=new MemberModel());
		}
		//����
		table.updateUI();//
	}
	
	public static void main(String[] args){
		new TablePrac();
	}

}