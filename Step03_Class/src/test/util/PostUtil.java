package test.util;

import test.mypac.Post;

public class PostUtil {
	public static void post(Post p) {

		System.out.println("글 번호: " + p.id);
		System.out.println("내용: " + p.content);
		System.out.println();
		System.out.println("저자: " + p.author);

	}
}
