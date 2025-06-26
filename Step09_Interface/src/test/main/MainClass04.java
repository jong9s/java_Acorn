package test.main;

import test.mypac.Remocon;

public class MainClass04 {
	public static void main(String[] args) {
		// 인터페이스도 익명의 InnerClass 를 이용해서 구현 객체를 만들 수 있다.
		Remocon r1 = new Remocon() {
			@Override
			public void up() {
				System.out.println("채널 Up");
			}

			@Override
			public void down() {
				System.out.println("채널 Down");
			}
		};
		// 지역변수 r1 에 있는 참조값을 전달하면서 메소드 호출
		useRemocon(r1);
		// 메소드 호출하면서 즉석에서 객체를 만들어서 호출
		useRemocon(new Remocon() {

			@Override
			public void up() {
				System.out.println("머리를 Up");
			}

			@Override
			public void down() {
				System.out.println("머리를 Down");
			}
		});
	}

	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
