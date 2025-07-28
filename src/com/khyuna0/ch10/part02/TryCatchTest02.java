package com.khyuna0.ch10.part02;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatchTest02 {

	public static void main(String[] args) { // exception 필수 구문 . 빨간 밑줄 누르면 자동으로 생성 가능함
		// TODO Auto-generated method stub
		try {
			FileReader reader = new FileReader("abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // 에러의 내용을 출력하는 명령어 ★ 프로그램을 멈추게 하지는 않음 
		} 
		System.out.println("16번 라인");
	}

}
