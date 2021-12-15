package variableExam;

import java.util.Scanner;
public class ScannerExam {

	public static void main(String[] args) {
/* Scanner() - 사용자로부터 입력받아 변수로 활용

import java.util.Scanner; Scanner class 사용을 취한 추가

Scanner sc(객체명) = new Scanner(System.in); 객체 생성
객체로 다른 변수를 입력받는 것이다. 여러 개 만들 필요는 없다.

String input = sc.nextLine(); // 글자 입력받을 때 사용 .nextLine
int num = sc.nextInt(); // 정수 입력받을 때 사용 .nextInt

// 문자열로 입력받아 숫자로 변경하기 (숫자 여러 개 입력받기 용이)
String input = sc.nextLine();      // 문자열로 입력받기
int num = Integer.parseInt(input);
// int 객체명 = Integer.parseInt(입력받는 String 객체명);
*/ 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 자리 정수 하나만 입력하세요. >>> ");
		
		String input = sc.nextLine();       // 문자열 입력
		int num = Integer.parseInt(input);  // 문자열을 숫자로 변경
		
		System.out.println("입력 내용 : " + input); // 문자 
		System.out.printf("숫자로 : %d%n", num);   // 숫자
		
	}

}
