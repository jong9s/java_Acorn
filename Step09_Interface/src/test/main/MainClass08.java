package test.main;

import test.mypac.Person;
import test.mypac.Programmer;
import test.mypac.Singer;

public class MainClass08 {
	public static void main(String[] args) {
		// Person 객체를 생성해서 Person type 으로 받으면 모든 메소드를 다 사용할 수 있다.
		Person p1 = new Person();
		p1.work();
		p1.sing();
		p1.develop();
		System.out.println("****************");

		Singer s1 = new Person();
		s1.sing();
		System.out.println("****************");

		Programmer p2 = new Person();
		p2.develop();
		System.out.println("****************");
	}
}
