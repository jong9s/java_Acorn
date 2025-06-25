package test.main;

import test.mypac.Messenger;
import test.mypac.Post;

public class MainClass05 {
	public static void main(String[] args) {
		// Messenger type 객체의 sendPost() 메소드를 호출해보세요.
		// 실행했을 때 Exception 이 발생하지 않아야합니다.
		Messenger msg = new Messenger();
	
		Post p1 = new Post(1, "앙", "김씨");
		msg.sendPost(p1);
		
		msg.sendPost(new Post(2, "안녕", "서씨"));
	}
}
