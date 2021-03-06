/*
 * Jtable에 보여질 데이터 중, 회원관련된 데이터를 처리할 TableModel
 * 
 * TableModel은 JTable에서 모든 Method를 호출.
*/

package com.sds.collection;

import javax.swing.table.AbstractTableModel;

public class MemberModel extends AbstractTableModel {
	
	String[] column = {"번호","이름","비밀번호","이메일"};
	String[][] data={
			{"1","홍길동","0000","honggildong@email.com"},
			{"2","김길동","0001","kimgildong@email.com"},
			{"3","이길동","0002","leegildong@email.com"}
	};
	@Override
	public String getColumnName(int col) {
		// TODO Auto-generated method stub
		System.out.println(col+"번째 제목>>"+column[col]);
		return column[col];
	}
	@Override
	//총 컬럼의 갯수
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return column.length;
	}

	@Override
	//총 레코드 수
	public int getRowCount() {
		// TODO Auto-generated method stub
		return data.length;
	}

	@Override
	//각 항목에 보여질 데이터
	public Object getValueAt(int row, int col) {
		// TODO Auto-generated method stub
		
		return data[row][col];
	}
	

}
