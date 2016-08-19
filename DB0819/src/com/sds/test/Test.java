package com.sds.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:oracle:thin:@localhost:1521:XE"; // Oracle DB����
		String user = "java0819";
		String password = "java0819";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			// ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε�");
			// DB���ӽõ�
			// Connection �������̽��� ���� ������ �޸𸮿� �ö��
			con = DriverManager.getConnection(url, user, password);
			if (con != null) {
				System.out.println("���Ӽ���");

				// Query�� ����
				String sql = "select * from topcategory";
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery(); // ResultSet - Record���ٽ�
				while (rs.next()) {
					String title = rs.getString("title");
					int id = rs.getInt("topcategory_id");
					System.out.println(id + title);
				}

			} else {
				System.out.println("���ӽ���");
			}
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("����̹� ����");
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
			}
			if(pstmt!=null){
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con!=null){
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}