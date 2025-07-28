package com.khyuna0.ch10.Exer;

import java.util.Scanner;

public class ExceptionExer_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1번 문제
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자");
		int num1 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("두 번째 숫자");
		int num2 = scanner.nextInt();
		scanner.nextLine();
		
		Div div = new Div();
		try {
			div.divide(num1, num2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 2번 문제
		
		StringLength stringLength = new StringLength();
		
		String str = scanner.nextLine();
		try {
			stringLength.SLength(str);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 3번 문제
		
		EvenOdd evenOdd = new EvenOdd();
		int num3 = scanner.nextInt();
		scanner.nextLine();
		try {
			evenOdd.EOCheck(num3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 4번 문제
		
 
          try {
			ThrowsExample.readFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}       
    
		
	}

}
