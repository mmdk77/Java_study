/*
 * ���ӿ� ������ ��ü�� �����ϴ� Ŭ����
 * ��ü�� ���� ������ �����ͺ��̽�ȭ ���� �޸𸮻� ����
 * ��ü�� ��� ���� ==> Collection Framework*/

package com.sds.game;

import java.util.ArrayList;

public class ObjectManager {

	ArrayList<GameObj> objList = new ArrayList<GameObj>();	//�޸𸮻� �����ͺ��̽�

	//Object �߰�
	public void addObject(GameObj go){
		objList.add(go);
	}
	//Object ����
	public void removeObject(GameObj go){
		objList.remove(go);
	}
}