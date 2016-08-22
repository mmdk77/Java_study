package com.sds.db;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class MemberApp{
	//������ ��ȸ(DML)
	String url="jdbc:mariadb://localhost:3306/iot"; //DB���� ���� URL�� �ٸ�
	String user="root";
	String password="";
	


	Connection con; //������, ���� ������ ����
	PreparedStatement pstmt;
	ResultSet rs;

	public MemberApp(){
	
		
		try{
			//����̹� �ε�
			Class.forName("org.mariadb.jdbc.Driver");

			//MariaDB ����
			con = DriverManager.getConnection(url,user,password);
			if(con!=null){
				System.out.println("���Ӽ���");
				//select ��ȸ
				String sql="select * from member2";
				pstmt = con.preparedStatement(sql);				
				rs = pstmt.executeQuery();//�������� �� ���
				while(rs.next()){
					String name = rs.getString("name");
					System.out.println(name);
					String age = rs.getInt("age");
					System.out.println(age);
				}

			}else{
				System.out.println("���ӽ���");
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
