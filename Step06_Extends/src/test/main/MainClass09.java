package test.main;

import test.company.Department;
import test.company.Employee;
import test.company.Manager;

public class MainClass09 {
	public static void main(String[] args) {
		/*
		 * 		사원이름 : KING
		 * 		급여 : 5000
		 * 		부서명 : 기획부
		 * 		부서의 위치 : 서울
		 * 		
		 * 		위의 정보를 가지는 Manager 객체를 생성해서 참조값 m1 이라는 변수에 담아보세요.
		 * 
		 * 		m1.setPosition() 메소드를 활용해서
		 * 		직위 : 이사
		 * 		정보를 Manager 객체에 넣어보세요
		 */
		
		Manager m1 = new Manager("KING", 5000, new Department("기획부", "서울"));
		
		m1.setPosition("이사");
		m1.printInfo();
		// Manager 는 Employee type 이기도 하다
		Employee m2 = new Manager("KING2", 5000, new Department("기획부", "서울"));
		// m2.printInfo();
		// King2 의 직위를 넣어주려면?
		Manager m3 = (Manager)m2;
		m3.setPosition("부장");
		m2.printInfo();
		m3.printInfo();
	}
}
