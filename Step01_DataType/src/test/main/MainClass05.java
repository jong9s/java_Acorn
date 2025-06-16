package test.main;

/*
 * 	[ Java 참조 데이터 type ]
 * 
 * 	String type
 * 
 * 	- 문자열을 다룰때 사용하는 데이터 type 이다.
 */
public class MainClass05 {
	public static void main(String[] args) {
		// "서종훈" 이라는 String type 객체를 heap 영역(사물함)에 만들고 그 참조값을 변수에 담기
		String name = "서종훈";
		// name 안에 있는 참조값을 tmp 변수에 복사해주기
		String tmp = name;
		// "해골" 이라는 String type 객체를 heap 영역에 만들고 그 참조값을 name 변수에 덮어쓰기
		name = "해골";
		// name 변수를 비우기 ( null 은 참조 데이터 type 이 담길 수 있는 빈 공간을 의미한다)
		name = null;

		// 변수 안에 참조값이 들어가는게 아니고 실제 값이 들어가는 기본 데이터 type
		int num = 10;
		double num2 = 10.2;
		boolean isRun = true;
		// 변수 안에 참조값이 들어가는 참조 데이터 type 인 String
		String yourName = "빵빵이";
		
	}
}
