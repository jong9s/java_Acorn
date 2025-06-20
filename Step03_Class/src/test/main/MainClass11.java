package test.main;

import test.mypac.Post;

public class MainClass11 {
	public static void main(String[] args) {
		
		Post p1 = null;
		Post p2 = new Post();
		Post p3 = p2;
		
		p2.id = 1;
		p2.content = "안녕하세요";
		p2.author = "김씨";
		
		System.out.println(p3.content);
		
		System.out.println(p2.content);
	}
}
