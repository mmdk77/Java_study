package com.sds.stream;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Editor extends JFrame implements ActionListener {
	JPanel p_west, p_east, p_center, p_north;
	JMenuBar menuBar;
	JMenu file, edit, view;
	JMenuItem openItem, newItem, closeItem, saveItem, otherItem, quitItem;
	JScrollPane scroll;
	JTextArea area;

	JFileChooser chooser;

	public Editor() {
		// TODO Auto-generated constructor stub
		super("에디터");
		chooser = new JFileChooser();
		//MenuBar+Menu 생성
		menuBar = new JMenuBar();
		file = new JMenu("file");
		edit = new JMenu("edit");
		view = new JMenu("view");
		
		//MenuBar에 추가
		this.setJMenuBar(menuBar);
		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(view);
		
		//MenuItem 생성
		openItem = new JMenuItem("open");
		newItem = new JMenuItem("new");
		closeItem = new JMenuItem("close");
		saveItem = new JMenuItem("save");
		otherItem = new JMenuItem("other save");
		quitItem = new JMenuItem("quit");
		
		//Menu에 추가
		file.add(openItem);
		file.add(newItem);
		file.add(closeItem);
		file.addSeparator();
		file.add(saveItem);
		file.add(otherItem);
		file.addSeparator();
		file.add(quitItem);
		
		area = new JTextArea();
		scroll = new JScrollPane(area);

		add(scroll);
		
		
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();

		if (obj == openItem) {
			int result = chooser.showOpenDialog(this);
			if (result == JFileChooser.APPROVE_OPTION) {
				File file = chooser.getSelectedFile();
				file.getAbsolutePath();

			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Editor();
	}



}
