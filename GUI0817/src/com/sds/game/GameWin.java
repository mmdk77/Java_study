package com.sds.game;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GameWin extends JFrame implements ActionListener{	
	GamePanel game_p;
	
	JMenuBar bar;
	JMenu[] menu = new JMenu[2];
	JMenuItem[] item = new JMenuItem[3]; 
	String[] itemTitle = {"����","����","����"};
	
	//KeyListener�� ������ �߻�Ŭ���� (�ʿ�ġ ���� �޼ҵ带 ���̻� ���X)
	KeyBoard keyBoard;
	
	public GameWin() {
		// TODO Auto-generated constructor stub
	
		add(game_p= new GamePanel());
		pack();
		
		//�޴�����
		bar = new JMenuBar();
		menu[0] = new JMenu("�ɼ�");
		menu[1] = new JMenu("����");
		
		for(int i=0;i<item.length;i++){
			item[i] = new JMenuItem(itemTitle[i]);
			menu[0].add(item[i]);
			
			//�̺�Ʈ
			item[i].addActionListener(this);
		}
		
		this.addKeyListener(new KeyBoard(game_p.obj_manager));
		
		bar.add(menu[0]);
		bar.add(menu[1]);
		setJMenuBar(bar);
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setBackground(Color.BLACK);
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		
		if(obj == item[0]){
			//���� 
			game_p.gameStart();
		}else if(obj == item[1]){
			//����
			game_p.gamePause();
		}else if(obj == item[2]){
			//����
			game_p.gameExit();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new GameWin();
	}


}