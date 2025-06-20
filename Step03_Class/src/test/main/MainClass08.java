package test.main;

import test.mypac.Post;
import test.util.PostUtil;

public class MainClass08 {
	public static void main(String[] args) {
		// 1. Post 객체를 생성해서 참조값을 p1 이라는 변수명에 담아보세요.
		Post p1 = new Post();
		// 2. 글 번호 1000 을 위에서 생성한 객체에 담아보세요
		p1.id = 1000;
		// 3. 글 내용 "안녕하세요!" 를 위에서 생성한 객체에 담아보세요.
		p1.content = "안녕하세요";
		// 4. 작성자 "서종훈" 을 위에서 생성한 객체에 담아보세요.
		p1.author = "서종훈";
		// 5. 위의 작업이 끝나면 debug 모드로 실행해서 동작을 확인해보세요.

		PostUtil.post(p1);
	}
}
