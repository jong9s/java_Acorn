package test.mypac;

public class MyRemocon implements Remocon {
	
	@Override
	public void up() {
		System.out.println("볼륨 Up");
	}
	@Override
	public void down() {
		System.out.println("볼륨 Down");
	}

}
