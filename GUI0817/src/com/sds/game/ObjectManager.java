/*
 * Game Thread���� ȭ�鿡 ������ ������Ʈ���� ������ ó���ϴٺ��� ������������ ������
 * �ϰ����̸鼭 ü�輺�ִ� ��ü������ ���簡 �ʿ�,
 * 
 * */

package com.sds.game;

import java.util.ArrayList;

public class ObjectManager {
	ArrayList<GameObject> listObj = new ArrayList<GameObject>();
	
	
	//ȭ����� = Collection Framework�� �߰�
	public void addObject(GameObject gameObj){
		listObj.add(gameObj);
	}
	
	//ȭ������=  Collection Framework�� ����
	public void removeObject(GameObject gameObj){
		listObj.remove(gameObj);
	}
}
