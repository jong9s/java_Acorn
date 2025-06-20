package test.mypac;

public class Post {
	// 글 번호를 저장할 필드
	public int id;
	// 글 내용을 저장할 필드
	public String content;
	// 글 작성자를 저장할 필드
	public String author;

	public void printData() {
		/*
		 *  숫자(정수)는 %d
		 *  문자는 %s
		 *  % % % 의 순서대로 들어간다.
		 */
		String data = String.format("번호:%d 내용:%s 작성자:%s ", this.id, this.content, this.author);
		String data1 = "번호: "+this.id+" 내용: "+this.content+" 저자: "+this.author;
		System.out.println(data);
		System.out.println(data1);
	}
}
