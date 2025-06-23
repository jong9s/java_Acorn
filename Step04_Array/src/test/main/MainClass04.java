package test.main;

import test.mypac.MemberInfo;

public class MainClass04 {
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
		MemberInfo[] mem = {m1, m2, m3};
		
		MemberInfo[] mem2 = new MemberInfo[3];
		mem2[0] = m1;
		mem2[1] = m2;
		mem2[2] = m3;
		
		MemberInfo[] mem3 = {null, null, null};
		mem3[0] = m1;
		mem3[1] = m2;
		mem3[2] = m3;
	}
}
