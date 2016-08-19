package com.sds.db;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class BookMain extends JFrame implements ItemListener, ActionListener {

	JPanel p_west; // ���� �Է��� �г�
	Choice ch_top, ch_sub; // ��,���� ī�װ��� ���
	JTextField t_name, t_publisher, t_author, t_price;
	JButton bt_regist;

	JPanel p_north; // ���� �Է� ��
	Choice ch_category;
	JTextField t_keyword;
	JButton bt_search;

	JScrollPane scroll;
	JTable table;

	// DB��������
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String user = "java0819";
	String password = "java0819";

	// DB����
	Connection con; // ���������� ����
	PreparedStatement pstmt;
	ResultSet rs;

	public BookMain() {
		// TODO Auto-generated constructor stub

		p_west = new JPanel();
		ch_top = new Choice();
		ch_sub = new Choice();
		t_name = new JTextField(13);
		t_publisher = new JTextField(13);
		t_author = new JTextField(13);
		t_price = new JTextField(13);
		bt_regist = new JButton("���");

		p_north = new JPanel();
		ch_category = new Choice();
		t_keyword = new JTextField(20);
		bt_search = new JButton("�˻�");

		table = new JTable();
		scroll = new JScrollPane(table);

		p_west.add(ch_top);
		p_west.add(ch_sub);
		p_west.add(t_name);
		p_west.add(t_publisher);
		p_west.add(t_author);
		p_west.add(t_price);
		p_west.add(bt_regist);

		ch_top.add("�� �á�");
		ch_sub.add("�� �á�");

		p_west.setPreferredSize(new Dimension(200, 600));
		ch_top.setPreferredSize(new Dimension(120, 30));
		ch_sub.setPreferredSize(new Dimension(120, 30));
		p_west.setBackground(Color.CYAN);
		add(p_west, BorderLayout.WEST);

		p_north.setBackground(Color.green);
		p_north.add(ch_category);
		p_north.add(t_keyword);
		p_north.add(bt_search);

		ch_category.add("������");
		ch_category.add("���ǻ�");
		ch_category.add("����");

		add(p_north, BorderLayout.NORTH);
		add(scroll);

		// container�� �̺�Ʈ ����
		ch_top.addItemListener(this);
		bt_regist.addActionListener(this);

		// Window - windowListener
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				// TODO Auto-generated method stub
				// DB�ݱ�
				if (con != null) {
					try {
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.exit(0);
			}

		});

		setSize(800, 600);
		setVisible(true);
		setLocationRelativeTo(null);

		// ������� ��������
		getTopCategory();
	}

	public void connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// ����
			con = DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void getTopCategory() {
		// ���� ī�װ��� ��������
		try {
			String sql = "select * from topcategory";
			connect();

			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String title = rs.getString("title");
				ch_top.add(title);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	// ���� ī�װ��� ��� ��������
	public void getSubCategory(String title) {

		StringBuffer sql = new StringBuffer();
		sql.append(" select * from subcategory where topcategory_id=");
		sql.append("(select topcategory_id from topcategory where title='" + title + "')");

		System.out.println(sql.toString());
		connect();

		// ��������
		try {
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();

			ch_sub.removeAll();
			ch_sub.add("�� �á�");
			while (rs.next()) {
				ch_sub.add(rs.getString("title"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public void addBook() {
		String sql = "insert into book(book_id,subcategory_id,bookname,publisher,author,price)";
		sql = sql + "values(seq_book.nextval,)";

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		Choice ch = (Choice) e.getSource();
		getSubCategory(ch.getSelectedItem());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		addBook();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BookMain();
	}

}