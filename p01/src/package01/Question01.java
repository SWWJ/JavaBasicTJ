package package01;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		// 크기 판별

//		숫자를 입력하세요 >>
//		숫자를 입력하세요 >>

//		앞 숫자가 큽니다.
//		계속 할까요? (계속: o, 중단: x)

//		프로그램을 종료합니다.

//		시도 횟수 : 	  앞숫자가 큰 경우: 	  뒷 숫자가 큰 경우 :   

		// 변수명 생성 시 의미가 있도록 생성, 모든 줄에 주석 첨부

		int count = 0; // 전체 질문 횟수 변수
		int fno = 0;   // 앞 숫자가 큰 경우 변수
		int lno = 0;   // 뒷 숫자가 큰 경우 변수
		char ox = 'o'; // 계속 진행 여부 변수

		Scanner sc = new Scanner(System.in); // 입력 객체 생성
		
		while (ox != 'x') { // 반복 구문 시작

			System.out.print("숫자를 입력하세요 >> "); // 입력 구문
			int a = sc.nextInt();
			System.out.print("숫자를 입력하세요 >> "); // 입력 구문
			int b = sc.nextInt();
		
			if(a > b) {
				System.out.println("앞 숫자가 큽니다.");
				fno++; // fno += 1;
				count++;
			} else if(b > a) {
				System.out.println("뒷 숫자가 큽니다.");
				lno++; // fno += 1;
				count++;
			}
			System.out.print("계속 할까요? (계속: o, 중단: x) : ");
			ox = sc.next().charAt(0); // String으로 입력 바로 char로 변
		}

		System.out.println("프로그램을 종료합니다.");
		System.out.print("시도 횟수 : " + count + "\t앞 숫자가 큰 경우 : " + fno + "\t뒷 숫자가 큰 경우 : " + lno);
		
//      --------------------------------------------------------------------------
//		Scanner sc = new Scanner(System.in); // 콘솔을 통해 키보드로 입력받을 Scanner 객체 생성
//
		// do while!
//		int i = 0;
//		int j = 0;
//		int k = 0; // 변수 초기화
//		
//		loop : // while 탈출을 위한 명령어 // outer loop :
//		while (true) { 
//			System.out.print("숫자를 입력하세요 >>> "); // num1 변수를 입력받을 프롬프트를 출력함
//			double num1 = sc.nextDouble();	      // num1 변수를 콘솔을 통해 키보드로 입력함 
//			System.out.print("숫자를 입력하세요 >>> "); // num2 변수를 입력받을 프롬프트를 출력함
//			double num2 = sc.nextDouble();		  // num2 변수를 콘솔을 통해 키보드로 입력함 
//
//			if (num1 > num2) { // 변수 num1이 num2 보다 클 경우
//				System.out.println("앞 숫자가 큽니다."); 
//				j++;		   // num1(앞 숫자)가 큰 경우를 의미하는 변수 j를 증가시킴
//			} else if (num2 > num1) {  // 변수 num2가 num1 보다 클 경우
//				System.out.println("뒷 숫자가 큽니다.");
//				k++;		   // num2(뒷 숫자)가 큰 경우를 의미하는 변수 k를 증가시킴
//			} else {
//				System.out.println("숫자가 같습니다.");
//			}
//
//			System.out.print("계속할까요? (계속 : o, 중단 : x) : "); // 진행을 중단할 것인지를 콘솔을 통해 키보드로 입력함 
//			String ox = sc.next();  // 변수 ox에 생성한 객체 sc를 통해 문자열을 입력
//			char oo = ox.charAt(0); // 위에서 입력한 ox 값을 char 형으로 변경
//			if (oo == 'x') {        // ox 값이 x일 때
//				System.out.println("프로그램을 종료합니다.");
//				i++;                // 시도한 횟수를 의미하는 변수 i를 증가
//				break loop;         // if와 while 두 개 모두에서 탈출  // break outerloop;
//			} else if (oo == 'o') { // ox 값이 o일 때
//				i++;                // 시도한 횟수를 의미하는 변수 i를 증가
//			}
//
//		}
//		System.out.println("시도 횟수 : " + i + "\t앞 숫자가 큰 경우 : " + j + "\t뒷 숫자가 큰 경우 : " + k);
//		// 시도 횟수와 앞 숫자가 큰 경우, 뒷 숫자가 큰 경우를 출력함. 

	}

}
