package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class KeyEventTest extends JFrame implements KeyListener, ActionListener{
	
	JTextField tf;
	JButton btn;
	
	
	public KeyEventTest() {
		// TODO Auto-generated constructor stub
		super("키보드 이벤트");
		tf = new JTextField(15);
		btn = new JButton("버튼");
		
		//프레임 배치관리.
		this.setLayout(new FlowLayout());
		
		//this(프레임)에 부착
		this.add(tf);
		this.add(btn);
		
		//프레임 설정
		this.setSize(300,400	);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		tf.addKeyListener(this);
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("눌렀다");
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
	}
	
	//메인
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyEventTest();
	}


}
