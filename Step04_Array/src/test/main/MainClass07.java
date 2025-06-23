package test.main;

import java.util.Random;

public class MainClass07 {
	public static void main(String[] args) {
		// Random 객체 생성
		Random ran = new Random();
		int ranNum = ran.nextInt(5);
		
		int ranNum2 = ran.nextInt(10);
		
		int ranNum3 = ran.nextInt(10)+1;
		
		System.out.println(ranNum3);
		
	}
}
