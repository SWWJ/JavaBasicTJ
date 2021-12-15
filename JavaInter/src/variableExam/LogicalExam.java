package variableExam;

import java.util.Scanner;

public class LogicalExam {
	
	/* 논리연산자 - 둘 이상의 조건을 and 또는 or 연결하여 하나의 식으로 표현한다.
	 
	 || (or) 피연산자의 어느 한 쪽만 true면 최종 값은 true로 반환한다.
	 && (and) 피연산자 양 쪽 모두 동시에 true이어야만 최종 값을 true로 반환한다.
	 
	 x > 10 && x < 20 (o)
	 x < 10 && x < 20 (o)
	 10 < x < 20 	  (x)
	 
	 i % 2 == 0 || i % 3 == 0  // 2의 배수여도 3의 배수여도 ok
	 
	*/

	public static void main(String[] args) {

		// quiz 2 문자를 하나 입력받아 그 문자가 숫자인지 문자(영문자)인지를 출력
		// "문자를 하나 입력하세요. > "
		// "입력하신 문자는 숫자입니다" / "입력하신 문자는 영문자입니다"
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 하나 입력하세요. > ");
		
//		String memo = "입력하신 문자는 영문자입니다.";
		
		String input = sc.nextLine();
		
		char num = ' ';
		num = input.charAt(0); // String으로 받은 input을 char로 변환 -> input.charAt()
		
		// 숫자 확인
		if('0' <= num && num <= '9') { //'0'-> ASCII 코드로 변환
			System.out.println("입력하신 문자는 숫자입니다.");
		} else if('a' <= num && num <= 'z' || 'A' <= num && num <= 'Z') {
			//'a' / 'A' -> ASCII 코드로 변환
			System.out.println("입력하신 문자는 영문자입니다.");
		} 
	}

}
