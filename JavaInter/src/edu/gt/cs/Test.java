package edu.gt.cs;

import java.util.Random;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		

	
/*
edu.gt.cs.Test -> edu > gt > cs 안에 Test
패키지는 여러 개가 있을 수 있고 하나의 패키지 내에는 자바 클래스 파일을 여러 개 가질 수 있다.
edu 패키지 아래에 gt 패키지 아래에 cs 패키지 안에 Test라는 클래스가 위치하고 있다. (살을 붙이자)



자바에서의 데이터 종류를 설명
논리형 boolean 은 true와 false 값을 가진다.
정수형 integer 에는 int와 long, short, byte가 있다.
실수형에는 double, float이 있다.
문자에는 String, char가 있다.



코드 설명, 그 결과 예측
*/

//	for(int i = 0; i <= 3; i++) {
//		System.out.println(i);
//	}
	
	// 단계별로 설명
	// i = 0일 때 조건 3보다 작거나 같음을 만족함으로 i값 0을 출력한다.
	// i = 1일 때 조건 3보다 작거나 같음을 만족함으로 (0에서 1이 증가한) i값 1을 출력한다.
	// i = 2일 때 조건 3보다 작거나 같음을 만족함으로 i값 2를 출력한다.
	// i = 3일 때 조건 3보다 작거나 같음을 만족함으로 i값 3을 출력한다.
	// i = 4일 때 조건 3보다 작거나 같음을 만족하지 못함으로 for문을 종료한다.

	// 출력 예상
//	0
//	1
//	2
//	3
	
	//print일 때
//	0123
	
	
	
//	int[] n1 = new int[5];
//	// n1(변수: 주소)에 {0, 0, 0, 0, 0} (값을 지정하기 전에는 0으로 초기화된다)  length(5)
//	// 빈 배열을 생성
//	int[][] n2 = new int[2][2];
//	// n2(변수: 주소)에 {{0, 0},  length(2) (한 덩어리가 하나)
//	//				 {0, 0}}
//	// 2차원 배열
//	int[] n3 = {1, 2, 3};
//	// n3(변수: 주소)에 {1, 2, 3} length(3)
	

	
//	// 위와 아래의 + 의 역할이 다르다.
//	 int x = 100;
//	 int y = 200;
//	 int z = x + y;
//	 // 메모리(ram)에 있는 변수들의 값을 cpu가 가지고 와서 "산술연산"을 하여 다시 메모리에 저장한다.
//	 
//	 int age = 23;
//	 String name = "kim";
//	 String a = name + "의 나이는" + age;
//	 // 메모리(ram)에 있는 변수들의 값을 cpu가 가지고 와서 "결합연산"을 하여 다시 메모리에 저장한다.
	 
	
	
//	 Scanner sc = new Scanner(System.in);
//	 System.out.println("이름을 입력하세요 >> ");  // -1
//	 String name = sc.next();				 // -2
//	 System.out.println("나이를 입력하세요 >> ");
//	 int age = sc.nextInt(); 			// - 3
	 
//	 1. 화면에 사용자로 하여금 입력하도록 프롬프트를 출력한다. // 입력
//	 2. 사용자가 입력받는 창인 콘솔에서 String(문자열)으로 입력한 값을 변수 name에 저장한다. // 문자열
//	 3. 입력한 스트링(문자) 나이 데이터를 정수로 변경하여 age 변수에 저장한다. // 변경
	 
	
	
//   	  String h = "안녕하세요"; // 메모리 크기: 한글의 한 글자 크기 -> 2byte
//  10byte(String으로 입력) + 10byte(char로 들어감) = 20 byte
	
	
	
//	int n = Integer.parseInt("100"); // 문자열, 정수, 스트링, 변환/변경
//	Scanner sc = new Scanner(System.in); // 키보드, 생성, 콘솔
//	Random r = new Random(10); // 랜덤, 생성
	
	// 변수 n에 100이라는 String(문자열)을 계산이 가능한 int 정수형으로 변환(변경)한 값을 저장한다.
	// 콘솔을 통해 키보드로 입력받는 Scanner 객체인 sc를 생성한다.
	// 시드 값 10으로 랜덤한 값을 생성할 수 있는 객체 r을 생성한다.
	
	
	
//	코딩 문항
	
//	-----------------
//	당신의 정보를 입력하세요
//	-----------------
//	
//	당신의 부서는 >>> 
//	당신의 소속은 ____입니다.
//	당신의 나이는 >>> 
//	당신의 작년 나이는 ____였습니다. 
//	당신의 키는 >>> 
//	당신은 키가 (크다/보통이다/작다) // 키가 180 이상 - 크다. 170 이상 - 보통이다. 나머지 - 작다.

	
//	프로젝트명 : p1
//	패키지명 : package2
//	자바파일명 : test1    // 주석 처리도 하기
//	
//	Scanner sc = new Scanner(System.in);
//	System.out.println("------------ \n당신의 정보를 입력하세요 \n------------");
//	
//	System.out.print("당신의 부서는 >>> "); String par = sc.nextLine();
//	System.out.println("당신의 소속은 " + par + "입니다.");
//	System.out.print("당신의 나이는 >>> "); int age = sc.nextInt();
//	System.out.println("당신의 작년 나이는 " + (age-1) + "였습니다.");
//	
//	System.out.print("당신의 키는 >>> "); double h = sc.nextDouble();
//	if (h >= 180) {
////		System.out.println("당신은 키가 크다.");
//		String tall = "크다.";
//	} else if (h >= 170) {
////		System.out.println("당신은 키가 보통이다.");
//		String middle = "보통이다.";
//	} else {
////		System.out.println("당신은 키가 작다.");
//		String shor = "작다.";
//	}
	
	
	}
	
}
