/*
 * Jtable�� ������ ������ ��, ȸ�����õ� �����͸� ó���� TableModel
 * 
 * TableModel�� JTable���� ��� Method�� ȣ��.
*/

package com.sds.collection;

import javax.swing.table.AbstractTableModel;

public class MemberModel extends AbstractTableModel {
	
	String[] column = {"��ȣ","�̸�","��й�ȣ","�̸���"};
	String[][] data={
			{"1","ȫ�浿","0000","honggildong@email.com"},
			{"2","��浿","0001","kimgildong@email.com"},
			{"3","�̱浿","0002","leegildong@email.com"}
	};
	@Override
	public String getColumnName(int col) {
		// TODO Auto-generated method stub
		System.out.println(col+"��° ����>>"+column[col]);
		return column[col];
	}
	@Override
	//�� �÷��� ����
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return column.length;
	}

	@Override
	//�� ���ڵ� ��
	public int getRowCount() {
		// TODO Auto-generated method stub
		return data.length;
	}

	@Override
	//�� �׸� ������ ������
	public Object getValueAt(int row, int col) {
		// TODO Auto-generated method stub
		
		return data[row][col];
	}
	

}