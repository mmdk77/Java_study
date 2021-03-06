/*
 * JTable에 보여질 데이터 중, 애견관련 데이터를 처리하는 TableModel
 * */

package com.sds.collection;

import javax.swing.table.AbstractTableModel;

public class PetModel extends AbstractTableModel {
	String[] column={"이름","종류","성별"};
	String[][]  dog={
			{"뽀삐","비글","남"},
			{"누렁이","진돗개","남"},
			{"방울이","똥개","남"}
	};

	@Override
	public String getColumnName(int col) {
		// TODO Auto-generated method stub
		return column[col];
	}
	//JTable이 호출하는 Method
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return column.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return dog.length;
	}

	@Override
	public Object getValueAt(int row, int col) {
		// TODO Auto-generated method stub
		return dog[row][col];
	}
	

}
