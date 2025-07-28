package com.khyuna0.ch10.part02;

public class MultyTryCatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a =  10 / 0; // 0나누기 에러 by Zero 에러
			
			int[] arr = { 1, 2, 3,};
			System.out.println(arr[4]);
			
		} catch (ArithmeticException e) { // 다중 catch 문
			e.printStackTrace();
		} catch (IndexOutOfBoundsException e){
			e.printStackTrace();
		}
		
		System.out.println("저는 try-catch 문 뒤 라인입니다.");
	}

}

	// exception -> 모든 오류를 잡을 수 있음. 세부적으로 예외를 나누는 경우는 거의 없음.