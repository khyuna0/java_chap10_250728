package com.khyuna0.ch10.part01;

import java.awt.List;
import java.util.ArrayList;

public class IndexOutofboundsTest {
	public static void main(String[] args) {
	int [] arr = {1,2,3,4,5};
//	System.out.println(arr[5]);
	
	// IndexOutofBounds 에러 발생
	// 에러가 발생한 줄에서 프로그램 정지
	// 배열요소의 길이를 초과한 값을 반환하려고 했을 때
	
	ArrayList<String> list = new ArrayList<String>(); // 컬렉션
	list.add("Korea"); // 리스트에 요소 넣기
	list.add("Japan");
	// 배열처럼 저장됨
	System.out.println(list.get(1));
//	System.out.println(list.get(2));
	// 존재하지 않는 인덱스 2에 접근하려 했으므로 IndexOutofbounds 오류 발생
	
	}
}
