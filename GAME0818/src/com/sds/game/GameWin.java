package com.sds.game;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GameWin extends JFrame implements ActionListener{
	GamePanel gamePanel;
	KeyBoard keyBoard;
	
	//���� �ɼ�-(����,����,����) , ����
	JMenuBar bar;
	JMenu[] menu = new JMenu[3];
	JMenuItem[] item = new JMenuItem[3];
	String[] itemName = {"����","����","����"};
	
	
	public GameWin(){
		//Menubar ����
		bar = new JMenuBar();
		this.setJMenuBar(bar);
		
		menu[0]= new JMenu("�ɼ�");
		menu[1]= new JMenu("����");
		
		for(int i = 0;i<item.length;i++){
			item[i] = new JMenuItem(itemName[i]);
			menu[0].add(item[i]);
		}
		
		bar.add(menu[0]);
		bar.add(menu[1]);
		
		//�̺�Ʈ ����
		for(int i =0;i<item.length;i++){
			item[i].addActionListener(this);
		}
		
		gamePanel = new GamePanel();
		keyBoard = new KeyBoard(gamePanel.objManger);
		addKeyListener(keyBoard);
		
		//�ʱ� Window ����
		add(gamePanel);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setBackground(Color.BLACK);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		if(obj==item[0]){
			gamePanel.gameStart();
		}else if(obj==item[1]){
			gamePanel.gamePause();
		}else if(obj==item[2]){
			gamePanel.gameExit();
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GameWin();

	}


}