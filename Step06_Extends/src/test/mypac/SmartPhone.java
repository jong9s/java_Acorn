package test.mypac;

public class SmartPhone extends HandPhone {
	// 생성자
	public SmartPhone() {
		System.out.println("smartPhone 객체 활성화");
	}
	// 메소드
	public void doInternet() {
		System.out.println("인터넷 사용합니다.");
	}
	// 부모가 가지고 있는 메소드를 재정의 할 일이 많다
	// 메소드 Override (덮어쓰기)
	
	@Override // 재정의한 메소드임을 표시하는 어노테이션, 생략이 가능하지만 보통은 생략하지 않는다.
	public void takePicture() {
		super.takePicture(); // 필요시 부모의 메소드도 호출해야 할 수도 있다. (HandPhone의 메소드)
		System.out.println("1억 화소의 사진을 찍어요");
	}
}
