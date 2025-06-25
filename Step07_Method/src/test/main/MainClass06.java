package test.main;

import test.mypac.ZzangGu;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 * 		ZzangGu 객체를 3개 생성해서 배열에 담은 다음 반복문 돌면서 배열에 담긴
		 * 		ZzangGu 객체의 dance() 메소드를 모두 호출해보세요
		 */
		
		ZzangGu z1 = new ZzangGu();
		ZzangGu z2 = new ZzangGu();
		ZzangGu z3 = new ZzangGu();
		
		ZzangGu[] zd = {z1, z2, z3};
		for(int i = 0; i < zd.length; i++) {
			ZzangGu tmp = zd[i];
			tmp.dance();
		}
		
		System.out.println("*******************");
		
		for(ZzangGu tmp : zd) {
			tmp.dance(); 
		}
	}
}
