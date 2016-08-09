/*
 	Collection Framework - ��ü�� ��� ó���ϱ� ���� ��Ű��
 	
 	����
 	List : ���� O
 	 *Ư¡-�迭�� ���
 	 *������-�⺻�ڷ������� ����, �迭�� ����(ũ�����), List ����(ũ�����X)
 	Set : ����X
 	Map : key_value
 	
 	java.util ��Ű������ ����
*/

package com.sds.collection;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CollectionTest extends JFrame {
	//ArrayLsit list;  *<>��� X
	ArrayList<JButton> list;
	JPanel p_north, p_center;
	JButton btn_cre, btn_col;
	
	public CollectionTest() {
		// TODO Auto-generated constructor stub
		//list = new ArrayList(); *<>��� X
		list = new ArrayList<JButton>();  //����Ʈ ����
		
		p_north = new JPanel();
		p_center = new JPanel();
		p_center.setBackground(Color.green);
		
		btn_cre = new JButton("����");
		btn_col = new JButton("����");
		
		p_north.add(btn_cre);
		p_north.add(btn_col);
		
		add(p_north, BorderLayout.NORTH);
		add(p_center);
		
		//����
		btn_cre.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton bt = new JButton("��ư");
				p_center.add(bt);
				p_center.updateUI();
				
				//������ ��ư List�� �߰�
				list.add(bt);
				System.out.println("List ũ��"+list.size());
			}
		});
		//����
		btn_col.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for(int i=0; i<list.size();i++){
					/*
					 * <Generic E>�������� ��.
					 * Object obj =list.get(i);
					 * JButton bt = (JButton)obj;
					*/
					JButton bt = list.get(i);			 			
					bt.setBackground(Color.yellow);
				}
			}
		});
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 600);
		setVisible(true);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CollectionTest();
	}

}