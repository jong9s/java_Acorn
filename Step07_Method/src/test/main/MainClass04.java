package test.main;

import test.mypac.Post;

public class MainClass04 {
	public static void main(String[] args) {
		Post p1 = new Post();
		p1.setId(3);
		p1.setTitle("제목2");
		p1.setAuthor("작성자2");
		
		Post p2 = new Post(1, "첫글", "서종훈");
		sendPost(p1);
		sendPost(p2);
		sendPost(null);
		sendPost(new Post());
		sendPost(new Post(2, "제목1","작성자1"));
	}

	public static void sendPost(Post post) {
		System.out.println("글을 전송했습니다");
	}
}
