package test.main;

import java.io.File;
import java.io.IOException;
// java.util 패키지에 있는 Random 클래스를 import
import java.util.Random;
import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) throws IOException {
		System.out.println("main 메소드가 시작 되었습니다.");
		// 기본 데이터 type 의 값이 담길 수 있는 빈 공간은 만들 수 없다
		// int num = null;
		int num; // 선언만하면 변수가 만들어지지 않는다. (만들어질 준비만 한다)
		num = 10; // 값을 넣는 시점에 변수가 만들어진다.
		
		// 문자열을 다룰 때는 String type 을 사용하면 된다.
		String name = "Seo";
		
		String str = null;
		// 랜덤한 숫자를 얻어내고 싶다면? 랜덤한 숫자를 생성해주는 기능을 가지고 있는 객체가 필요하다.
		Random ran = null;
		ran = new Random();
		boolean result1 = ran.nextBoolean();
		System.out.println(result1);
		
		int result2 = ran.nextInt();
		System.out.println(result2);
		
		// 콘솔창에 문자열을 출력하고 싶다면? 콘솔창에 문자열을 출력해주는 기능을 가지고 있는 객체가 필요하다.
		
		// 파일 시스템에 memo.txt 파일을 만들고 싶다면? 파일을 만들 수 있는 기능을 가지고 있는 객체가 필요하다.
		File f = new File("C:/playground/memo.txt");
		f.createNewFile();
		
		// 콘솔창에 사용자가 입력한 숫자나 문자열을 읽어오고 싶다면,
		// 입력된 내용을 정수(int)나 문자열(String) 등으로 변환해주는 기능을 가진 객체가 필요하다.
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		
		System.out.println("main 메소드가 종료 됩니다.");
		
	}
}
