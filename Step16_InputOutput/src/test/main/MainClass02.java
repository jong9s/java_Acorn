package test.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass02 {
	public static void main(String[] args) {
		// 1. byte 처리 스트림
		InputStream kbd = System.in;
		// 2. byte 처리 스트림 (65536 가지를 표현할 수 있다) 한글 처리 가능한 객체
		var isr = new InputStreamReader(kbd);
		System.out.print("입력: ");

		try {
			int code = isr.read();
			System.out.println("code: " + code);
			char ch = (char) code;
			System.out.println("char: " + ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
