/*
 * AWT는 os 플랫폼마다 디자인이 틀어짐, 따라 API중 보완된 SWING을 사용
 * Swing 특징
 * 		- javax 패키지 지원
 * 		- awt와 동일 컴포넌트 앞에 'J' 가 붙음
 * 
 * 자바 GUI 컴포넌트 종류
 *	1.Container - JFrame(border),JPanel(flow), Applet(flow)
 *	2.Visual Component - JButton,JCheckbox..등등 
 * */

package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatWin extends JFrame {
	
			JTextArea area;
			JTextField tf_chat;
			JButton btn_ok ;
			
			JPanel panel;
					
			public ChatWin(){
				
				super("Chat Client");
				area = new JTextArea();
				tf_chat = new JTextField(16);
				btn_ok = new JButton("보내기");
				
				panel = new JPanel();
				
				panel.add(tf_chat); 
				panel.add(btn_ok);
					
				add(panel, BorderLayout.SOUTH);
				add(area, BorderLayout.CENTER);
				//Process kill
				this.setDefaultCloseOperation(EXIT_ON_CLOSE);
				setSize(300, 400);
				setVisible(true);
			}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++){
			ChatWin cw = new ChatWin();
		}
		
		
	}

}
