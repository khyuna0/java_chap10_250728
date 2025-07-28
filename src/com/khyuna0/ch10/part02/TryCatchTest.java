package com.khyuna0.ch10.part02;

public class TryCatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		try { // 에러 발생 가능성이 있는 코드를 적는 블럭
			int result = 100 / num;
			System.out.println(result);
		} catch (ArithmeticException e) { // 에러가 발생했을 때의 실행문 블럭. () 안에는 오류 타입(클래스)과 변수 지정.
			System.out.println("모든 수는 0으로 나눌 수 없습니다. num 값을 다시 확인하세요.");
		}	
		
		System.out.println("저는 15번 라인입니다.");
		// try - catch 문이 없으면 9번 라인에서 프로그램 종료.
		// 에러처리 하고 15번 라인 출력 후 프로그램 종료.
			
	}

}
