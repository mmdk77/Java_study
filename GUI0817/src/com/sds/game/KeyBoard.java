/*
 * 
 * Ű���� �̺�Ʈ 
 * */

package com.sds.game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyBoard extends KeyAdapter {

	GameObject gameObj;
	ObjectManager obj_manager;
	Hero hero;

	// ���� ObjManager ������.
	public KeyBoard(ObjectManager obj_manager) {
		// TODO Auto-generated constructor stub
		this.obj_manager = obj_manager;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int result = e.getKeyCode();

		for (int i = 0; i < obj_manager.listObj.size(); i++) {
			gameObj = obj_manager.listObj.get(i);
			if (gameObj.equals("Hero")) {
				switch (result) {
				case KeyEvent.VK_LEFT:
					gameObj.velX=-10;
					break;
				case KeyEvent.VK_UP:
					gameObj.velY=-10;
					break;
				case KeyEvent.VK_RIGHT:
					gameObj.velX=+10;
					break;
				case KeyEvent.VK_DOWN:
					gameObj.velY=+10;
					break;

				}
			}
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		int result = e.getKeyCode();
		for (int i = 0; i < obj_manager.listObj.size(); i++) {
			gameObj = obj_manager.listObj.get(i);
			if (gameObj.equals("Hero")) {
				switch (result) {
				case KeyEvent.VK_LEFT:
					gameObj.velX=-10;
					break;
				case KeyEvent.VK_UP:
					gameObj.velY=-10;
					break;
				case KeyEvent.VK_RIGHT:
					gameObj.velX=+10;
					break;
				case KeyEvent.VK_DOWN:
					gameObj.velY=+10;
					break;

					}
				}
			}
		}

}
