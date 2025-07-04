package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import test.Util.DBConnector;
import test.dto.MemberDto;

public class MainClass07 {

	// member 테이블에 회원 한명의 정보를 추가하는 메소드를 만든다고 생각해보자
	public static boolean insert(MemberDto dto) {
		Connection conn = null;
		PreparedStatement psmt = null;
		// 변화된 row 의 개수를 담을 변수 선언하고 0 으로 초기화
		int rowCount = 0;

		try {
			conn = new DBConnector().getConn();
			String sql = """
					INSERT INTO member (num, name, addr)
					VALUES(member_sequence.NEXTVAL, ? , ?)
					""";
			psmt = conn.prepareStatement(sql);
			// ? 에 순서대로 필요한 값 바인딩
			psmt.setString(1, dto.getName());
			psmt.setString(2, dto.getAddr());
			// sql 문 실행하고 변화된(추가된, 수정된, 삭제된) row 의 개수 리턴받기
			rowCount = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		// 변화된 rowCount 값을 조사해서 작업의 성공 여부를 알아낼 수 있다.
		if (rowCount > 0) {
			return true; // 작업 성공이라는 의미에서 true 리턴하기
		} else {
			return false; // 작업 실패라는 의미에서 false 리턴하기
		}
	}

	public static void main(String[] args) {
		// DB 에 추가할 회원의 정보라고 가정하자 (member table)
		String name = "종구";
		String addr = "남양주시";
		// 회원의 이름과 주소를 MemberDto 객체에 담는다
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		// 메소드 호출하면서 전달하고 작업의 성공여부를 리턴 받는다.
		Boolean isSuccess = insert(dto);
		if (isSuccess) {
			System.out.println("작업성공");
		} else {
			System.out.println("작업실패");
		}
	}
}
