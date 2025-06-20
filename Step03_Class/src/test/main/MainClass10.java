package test.main;

import test.mypac.MemberInfo;

public class MainClass10 {
	public static void main(String[] args) {
		/*
		 * 1. MemberInfo 객체를 3개 생성해서 그 참조값을 m1, m2, m3 라는 변수에 각각 담아보세요
		 * 2. m1, m2, m3 에 들어 있는 참조값을 이용해서 3명의 회원정보를 각각의 객체에 담아보세요
		 * 3. 각각의 객체가 가지고 있는 printData() 메소드를 호출해보세요.
		 */
		MemberInfo m1 = new MemberInfo();
		MemberInfo m2 = new MemberInfo();
		MemberInfo m3 = new MemberInfo();

		
		m1.num = 1000;
		m1.name = "서종훈";
		m1.addr = "구리시";

		m2.num = 1001;
		m2.name = "김구라";
		m2.addr = "노량진";

		m3.num = 1002;
		m3.name = "오승민";
		m3.addr = "홍제동";
		
		m1.printData();
		m2.printData();
		m3.printData();
	}
}
