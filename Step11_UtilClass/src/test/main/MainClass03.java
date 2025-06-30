package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();
		for (int i = 0;; i++) {
			String n = scan.nextLine();
			if (n.isEmpty()) {
				break;
			} else {
				names.add(i, n);
			}
		}
		System.out.println(names);
		
		for(String tmp:names) {
			System.out.println(tmp);
		}
	}
}
