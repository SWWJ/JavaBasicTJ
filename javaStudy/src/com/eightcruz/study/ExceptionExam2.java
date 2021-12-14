package com.eightcruz.study;

public class ExceptionExam2 {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 0; 
		int k = divide(i,j); // divide(i,j)를 호출, 호출한 지점에서 예외를 처리한다.
							 // 예외가 발생하면 전개를 진행하지 않고 멈추게 한다.
		System.out.println(k); 
		System.out.println("종료"); // 예외가 발생했음에도 다음의 과정이 전개된다는 것이 문제

	}
	
	public static int divide(int i, int j) {
		try {
			int k = i/j; // 에러 발생 지점
			return k;
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다.");
			return 1;
		}
	}

}

// pseudo code (의사코드), transaction(일련의 과정)