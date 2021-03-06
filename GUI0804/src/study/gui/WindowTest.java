/*
 * 자바를 포함한 대부분의 응용프로그램에서는 GUI 컴포넌트를 윈도우에 올릴시 배치방법을 결정짓는 기능을 지원한다.
 * 자바는 LayManager라는 객체를 지원하고 유형에 맞는 배치관리자를 선택하여 사용하면 된다.
 * 
 * 1.BorderLayout ( 동/서/남/북/Center 의 방위를 지원하는 배치관리자 )
 * 2.FlowLayout (윈도우 크기에 따라 흐르는(?) 배치관리자)
 * 3.GridLayout (격자(표) 모양의 배치관리자)
 * 4.GridBagLayout (GridLayout의 기능을 세부적으로 처리하는 배치관리자)
 * 5.CardLayout (화면의 보여질 컴포넌트를 오직 1개만 노출시키는 배치관리자)
 * */
package study.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class WindowTest {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		
		
		Button btn = new Button("확인");
		Label lb_id = new Label("ID");
		Label lb_pwd = new Label("PWD");
		TextField tf_id = new TextField(15);
		TextField tf_pwd = new TextField(15);
		
		
		//프레임에 FlowLayout 적용
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		f.add(lb_id); //ID label
		f.add(tf_id); //ID TextField
		f.add(lb_pwd); //Password label
		f.add(tf_pwd); //Password textfield
		f.add(btn);		//Button
		
		f.setVisible(true);
		f.setSize(200, 120);
		
		
		
		
		
	}
}
