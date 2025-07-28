package com.khyuna0.ch10.part02.ThrowsTest;

import java.sql.Connection;
import java.sql.SQLException;

public class TrowsSample_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrowsSample trowsSample = new TrowsSample();
		
		// trowsSample.ZeroDivid();  unhandled ~ throws 구문으로 예외 처리 강제된 구문 
		// 그냥 쓰면 오류 발생. 반드시 t-c 구문 사용 
		
		try {
			trowsSample.ZeroDivid();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("예외처리 이후 라인");
		
		Connection conn = null;
		DBTest dbTest = new DBTest();
		try {
			conn = dbTest.conn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // connection 끊기 
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
