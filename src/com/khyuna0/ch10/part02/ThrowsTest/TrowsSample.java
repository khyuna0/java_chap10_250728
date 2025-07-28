package com.khyuna0.ch10.part02.ThrowsTest;

public class TrowsSample {
	public void ZeroDivid() throws Exception { 
		// throws -> 메소드를 호출하는 쪽에서 예외 처리를 하라고 강제하는 구문
		System.out.println(10 / 0); 
//	try {
//			System.out.println(10 / 0);
//		} catch (Exception e) {
//		e.printStackTrace();
//			System.out.println("0으로 나눌 수 없습니다!");
//		}
	}
}
