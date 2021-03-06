package com.sds.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:oracle:thin:@localhost:1521:XE"; // Oracle DB접속
		String user = "java0819";
		String password = "java0819";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			// 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드");
			// DB접속시도
			// Connection 인터페이스는 접속 성공시 메모리에 올라옴
			con = DriverManager.getConnection(url, user, password);
			if (con != null) {
				System.out.println("접속성공");

				// Query문 수행
				String sql = "select * from topcategory";
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery(); // ResultSet - Record접근시
				while (rs.next()) {
					String title = rs.getString("title");
					int id = rs.getInt("topcategory_id");
					System.out.println(id + title);
				}

			} else {
				System.out.println("접속실패");
			}
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("드라이버 실패");
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
