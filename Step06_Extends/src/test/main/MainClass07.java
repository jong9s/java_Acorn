package test.main;

import test.mypac.Rect;

public class MainClass07 {
	public static void main(String[] args) {
		// Shape 객체 생성
		// Shape s1 = new Shape(); // default 생성자가 없어서 이렇게는 객체 생성 불가!
//		Shape s1 = new Shape(100, 200);
//		s1.printInfo();
//		
//		Circle c1 = new Circle(200, 300, 10);
//		c1.printArea();
//		c1.printInfo();
		
		Rect r1 = new Rect(300, 400, 5);
		r1.printArea();
		r1.printInfo();
	}
}
