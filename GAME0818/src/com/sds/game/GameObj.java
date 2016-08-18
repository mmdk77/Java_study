/*화면에 등장할 모든 게임 오브젝트 
 * 구현메소드와 속성을 정의하기위한 최상위 클래스*/

package com.sds.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

abstract public class GameObj {
	// 오브젝트 속성
	int x;
	int y;
	int width;
	int height;
	int velX;
	int velY;
	String name;
	ObjectManager objectManager;
	Rectangle rect;
	/*
	 * 게임 이미지 Toolkit kit;
	 */

	public GameObj(int x, int y, int width, int height, String name, ObjectManager objectManager) {
		// TODO Auto-generated constructor stub

		// 오브젝트를 담기위한 생성자
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.name = name;
		this.objectManager = objectManager;
		rect = new Rectangle(x, y, width, height);
		// kit = Toolkit.getDefaultToolkit();
	}

	abstract public void tick();

	abstract public void render(Graphics g);

	// ClassPath상에 존재하는 이미지명만으로 Image객체를 반환

	public Image getImage(String name) {
		Image img = null; // 지역변수는 컴파일러가 초기화 X, 개발자가 반드시 초기화!!!
		Class myClass = this.getClass();
		URL url = myClass.getClassLoader().getResource(name);
		try {
			img = ImageIO.read(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return img;
	}

	// Rectangle 객체가 생성은 되었지만, 눈에 보여지지는
	// 않으므로, 개발시에만 시각화 시킬 수 있는 메서드 정의..
	// 개발후에는 호출 X
	public void showRect(Graphics g) {
		// Graphics 의 기능에 2차원 그래픽 관련된 기능이 더 보강..
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.YELLOW);
		g2.draw(rect);
	}

}
