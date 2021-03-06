package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventTest extends JFrame implements ActionListener{
		JPanel panel;
		JButton btn ;
		JButton btn2;
		
		public EventTest(){
			super("이벤트 테스트");
			panel = new JPanel();
			btn = new JButton("버튼");
			btn2 = new JButton("버튼2");
			
			panel.add(btn);
			panel.add(btn2);
			
			this.setLayout(new FlowLayout());
			
			this.add(panel);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setSize(300, 400);
			this.setVisible(true);
			
			btn.addActionListener(this);
			btn2.addActionListener(this);
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// actionPerformed ==> addActionListener의 이벤트 실행시 정보 변환.
		System.out.println(e);
		
		//ActionEvent는 다양한 컴포넌트들도 Event가 발생 가능성으로 인한 최상위 객체인 Object형을 사용.
		Object obj = e.getSource();
		if(obj==btn){
			System.out.println("버튼");
		}else if(obj.equals(btn2)){
			System.out.println("버튼2");
		}
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new EventTest();
	}
}
