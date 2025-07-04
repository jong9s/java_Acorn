package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.Util.DBConnector;

public class MainClass06 {
	public static void main(String[] args) {
		// DB 에 추가할 회원의 정보라고 가정하자 (member table)
		String name = "종구";
		String addr = "남양주시";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		
		try {
			conn = new DBConnector().getConn();
			String sql = """
					INSERT INTO member (num, name, addr)
					VALUES(member_sequence.NEXTVAL, ? , ?)
					""";
			psmt = conn.prepareStatement(sql);
			// ? 에 순서대로 필요한 값 바인딩
			psmt.setString(1, name);
			psmt.setString(2, addr);
		    // sql 문 실행하고 변화된(추가된, 수정된, 삭제된) row 의 개수 리턴받기
			int rowCount = psmt.executeUpdate();
			if (rowCount > 0) {
				System.out.println("작업 성공한 수: " + rowCount);
			} else {
				System.out.println("작업 실패");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
