package test.main;

import test.mypac.Item;

public class MainClass11 {
	public static void main(String[] args) {
		// Item 객체 생성
		Item item = new Item();
		item.setName("시계");
		
		// Item 객체에 저장된 상품의 이름을 불러와서(참조해서) 활용하려면?
		// 활용 ?
		// 1. 특정 변수에 담기
		// 2. 어딘가에 전달하기 ( 다른 클래스의 생성자, 다른 객체의 메소드 )
		// 3. 콘솔창에 출력하기 ... 등
		
		System.out.println(item.getName());
	}
}
