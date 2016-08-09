/*
 * Swing���� data��� �� ������ ���� ������Ʈ - JTable
 * 
 * JTable�� ���� ������ ���� �����ΰ� ��(����+������)�� �и���Ų ���� �߱�
 * JTable�� View��Ȱ���ϸ� �������� data�� TableModel.
 * */

package com.sds.collection;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class TableTest extends JFrame{
	/*
	String[] column = {"��ȣ","�̸�","��й�ȣ","�̸���"};
	String[][] data={
			{"1","ȫ�浿","0000","honggildong@email.com"},
			{"2","��浿","0001","kimgildong@email.com"},
			{"3","�̱浿","0002","leegildong@email.com"}
	};
	*/
	JTable table;
	JScrollPane sp;
	//MemberModel member_model;
	//PetModel pet_model;
	
	TableModel model;
	
	
	public TableTest() {
		// TODO Auto-generated constructor stub
		//table = new JTable(data,column);
		//member_model = new MemberModel();
		//pet_model = new PetModel();
		
		//table = new JTable(member_model);
		//table = new JTable(pet_model);
		
		table = new JTable(model = new PetModel());
		sp = new JScrollPane(table);
		
		add(sp);
			
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TableTest();
	}

}