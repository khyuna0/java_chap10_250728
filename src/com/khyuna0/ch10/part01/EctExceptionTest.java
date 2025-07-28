package com.khyuna0.ch10.part01;

public class EctExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArithemticException 
		int a = 1 / 0; // 0 나누기 에러
		
		// FileNotFoundException
		// 외부에서 가져온 파일이 위치에 없을 때 
//		FileReader reader = new FileReader("abc.txt"); //-> throws로 설계된 구문
		
		// 외부 파일을 불러오는 명령문은 파일이 존재하지 않을 가능성이 항상 존재하므로
		// 반드시 예외처리 구문으로만 구현 가능하다
	}

}
