package com.khyuna0.ch10.part01;

public class ClassCastExceptionTest { // 다운캐스팅이 잘못 됐을 때 발생

	public static void main(String[] args) {
		
	Object object = new String("한국"); // 업캐스팅
	// 취소선 -> 권장하지 않는 코딩 / 오래된 방법 또는 오류 발생 가능성 있음
	
//	Integer a = (Interger) object; 
	// String 타입을 interger로 잘못 타입 변환
	}

}

