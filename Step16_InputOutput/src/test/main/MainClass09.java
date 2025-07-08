package test.main;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass09 {
	public static void main(String[] args) {
		File f = new File("memo.txt");
		try {
			// 파일로부터 문자열을 읽어들일 수 있는 객체 생성
			var fr = new FileReader(f);
			// 무한루프 돌면서
			while(true) {
				// 한글자씩 읽어들인다(문자의 code 값)
				int code = fr.read();
				// 만약 더 이상 읽을 문자가 없다면
				if(code == -1) break; // 반복문 탈출
				// code 를 문자로 변환
				char ch = (char)code;
				// 출력
				System.out.println(ch);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
