package com.khyuna0.ch10.part02.ThrowsTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest {

	public Connection conn() throws SQLException {
		String url = "DB 접속 주소";
				
		return DriverManager.getConnection(url, "tiger", "12345");
	}

}
