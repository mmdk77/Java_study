/*
 * 게임에 등장할 객체를 관리하는 클래스
 * 객체에 대한 정보를 데이터베이스화 시켜 메모리상에 저장
 * 객체를 모아 관리 ==> Collection Framework*/

package com.sds.game;

import java.util.ArrayList;

public class ObjectManager {

	ArrayList<GameObj> objList = new ArrayList<GameObj>();	//메모리상 데이터베이스

	//Object 추가
	public void addObject(GameObj go){
		objList.add(go);
	}
	//Object 제거
	public void removeObject(GameObj go){
		objList.remove(go);
	}
}
