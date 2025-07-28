package com.khyuna0.ch10.part02.ThrowsTest;

public class ThrowTest {
// 강제 예외 발생 구문 -> throw new IllegalArgumentException();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = -10;
		if (age < 0) {
			throw new IllegalArgumentException("나이는 0살이 될 수 없습니다."); 
			// 오류를 발생시키는 구문 . 없는 에러를 만들 수 있음.
		}
		
		try { 
			throw new IllegalArgumentException("모든 수는 0으로 나눌 수 없다");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("이후 라인");
	}

}
