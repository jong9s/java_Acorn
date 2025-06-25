package test.main;

public class MainClass01 {

	// static 영역에 만들어지는 main() 메소드
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작됨");
		
		// 클래스명에 . 찍어서 static 메소드 호출하기
		MainClass01.test();
		test(); // 같은 Class 에서 호출되고 있기 때문에 앞에 클래스명 생략이 가능하다
		System.out.println("main 메소드 종료됨");
	}

	public static void test() {
		System.out.println("test() 메소드 호출됨");
	}
}
