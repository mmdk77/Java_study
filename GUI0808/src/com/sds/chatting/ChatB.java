package com.sds.chatting;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatB extends JFrame implements KeyListener {
	JTextArea area;
	JPanel panel;
	JTextField tf;
	JScrollPane scroll;
	ChatA chatA;

	public ChatB(ChatA chatA) {
		// TODO Auto-generated constructor stub
		this.chatA=chatA;
		area = new JTextArea();
		panel = new JPanel();
		tf = new JTextField(15);

		// area俊 胶农费 利侩
		scroll = new JScrollPane(area);

		// center - scroll(area)
		add(scroll);

		// south - (panel)txt&btn
		panel.add(tf);
		add(panel, BorderLayout.SOUTH);

		// frame 加己
		setBounds(400, 200, 300, 400);
		setVisible(true);
		
		// Event 殿废
		tf.addKeyListener(this);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		int key = e.getKeyCode();
		if(key==KeyEvent.VK_ENTER){
			String msg = tf.getText();
			area.append(msg+"\n");
			tf.setText("");
			chatA.area.append(msg+"\n");
			
			
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
