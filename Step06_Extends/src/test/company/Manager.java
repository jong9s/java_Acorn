package test.company;

public class Manager extends Employee {

	private String position; // ex:"팀장", "부장", "이사"

	public Manager(String name, int salary, Department dept) {
		super(name, salary, dept);

	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("매니저의 직책: " + position);
		System.out.println("**********************");
	}
}
