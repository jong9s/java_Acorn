package test.main;

import test.mypac.Weapon;

public class MainClass06 {

	public static void main(String[] args) {
		
		/*
		 *  - Cyber 공간을 공격하고 싶다
		 *  - 클래스 파일을 따로 만들기 싫다 => Local Inner Class 로 만들면 된다.
		 *  - 근데 생각해보면 MyWeapon, SkyWeapon, NavalWeapon, SpaceWeapon 등의 type 은 필요없다
		 *    따라서 클래스의 이름을 짓기도 졸라 귀찮음 => 익명의 Local Inner Class 를 활용!
		 */
		
		Weapon w1 = new Weapon() {		
			@Override
			public void attack() {
				prepare();
				System.out.println("사이버 공격");
			}
		};
		w1.attack();
		
		/*
		 *  가상(Virtual) 공간을 공격해야 한다.
		 *  익명의 Local Inner Class 를 이용해서 Weapon type 객체를 생성해서 공격할 예정인데
		 *  1번만 공격할거야 => 위처럼 w1 이라는 변수를 만들지 않고 1회용으로 객체를 만들어서 사용하면 된다.
		 */
		
		new Weapon() {
			@Override
			public void attack() {
				prepare();
				System.out.println("가상 공격");
				
			}
		}.attack();
	}

}
