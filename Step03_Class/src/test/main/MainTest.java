package test.main;

import test.auto.Test;
import test.util.TestUtil;

public class MainTest {
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.name = "서종훈";
		t1.num = 1;
		
		Test t2 = new Test();
		t2.name = "오승민";
		t2.num = 2;
		
		TestUtil.run(t1);
		TestUtil.run(t2);
	}
}
