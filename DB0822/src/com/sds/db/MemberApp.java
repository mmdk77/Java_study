package com.sds.db;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class MemberApp{
	//데이터 조회(DML)
	String url="jdbc:mariadb://localhost:3306/iot"; //DB마다 접속 URL이 다름
	String user="root";
	String password="";
	


	Connection con; //접속후, 접속 정보를 보유
	PreparedStatement pstmt;
	ResultSet rs;

	public MemberApp(){
	
		
		try{
			//드라이버 로드
			Class.forName("org.mariadb.jdbc.Driver");

			//MariaDB 접속
			con = DriverManager.getConnection(url,user,password);
			if(con!=null){
				System.out.println("접속성공");
				//select 조회
				String sql="select * from member2";
				pstmt = con.preparedStatement(sql);				
				rs = pstmt.executeQuery();//쿼리실행 후 결과
				while(rs.next()){
					String name = rs.getString("name");
					System.out.println(name);
					String age = rs.getInt("age");
					System.out.println(age);
				}

			}else{
				System.out.println("접속실패");
			}

		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(rs!=null){
				try{
					rs.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
			if(pstmt!=null){
				try{
					rs.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
			if(con!=null){
				try{
					rs.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args){
		
		
		 new MemberApp();
	
	}
}
