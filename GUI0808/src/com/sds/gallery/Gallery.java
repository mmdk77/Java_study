package com.sds.gallery;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gallery extends JFrame implements ActionListener {
	XCanvas can;
	JPanel p;
	JButton btn_prev, btn_next;
	JTextField tf;

	public Gallery() {
		// TODO Auto-generated constructor stub
		super("�̹��� �׽�Ʈ");
		p = new JPanel();
		btn_next = new JButton("����");
		btn_prev = new JButton("����");
		tf = new JTextField(30);
		can = new XCanvas();

		add(can);
		p.add(btn_prev);
		p.add(tf);
		p.add(btn_next);

		add(p, BorderLayout.SOUTH);

		this.setSize(700, 650);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		btn_next.addActionListener(this);
		btn_prev.addActionListener(this);

	}

	public void prev() {
		if(can.imgs.length>0){
			tf.setText(can.path[can.cnt--]);
			can.repaint();
		}else{
			JOptionPane.showMessageDialog(this, "�����̹����� ���̻� ����");
		}
	}

	public void next() {
		if(can.imgs.length<7){
			tf.setText(can.path[can.cnt++]);
			can.repaint(); // Img�� �����ٰ� �ٽ� paint ȣ��	
		}else{
			JOptionPane.showMessageDialog(this, "�����̹����� ���̻� ����");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		if (obj == btn_prev) {
			prev();
		} else if (obj == btn_next) {
			next();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Gallery();

	}

}