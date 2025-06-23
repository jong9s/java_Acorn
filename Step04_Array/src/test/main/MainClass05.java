package test.main;

import test.mypac.MemberInfo;

public class MainClass05 {
	public static void main(String[] args) {
		MemberInfo m1 = new MemberInfo();
		m1.num = 1;
		m1.name = "서종훈";
		m1.addr = "구리시";

		MemberInfo m2 = new MemberInfo();
		m2.num = 2;
		m2.name = "김구라";
		m2.addr = "노량진";

		MemberInfo m3 = new MemberInfo();
		m3.num = 3;
		m3.name = "해골";
		m3.addr = "행신동";

		// 위에서 생성한 MemberInfo 객체의 참조값 3개를 배열에 순서대로 담아보세요.
		MemberInfo[] mem = { m1, m2, m3 }; // 배열
		MemberInfo b = mem[0]; // 배열의 0번방 MemberInfo 객체
		int c = mem[0].num; // 회원의 번호 1
		String d = mem[1].name; // 회원의 이름 "서종훈"
		String e = mem[2].addr; // 회원의 주소 "구리시"
		mem[0].printData();
	}
}
