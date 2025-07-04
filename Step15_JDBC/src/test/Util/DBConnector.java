package test.Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {
	// Connection 객체를 리턴해주는 메소드
	public Connection getConn() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "TIGER");
			System.out.println("Oracle DB 접속 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
