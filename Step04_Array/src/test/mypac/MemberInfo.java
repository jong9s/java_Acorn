package test.mypac;

public class MemberInfo {
	public int num;
	public String name;
	public String addr;
	
	public void printData() {
		String data = String.format("번호: %d \n이름: %s \n주소: %s", num, name, addr);
		System.out.println(data);
	}
}
