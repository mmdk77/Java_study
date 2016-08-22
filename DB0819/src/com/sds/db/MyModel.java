/*
 * JTable은 디자인만 보여줌 실제적인 테이블에 대한 정보는 모델이 제공*/
package com.sds.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class MyModel extends AbstractTableModel{
	
	String[] colTitle={
			"BOOK_ID",
			"CATEGORY_ID",
			"BOOKNAME",
			"PUBLISHER",
			"AUTHOR",
			"PRICE",
			"REGDATE"
	};
	ArrayList<String[]> data = new ArrayList<String[]>(); 
	
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public MyModel(Connection con) {
		// TODO Auto-generated constructor stub
		this.con = con;
		selectAll();
	}
	//모든레코드 가져오기
	public void selectAll(){
		String sql="select * from book order by book_id asc";
	
		try {
			pstmt = con.prepareStatement(sql);
			rs =	pstmt.executeQuery();
			
			//기존 데이터 삭제
			data.removeAll(data);
			
			while(rs.next()){
				String[] record = new String[colTitle.length] ;
				record[0]= Integer.toString(rs.getInt("BOOK_ID"));
				record[1]= Integer.toString(rs.getInt("SUBCATEGORY_ID"));
				record[2]=rs.getString("BOOKNAME");
				record[3]=rs.getString("PUBLISHER");
				record[4]=rs.getString("AUTHOR");
				record[5]= Integer.toString(rs.getInt("PRICE"));
				record[6]=rs.getString("REGDATE");
				
				data.add(record);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(rs!=null){
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
		}
	    
	}
	
	//레코드 삭제 DML-delete
	public int deleteBook(int book_id){
		int result = 0;
		
		String sql = "delete from book where book_id="+book_id;
		try {
			
			pstmt = con.prepareStatement(sql);
			result = pstmt.executeUpdate();
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(pstmt!=null){
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return result;
		
	}


	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return colTitle.length;
	}
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return colTitle[column];
	}
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return data.size();
	}
	@Override
	public Object getValueAt(int row, int col) {
		// TODO Auto-generated method stub
		String[] record = data.get(row);
		return record[col];
	}

}
