package test.main;

import test.mypac.MemberDto;

public class MainClass06 {
	public static void main(String[] args) {
		MemberDto dto1 = new MemberDto();
		dto1.setNum(1);
		dto1.setName("서종훈");
		dto1.setAddr("구리시");
		
		MemberDto dto2 = new MemberDto(2, "김구라", "노량진");
		MemberDto dto3 = new MemberDto(3, "해골", "행신동");
		
		// 위에서 생성한 MemberDto 객체의 참조값 3개를 순서대로 배열에 담아보세요.
		
		MemberDto[] members = {dto1, dto2, dto3};
		
		MemberDto[] a = members;
		MemberDto b = members[1];
		int num = members[1].getNum(); // 2
		String name = members[2].getName(); // "해골"
		String addr = members[0].getAddr(); // "구리시"
		
	}
}
