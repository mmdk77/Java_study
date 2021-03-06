package loginForm;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends JFrame {
	JFrame frame;
	JPanel panel_title,panel_id,panel_pwd,panel_btn;
	JTextField tf_id,tf_pwd;
	JLabel label_title,label_id,label_pwd;
	JButton btn_ok,btn_cancel;
	
	public Login() {
		// TODO Auto-generated constructor stub
		//Frame 설정
		super("로그인");
		this.setSize(400,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		
		//각종 컴포넌트 생성
		panel_title = new JPanel();
		label_title = new JLabel("로그인");
	
		panel_id = new JPanel();
		label_id = new JLabel("ID");
		tf_id = new JTextField(15);
		
		panel_pwd = new JPanel();
		label_pwd = new JLabel("Password");
		tf_pwd = new JTextField(15);				
		
		panel_btn = new JPanel();
		btn_ok = new JButton("확인");
		btn_cancel = new JButton("취소");
		
		
		//컴포넌트 부착 -로그인 제목
		panel_title.add(label_title);
		
		//panel_id - label,textfield
		panel_id.add(label_id);
		panel_id.add(tf_id);
		
		//panel_pwd - label, textfile
		panel_pwd.add(label_pwd);
		panel_pwd.add(tf_pwd);
		
		//button
		panel_btn.add(btn_ok);
		panel_btn.add(btn_cancel);
				
		//프레임에 Panel부착
		this.add(panel_title);
		this.add(panel_id);
		this.add(panel_pwd);
		this.add(panel_btn);				
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Login();
	}

}
