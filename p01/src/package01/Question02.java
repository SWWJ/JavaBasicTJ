package package01;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		/*
		 * 1) 원하는 기호를 입력하세요 >> @ 2) 원하는 횟수를 입력하세요 >> 5
		 * 
		 * @@@@@
		 * 
		 * 
		 * 1 -> 증가 2 -> 감소 3 -> 종료 >> 1 카운트 : 1
		 * 
		 * 1 -> 증가 2 -> 감소 3 -> 종료 >> 1 카운트 : 2
		 * 
		 * 1 -> 증가 2 -> 감소 3 -> 종료 >> 2 카운트 : 1
		 * 
		 * 1 -> 증가 2 -> 감소 3 -> 종료 >> 1 카운트 : 2
		 * 
		 * 1 -> 증가 2 -> 감소 3 -> 종료 >> 3 프로그램 종료 최종 카운트 : 2
		 */

//		Scanner sc = new Scanner(System.in); // 변수값을 입력받을 Scanner 객체 생성
//		
//		int num = 0; // 횟수 변수 초기화
//		
//		System.out.print("원하는 기호를 입력하세요 >> "); String shape = sc.next(); // 문구 출력 및 원하는 기호 입력
//		System.out.print("원하는 횟수를 입력하세요 >> "); num = sc.nextInt(); // 문구 출력 및 원하는 횟수 입력
//		
//		int i = 1; // 변수 초기화
//		
//		while(i <= num) { // 변수 i가 사용자가 입력한 횟수보다 작을 때
//			System.out.print(shape); // 사용자가 입력한 모양을 출력
//			i++;          // 변수 i 하나 증가
//		}

//		Scanner sc = new Scanner(System.in); // Scanner 객체 생성
//
//		int count = 0; // count 변수 생성
//		int pro = 0; // pro 변수 생성
//
//		while (pro != 3) { // pro가 3이 아니면 반복
//			System.out.print("1) 증가\t 2) 감소\t 3) 종료 >> ");
//			pro = sc.nextInt(); // 입력 구문 출력, 변수 pro에 값 입력
//
//			if (pro == 1) {
//				count++;
//				System.out.println("카운트 : " + count);
//			} else if (pro == 2) {
//				count--;
//				System.out.println("카운트 : " + count);
//			}
//		}
//		System.out.println("프로그램 종료\t최종 카운트 : " + count);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
		System.out.print("단수는? >> "); String line = sc.next();
		int line1 = Integer.parseInt(line);
		
		for(int i = 1; i <= line1; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			} System.out.println();
		}
		
		System.out.println("왼쪽 위가 직각인 이등변 삼각형을 표시합니다.");
		System.out.print("단수는? >> "); String line2 = sc.next();
		int line3 = Integer.parseInt(line2);
		
		for(int i = 1; i <= line3; i++) {
			for(int j = line3; j >= i; j--) {
				System.out.print("*");
			} System.out.println();
		}
		
	}

}
