package test.main;

import test.util.MyUtil;

public class MainClass05 {
	public static void main(String[] args) {
		// static 필드 참조
		String a = MyUtil.version;
		// static 메소드 호출
		MyUtil.send();
		
		MyUtil util = new MyUtil();
		util.owner = "서종훈";
		
		MyUtil util2 = new MyUtil();
		util2.owner = "서종후";
		
		System.out.println(util.owner);
		System.out.println(util2.owner);
	}
}
