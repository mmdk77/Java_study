/*
 * JTable�� ������ ������ ��, �ְ߰��� �����͸� ó���ϴ� TableModel
 * */

package com.sds.collection;

import javax.swing.table.AbstractTableModel;

public class PetModel extends AbstractTableModel {
	String[] column={"�̸�","����","����"};
	String[][]  dog={
			{"�ǻ�","���","��"},
			{"������","������","��"},
			{"�����","�˰�","��"}
	};

	@Override
	public String getColumnName(int col) {
		// TODO Auto-generated method stub
		return column[col];
	}
	//JTable�� ȣ���ϴ� Method
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