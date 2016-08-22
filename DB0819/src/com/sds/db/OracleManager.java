/*오직 오라클 데이터베이스에 대한 쿼리문 실행 객체*/

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
	
	//모든 레코드 조회
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
