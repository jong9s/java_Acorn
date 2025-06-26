package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass07 {
	public static void main(String[] args) {
		/*
		 * 여기서 아래에 정의된 useWeapon() 메소드를 호출하려면?
		 */
		Weapon w1 = new Weapon() {
			@Override
			public void attack() {

			}
		};
		useWeapon(w1);
		
		Weapon w2 = new MyWeapon() {
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				super.attack();
			}
		};
		useWeapon(w2);
		
		useWeapon(new Weapon() {
			@Override
			public void attack() {
				System.out.println("임의 출격");
			}
		});
	}

	public static void useWeapon(Weapon w) {
		w.attack();
	}
}
