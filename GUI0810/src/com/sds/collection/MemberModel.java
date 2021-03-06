package com.sds.collection;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class MemberModel extends AbstractTableModel{
	String[] column = {"ID","Password","Name"};
	//String[][] data = new String[0][0];
		
	ArrayList<String[]> list = new ArrayList<String[]>();
	
	@Override
	public void setValueAt(Object value	, int row, int col) {
		// TODO Auto-generated method stub
		System.out.println(value+","+row+","+col);
		String[] record = list.get(row);
		record[col]=(String)value;
		
	}
	@Override
	public boolean isCellEditable(int row, int col) {
		// TODO Auto-generated method stub
		if(col==1){
			return false;
		}else{
			return true;
		}
	}
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
		return list.size();
	}

	@Override
	public Object getValueAt(int row	, int col) {
		// TODO Auto-generated method stub
		String[] record = list.get(row);
		return record[col];
	}
	
	

}
