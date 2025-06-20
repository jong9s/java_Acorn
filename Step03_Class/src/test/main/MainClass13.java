package test.main;

import test.mypac.MemberDto;

public class MainClass13 {
	public static void main(String[] args) {
		MemberDto dto = new MemberDto();
		dto.setNum(1);
		dto.setName("서종훈");
		dto.setAddr("구리시");
		
		// dto 객체에 보관된 num, name, addr 를 참조하고 싶다면?
		// 회원의 번호를 콘솔창에 출력하고 싶다면?
		System.out.println(dto.getNum());
		// 회원의 이름을 콘솔창에 출력하고 싶다면?
		System.out.println(dto.getName());
		System.out.println(dto.getAddr());
		
		int num = dto.getNum();
		String name = dto.getName();
		String addr = dto.getAddr();
		
	}
}
