package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		// 1. byte 처리 스트림
		InputStream kbd = System.in;
		// 2. byte 처리 스트림 (65536 가지를 표현할 수 있다) 한글 처리 가능한 객체
		var isr = new InputStreamReader(kbd);
		// BufferedReader 의 생성자로 InputStreamReader 객체를 전달해서 객체 생성
		var br = new BufferedReader(isr);
		
		var br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("입력: ");
		try {
			String line = br.readLine();
			System.out.println("line: " + line);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
