package com.sds.project;

import java.awt.Choice;
import java.awt.ComponentOrientation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class AddressFrame extends JFrame implements ItemListener, ActionListener {
	JButton bt_sub, bt_lay, bt_can;
	Choice ch_city, ch_gu;
	Choice ch_dong;
	String st_dong[];
	JTextField tf_sub;
	JTextArea ta_certify;
	JLabel lb_city, lb_certify, lb_gu, lb_tf;
	RegistForm registForm;
	
	public AddressFrame(RegistForm registForm) {
		this.registForm = registForm;
		// GridLayout gr= new GridLayout(3, 3);
		setLayout(null);

		ch_city = new Choice();
		lb_city = new JLabel("��");
		lb_gu = new JLabel("��");
		ch_dong = new Choice();
		lb_tf = new JLabel("���ּ�");
		tf_sub = new JTextField();
		//bt_sub = new JButton("���");
		//lb_certify = new JLabel("�ּ�Ȯ��");
		//ta_certify = new JTextArea();
		bt_lay = new JButton("�Է�");
		bt_can = new JButton("���");

		ch_city.add("���á�");
		ch_city.add("�����");
		ch_city.add("����������");
		ch_city.add("���ֱ�����");
		ch_city.add("�λ��");
		ch_city.add("�뱸������");
		ch_city.add("���ֽ�");

		lb_city.setBounds(20, 10, 30, 30);
		ch_city.setBounds(50, 10, 150, 20);
		lb_gu.setBounds(220, 10, 30, 30);
		ch_dong.setBounds(250, 10, 150, 20);
		lb_tf.setBounds(10, 50, 70, 30);
		tf_sub.setBounds(80, 50, 250, 25);
		bt_lay.setBounds(340, 50, 70, 20);
		//lb_certify.setBounds(10, 100, 70, 20);
		//ta_certify.setBounds(80, 90, 300, 50);
		//bt_lay.setBounds(180, 180, 70, 20);

		add(lb_gu);
		add(lb_city);
		add(ch_city);
		add(lb_tf);
		add(tf_sub);
		//add(bt_sub);
		//add(lb_certify);
		//add(ta_certify);
		add(bt_lay);
		// add(bt_can);

		ch_dong.add("���á�");
		add(ch_dong);

		ch_city.addItemListener(this);
		//bt_sub.addActionListener(this);
		bt_lay.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});

		setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		setSize(440, 200);
		setVisible(true);

	}

	public void DaeDong() {
		ch_dong.removeAll();
		ch_dong.add("����");
		ch_dong.add("����");
		ch_dong.add("�߱�");
		// add(ch_dong);

	}

	public void SeoulDong() {
		// ch_dong = new Choice();
		ch_dong.removeAll();
		ch_dong.add("���۱�");
		ch_dong.add("�����");
		ch_dong.add("������");
		// add(ch_dong);

	}

	public void DaeguDong() {
		// ch_dong = new Choice();
		ch_dong.removeAll();
		ch_dong.add("������");
		ch_dong.add("�޼���");
		ch_dong.add("�ϱ�");
		// add(ch_dong);

	}

	public void GwangDong() {
		// ch_dong = new Choice();
		ch_dong.removeAll();
		ch_dong.add("�ϱ�");
		ch_dong.add("����");
		ch_dong.add("���걸");
		// add(ch_dong);
	}

	public void BuDong() {
		// ch_dong = new Choice();
		ch_dong.removeAll();
		ch_dong.add("����");
		ch_dong.add("����");
		ch_dong.add("�߱�");
		// add(ch_dong);
	}

	public void JeDong() {
		// ch_dong = new Choice();
		ch_dong.removeAll();
		ch_dong.add("��������");
		ch_dong.add("�쵵��");
		ch_dong.add("�Ѷ��");
		// add(ch_dong);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Choice ch = (Choice) e.getSource();
		String str = ch.getSelectedItem();

		if (str.equals("�����")) {
			System.out.println("�������߾�?");
			SeoulDong();

		} else if (str.equals("����������")) {
			System.out.println("�������߾�?");
			DaeDong();
		} else if (str.equals("���ֱ�����")) {
			System.out.println("�������߾�?");
			GwangDong();
		} else if (str.equals("�λ��")) {
			System.out.println("�λ����߾�?");
			BuDong();
		} else if (str.equals("�뱸������")) {
			System.out.println("�뱸���߾�?");
			DaeguDong();
		} else if (str.equals("���ֽ�")) {
			System.out.println("�������߾�?");
			JeDong();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String str = ch_city.getSelectedItem();
		String str1 = ch_dong.getSelectedItem();
		Object obj = e.getSource();

		if (obj.equals(bt_sub)) {
			String msg = tf_sub.getText();
			System.out.println(str);
			ta_certify.append(str+"  "+str1+"  "+ msg );
			
			
		} else if (obj.equals(bt_lay)) {
			//System.out.println("�Է´�����?");
			String msg = tf_sub.getText();
			registForm.ta_add1.setText(str+"  "+str1);
			registForm.ta_add2.setText(msg);
			this.dispose();
		}

	}

}