/*
 * Collection -Set 학습
 *	Set의 하위 객체 HashSet
 * */

package com.sds.collection;

import java.util.HashSet;
import java.util.Iterator;

import javax.swing.JButton;

public class SetTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Generic Type <> : Collection framework에 채워질 데이터형 결정
		HashSet<JButton> set = new HashSet<JButton>();

		/*
		 * auto boxing - 일반자료형을 넣어도 자동으로 wrapper class의 객체로 변환되는 것 int x =3;
		 * set.add(x);
		 */

		// int x=3;
		// set.add(x);

		// set.add("사과");
		set.add(new JButton("버튼1"));
		set.add(new JButton("버튼"));
		set.add(new JButton("버튼2 "));
		
		Iterator it = set.iterator();
		
		while(it.hasNext()){
			JButton bt = (JButton)it.next();
			System.out.println(bt.getText());
		}

	}

}
