package test.util;

import test.auto.Test;

public class TestUtil {
	public static void run(Test t) {
		if (t != null) {
			System.out.println("테스트 시작");
			t.submit();
			System.out.println("테스트 종료");
			System.out.println();
		}
	}
}
