/*���� ����Ŭ �����ͺ��̽��� ���� ������ ���� ��ü*/

package com.sds.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OracleManager {
	
	Connection con;
	PreparedStatement pstmt;
	
	public OracleManager(Connection con) {
		// TODO Auto-generated constructor stub
		this.con = con;
	}
	
	//��� ���ڵ� ��ȸ
	public void selectAll(){
		
		String sql ="select * from member2";
		try {
			pstmt = con.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
