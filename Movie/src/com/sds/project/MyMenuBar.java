/*
 * menuItem�� ���õ� �̺�Ʈ�� actionPerformed���� �����ϱ�
 * */

package com.sds.project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyMenuBar extends JMenuBar implements ActionListener {
	JMenu[] menu;
	ArrayList<JMenuItem[]> menuItem;
	String[] menuList;
	ArrayList<String[]> menuItemList;

	public MyMenuBar(String[] menuList, ArrayList<String[]> menuItemList) {
		this.menuList = menuList;
		this.menuItemList = menuItemList;
		menu = new JMenu[menuList.length];
		menuItem = new ArrayList<JMenuItem[]>();
		for (int i = 0; i < menuList.length; i++) {
			// menu�� menuList�� text�� �־� �����Ѵ�.
			menu[i] = new JMenu(menuList[i]);
			// menu[i]��°�� menuItem[i]��° JmenuItem�� ���δ�.
			{
				// JMenuItem[]�� menuItemList��[i]��° String[]�� �߰��Ѵ�.
				JMenuItem[] item = new JMenuItem[menuItemList.get(i).length];
				for (int j = 0; j < menuItemList.get(i).length; j++) {
					// System.out.println(menuItemList.get(i)[j]);
					item[j] = new JMenuItem(menuItemList.get(i)[j]);
					item[j].addActionListener(this);
				}
				menuItem.add(item);
				for (int j = 0; j < menuItem.get(i).length; j++) {
					menu[i].add(menuItem.get(i)[j]);
				}
			}
			// menuBar�� menu���δ�.
			this.add(menu[i]);
		}

	}

	// �޴��� ���� �̺�Ʈ ����
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj.equals(menuItem.get(0)[0])) {
			System.out.println("��ȣ");
		}

	}
}
