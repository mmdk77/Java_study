package com.sds.gui;

import javax.swing.table.AbstractTableModel;

public class MemberTable extends AbstractTableModel {

	String[] column = {"ID","Password","Name"};
	String[][] data ={
			{"asdf","1234","��"}
			
	} ;
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return this.column[column];
	}
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return column.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return data.length;
	}

	@Override
	public Object getValueAt(int row, int col) {
		// TODO Auto-generated method stub
		return data[row][col];
	}

}
