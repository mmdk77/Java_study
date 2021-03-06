package com.sds.chatting;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatA extends JFrame implements ActionListener, KeyListener{
	JTextArea area;
	JPanel panel;
	JTextField tf;
	JButton btn;
	JScrollPane scroll;
	ChatB chatB;

	public ChatA() {
		// TODO Auto-generated constructor stub
		area = new JTextArea();
		panel = new JPanel();
		tf = new JTextField(15);
		btn = new JButton("货芒");

		// area俊 胶农费 利侩
		scroll = new JScrollPane(area);

		// center - scroll(area)
		add(scroll);

		// south - (panel)txt&btn
		panel.add(tf);
		panel.add(btn);
		add(panel, BorderLayout.SOUTH);

		// frame 加己
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 200, 300, 400);
		setVisible(true);
		
		// event 备泅
		btn.addActionListener(this);
		tf.addKeyListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			
		chatB = new ChatB(this);
		btn.setEnabled(false);
	
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		int key = e.getKeyCode();
		if(key==KeyEvent.VK_ENTER){
			String msg = tf.getText();
			area.append(msg+"\n");
			tf.setText("");
			
			// chatB area
			chatB.area.append(msg+"\n");
		}
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChatA();
	}


}
