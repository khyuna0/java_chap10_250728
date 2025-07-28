package com.khyuna0.ch10.part02;


public class TryCatchFianlyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3};
		
		try {
			for (int i=0;i<=3;i++) {
				System.out.println(array[i]); // 1,2,3 은 출력하고 다음 에러.
			}
		} catch (Exception e) { // 예외가 발생했을 때 예외를 처리할 구문을 넣음
			e.printStackTrace(); // 에러 종류 출력해줌 
			System.out.println("3은 없는 인덱스입니다.");
		} finally { // 옵션 - 안써도 됨
			System.out.println("저는 에러의 유무와 관계없이 항상 실행합니다."); // finally 에 DB의 통로를 닫는 구문을 많이 넣음
		}
		
		System.out.println("저는 21번 라인입니다.");
		
		
	}

}
