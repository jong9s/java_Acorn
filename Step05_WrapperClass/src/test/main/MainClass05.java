package test.main;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		
		/*
		 *  1. 콘솔창으로부터 입력받을 수 있는 Scanner 객체를 생성해서 그 참조값을 scan 이라는 지역변수에 담아보세요.
		 *  2. scan 에 담겨있는 Scanner 객체를 2번 사용해서 콘솔창으로부터 숫자를 2개 입력받으세요.
		 *  3. 입력받은 숫자(문자열)를 실제 숫자로 변경하세요
		 *  4. 두 수의 합을 구해서 콘솔창에 이쁘게 출력해보세요.
		 *  --------------------------------------------
		 *  출력 예시 :5
		 * 
		 *  첫번째 숫자입력:
		 *  10
		 *  두번째 숫자입력:
		 *  10 과 20 의 합은 : 30
		 *
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자 입력: ");
		String str = scan.nextLine();
		double i = Double.parseDouble(str);
		
		System.out.println("두번째 숫자 입력: ");
		String str2 = scan.nextLine();
		double j = Double.parseDouble(str2);
		
		double result = (i + j);
		System.out.println(i+" 와 "+j+" 의 합은 : " + result);
	}

}
