package com.khyuna0.ch10.part01;

public class NullPointerExceptionTest {

	public static void main(String[] args) {
		String string = null;
		
		System.out.println(string.toString()); // 참조하고 있는 문자열을 반환하는 메소드
		System.out.println(string.length()); // 참조하고 있는 문자열의 길이를 반환
		// NullPointerException 오류 발생!
		// 참조하는 문자열이 존재하지 않기 때문
		
	}

}
