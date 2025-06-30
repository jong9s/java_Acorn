package test.main;

public class MainClass11 {
	public static void main(String[] args) {
		int i = 0;
		while (i < 5) {
			System.out.println("반복합니다");
			i++;
		}

		System.out.println("-------------------");

		int j = 0;
		while (true) {
			System.out.println(j + "반복합니다");
			j++;
			// 반복문 탈출조건을 이용해서
			if (j == 5) {
				break; // 반복문을 탈출한다
			}
		}
	}
}
