/*
 * Collection -Set �н�
 *	Set�� ���� ��ü HashSet
 * */

package com.sds.collection;

import java.util.HashSet;
import java.util.Iterator;

import javax.swing.JButton;

public class SetTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Generic Type <> : Collection framework�� ä���� �������� ����
		HashSet<JButton> set = new HashSet<JButton>();

		/*
		 * auto boxing - �Ϲ��ڷ����� �־ �ڵ����� wrapper class�� ��ü�� ��ȯ�Ǵ� �� int x =3;
		 * set.add(x);
		 */

		// int x=3;
		// set.add(x);

		// set.add("���");
		set.add(new JButton("��ư1"));
		set.add(new JButton("��ư"));
		set.add(new JButton("��ư2 "));
		
		Iterator it = set.iterator();
		
		while(it.hasNext()){
			JButton bt = (JButton)it.next();
			System.out.println(bt.getText());
		}

	}

}