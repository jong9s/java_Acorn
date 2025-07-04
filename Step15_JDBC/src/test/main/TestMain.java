package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestMain {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "TIGER");
			System.out.println("Oracle DB 접속 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}

		String sql = """
				INSERT INTO member (num, name, addr)
				VALUES (?, ?, ?)
				""";
		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, 2);
			pstmt.setString(2, "서종훈");
			pstmt.setString(3, "구리시");

			int inserted = pstmt.executeUpdate();
			System.out.println("입력 성공한 row 수" + inserted);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
