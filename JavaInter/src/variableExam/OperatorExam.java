package variableExam;

import java.util.Scanner;

public class OperatorExam {
	
/* 연산자 Operator

	연산자는 '연산을 수행하는 기호' + - * /
	연산자는 연산을 수행하는 기호이며 피연산자는 작업 대상
	연산자는 피연산자로 연산을 수행하고 나서 항상 그 결과값을 반환한다.
	(연산 대상 : 변수, 상수, 수식 ...)
 연산자: +
	x + 3 -> 식
	x , 3이 피연산자
	
 연산자와 피연산자를 조합하여 계산을 표현한 것을 식이라 한다.
 그 식을 계산하여 결과를 얻는 것을 '평가(evaluation)'이라고 한다.
 
  연산자의 종류
  - 산술연산자 : + - * / % (나머지 연산자:홀짝, 배수 등)
  - 비교연산자 : > < <= >= == (같다) != (같지 않다)
  - 대입연산자 : = (우변의 내용을 좌변으로 저장)
  - 논리연산자 : || && | &
  - 기타연산자 : 삼항연산자(if 없이 조건문) ...

  피연산자의 개수에 따라 ...
  - 단항연산자 
  - 이항연산자 
  - 삼항연산자 (조건식) ? true : false;
  
  연산자의 우선순위
  일반 수학 계산 순서와 동일하게 상식적인 선에서 해결된다.
  곱셈이 덧셈보다 먼저 수행, 괄호 안의 값 먼저 계산
  5 + 3 * 4
  1. 3 * 4 = 12
 2. 5 + 12 = 17
 
  - 단항연산자
  
  	증가연산자 ++ : 피연산자의 값을 1 증가시킨다.
  	증감연산자 -- : 피연산자의 값을 1 감소시킨다.
  	
  	i++ ; 값이 먼저 참조되고 나서 증가, 후위형 (++의 위치에 따라서)
  	++i ; 값이 먼저 증가하고 나서 참조, 전위형 (++의 위치에 따라서)
	
	단항연산자 하나만 단독으로 사용될 때는 차이가 없다.
	
  - 나머지 연산자 %
  나머지 연산자는 왼쪽의 피연산자를 오른쪽의 피연산자로 나누고 난 그 나머지만 결과로 반환하는 연산자이다.
  나머지 연산자는 홀수, 짝수, 배수 검사에 아주 많이 사용된다.
  
  - 등가비교 연산자 == !=
  두 개의 피연산자의 값이 같은지(==) 또는 다른지(!=)를 비교하여 
  == 같으면 true, 다르면 false 
  != 다르면 true, 같으면 false
	
  문자열 비교는 (비교값.equals(비교값))
  문자열을 비교할 때는 == 을 쓰지 말고 반드시 .equals()를 사용하자.
  
	
 */

	public static void main(String[] args) {

		// == -> 같은 메모리 주소값, 위치값을 비교하여 같은지를 묻는 것
		// .equals()는 그 글자의 내용이 같은지를 묻는 것
		
		String str1 = "abc"; // 참조형
		String str2 = new String("abc"); // 객체 생성, 다른 참조형과 메모리 주소값이 달라진다.
		String str3 = "abc"; // 참조형 -> 중복으로 만들지 않고 한 메모리를 str1, str3도 가리킨다.
		// 같은 주소를 가리킴.
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
//		메모리 주소
//		659748578
//		41903949
//		659748578
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc" == "abc");
		System.out.printf("str1==\"abc\" ? %b%n", str1  == "abc");
		System.out.printf("str2==\"abc\" ? %b%n", str2  == "abc");
		// 글자를 비교할 때는 == 을 사용하지 않고 .equals()를 사용해야 하는 이유
		// "abc"=="abc" ? true  \"글자\" 그냥 글자?
		//  abc=="abc" ? true
		// str2=="abc" ? false
		
		System.out.println();

		System.out.printf("\"abc\".equals(\"abc\") ? %b%n", "abc".equals("abc"));
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		//	"abc".equals("abc") ? true
		//	str1.equals("abc") ? true
		//	str2.equals("abc") ? true
		
		System.out.println();

		System.out.printf("str1==str3 ? %b%n", str1  == str3);
		System.out.printf("str2==str3 ? %b%n", str2  == str3);
		System.out.printf("str1.equals(str3) ? %b%n", str1.equals(str3));
		System.out.printf("str2.equals(str3) ? %b%n", str2.equals(str3));
//		str1==str3 ? true
//		str2==str3 ? false
//		str1.equals(str3) ? true
//		str2.equals(str3) ? true
		
		
//		System.out.println(1 == 0);
//		System.out.println(1 != 0);
		
//		// 1. 정수를 하나 키보드로 입력받아 그 수가 홀수인지 짝수인지 출력하는 프로그램을 작성
//		// "입력하신 수 ?? 는 홀/짝입니다."
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("값 입력 : ");
//		int num = sc.nextInt();
//		
//		if( num % 2 == 1) {
//		System.out.println("입력하신 수 " + num + "은/는 홀수입니다.");
//		} else {
//			System.out.println("입력하신 수 " + num + "은/는 짝수입니다.");
//		}
		
//		int x = 10, y = 7;
//		System.out.printf("x를 2로 나눈 나머지는 %d입니다.%n", x%2);
//		System.out.printf("y를 2로 나눈 나머지는 %d입니다.%n", y%2);
//		System.out.printf("x는 5로 나눈 나머지는 %d입니다.%n", x%5); // 배수 찾기
		// 2로 나눴을 때 나머지가 0이면 짝수, 1이면 홀수
		
//		int x = 10, y = 8;
//		System.out.printf("%d을 %d로 나누면 %n", x, y);
//		System.out.printf("몫은 %d, 나머지는 %d입니다.%n", x/y,x%y);
		
//		int i = 5, j = 5;
//		System.out.println(i++); // 5를 출력하고 6으로 증가
//		System.out.println(++j); // 6으로 증가하고 6을 출력
//		
//		System.out.println("i = " + i + ", j = " + j); // i = 6, j = 6
		
//		int i = 5, j = 0;
//		j = i++; // 먼저 j = i가 실행한 후에 i++
//		
//		System.out.println("j = i++ 실행 후, i = " + i + ", j = " + j);
//		
//		i = 5;
//		j = 0;
//		j = ++i; // 먼저 ++i가 실행한 후에 j = i
//		
//		System.out.println("j = ++i 실행 후, i = " + i + ", j = " + j);
		
		
//		단항연산자 하나만 단독으로 사용할 때는 전위형, 후위형의 차이가 없다.

//		int i = 5;
//		i++; // i++ 을 선호한다.
//		
//		System.out.println(i);
//		
//		i = 5;
//		++i; 
//		
//		System.out.println(i);

	}

}
