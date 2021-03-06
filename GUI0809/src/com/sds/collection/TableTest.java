/*
 * Swing에서 data출력 및 관리를 위한 컴포넌트 - JTable
 * 
 * JTable은 유지 보수를 위한 디자인과 모델(로직+데이터)을 분리시킨 모델을 추구
 * JTable은 View역활만하며 보여지는 data는 TableModel.
 * */

package com.sds.collection;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class TableTest extends JFrame{
	/*
	String[] column = {"번호","이름","비밀번호","이메일"};
	String[][] data={
			{"1","홍길동","0000","honggildong@email.com"},
			{"2","김길동","0001","kimgildong@email.com"},
			{"3","이길동","0002","leegildong@email.com"}
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
