package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		printSum(10, 20);
		printSum(10000, 40);
		printSum(123123, 2323);
	}

	public static void printSum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(num1 + " 와 " + num2 + " 의 합: " + result);
	}
}
