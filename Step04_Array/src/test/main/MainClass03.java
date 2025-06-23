package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		// String type 을 담을 수 있는 null 로 초기화된 방 3개짜리 배열 객체 생성
		String[] names = {null, null, null};
		names[0] = "앙";
		names[1] = "서";
		names[2] = "김";
		// names[3] = "xxx"; // 예외발생
		
		// String type 을 담을 수 있는 null 로 초기화된 방 100 개짜리 배열 객체 생성
		String[] names2 = new String[100];
		names2[0] = "aaa";
		names2[1] = "bbb";
		
	}
}
