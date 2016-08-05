package gui;

import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Checkbox;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.Choice;

class GuiTest {
	public static void main(String[] args){
	
		Frame win = new Frame();
		win.setVisible(true);
		win.setSize(500,500);
		win.setTitle("������");
		
		Button btn = new Button();
		btn.setLabel("Ȯ��");
		win.add(btn);
	
		FlowLayout flow = new FlowLayout();
		win.setLayout(flow);

		Checkbox[] cb = new Checkbox[20];
		for(int i=0;i<20;i++){
			Checkbox c = new Checkbox(i+"��° �ڽ�");
			cb[i]=c;
			win.add(cb[i]);
		}

		TextField tf = new TextField(20);
		win.add(tf);

		TextArea ta = new TextArea();
		win.add(ta);

		Choice ch = new Choice();
		for(int i=1;i<=12;i++){
			ch.add(Integer.toString(i)+"��");
		}
		win.add(ch);


		
		

	}
}