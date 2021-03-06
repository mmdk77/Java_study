/*
 	Collection Framework - 객체를 모아 처리하기 위한 패키지
 	
 	유형
 	List : 순서 O
 	 *특징-배열과 비슷
 	 *차이점-기본자료형까지 지원, 배열은 정적(크기명시), List 동적(크기명시X)
 	Set : 순서X
 	Map : key_value
 	
 	java.util 패키지에서 지원
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
	//ArrayLsit list;  *<>사용 X
	ArrayList<JButton> list;
	JPanel p_north, p_center;
	JButton btn_cre, btn_col;
	
	public CollectionTest() {
		// TODO Auto-generated constructor stub
		//list = new ArrayList(); *<>사용 X
		list = new ArrayList<JButton>();  //리스트 생성
		
		p_north = new JPanel();
		p_center = new JPanel();
		p_center.setBackground(Color.green);
		
		btn_cre = new JButton("생성");
		btn_col = new JButton("색상");
		
		p_north.add(btn_cre);
		p_north.add(btn_col);
		
		add(p_north, BorderLayout.NORTH);
		add(p_center);
		
		//생성
		btn_cre.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton bt = new JButton("버튼");
				p_center.add(bt);
				p_center.updateUI();
				
				//생성된 버튼 List에 추가
				list.add(bt);
				System.out.println("List 크기"+list.size());
			}
		});
		//색상
		btn_col.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for(int i=0; i<list.size();i++){
					/*
					 * <Generic E>사용안했을 때.
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
