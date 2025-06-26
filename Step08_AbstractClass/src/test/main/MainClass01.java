package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass01 {
	public static void main(String[] args) {
		// 추상 클래스도 data type 의 역할을 할 수가 있다.
		Weapon w1 = null;
		
		// 그렇다면 Weapon type 의 참조값은 어떻게 얻어낼까?
		// Weapon w2 = new Weapon();
		
		// Weapon 추상클래스를 상속받은 MyWeapon 클래스로 객체를 생성해서 Weapon type 의 참조값 얻어내기
		Weapon w2 = new MyWeapon();
		w2.prepare();
		w2.attack();
	}
}
