/*
 * Game Thread에서 화면에 등장할 오브젝트들을 일일이 처리하다보면 유지보수성이 떨어짐
 * 일괄정이면서 체계성있는 객체관리할 존재가 필요,
 * 
 * */

package com.sds.game;

import java.util.ArrayList;

public class ObjectManager {
	ArrayList<GameObject> listObj = new ArrayList<GameObject>();
	
	
	//화면등장 = Collection Framework의 추가
	public void addObject(GameObject gameObj){
		listObj.add(gameObj);
	}
	
	//화면제거=  Collection Framework의 제거
	public void removeObject(GameObject gameObj){
		listObj.remove(gameObj);
	}
}
