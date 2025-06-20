package test.main;

import test.mypac.MemberDto;
import test.mypac.PostDto;

public class MainClass14 {
	public static void main(String[] args) {
		new MemberDto();
		MemberDto dto = new MemberDto();
		
		MemberDto dto2 = new MemberDto(1, "김구라", "노량진");
		
		MemberDto dto3 = new MemberDto();
		dto3.setNum(2);
		dto3.setName("서종훈");
		dto3.setAddr("구리시");
		
		PostDto dto4 = new PostDto(1000, "안녕하세요", "김씨");
	}
}
