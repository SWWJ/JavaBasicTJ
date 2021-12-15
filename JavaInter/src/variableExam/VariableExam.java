package variableExam;

public class VariableExam {

	public static void main(String[] args) {
		
/*
변수 (variable) - 단 하나의 값을 저장할 수 있는 메모리 공간

   변수를 사용하기 위해서는 먼저 초기화해야 한다.
  ex) int age;    // age라는 이름의 변수를 선언한다.
   변수타입 변수명
   변수타입 - 변수에 저장될 값의 종류를 지정하는 것.
   숫자 / 정수(*int/long) / 실수(*double/float) / 문자(*String/char) 등
   
   변수명 - 메모리공간에 이름을 붙인다. 같은 이름이 여러 개 존재할 수 없다.
   
   
  int age = 25; // 변수 age를 선언하고 25로 초기화한다.
  
  int a;  
  int b;     -> int a,b; // 두 개의 변수를 한 번에 선언
  
  int x = 0;
  int y = 0; -> int x = 0, y = 0;
  
    변수를 사용하기 전에 적절한 값(0,1(곱셈 등), " "(문자열을 쓸 때))으로 초기화한다.
    
    변수의 초기화란 변수를 사용하기 전에 처음으로 값을 저장하는 것을 말한다.

* 변수 선언 규칙
1. 대소 문자를 구분하며 길이에는 제한이 없다.
2. 예약어를 사용할 수 없다.
3. 숫자로 시작할 수 없다. (top10 (o) 10top(x))
4. 특수문자 '_' '$' 만 허용한다. ($는 잘 사용하지 않음) (^^&*^*)#*)*&*# x)

*  권장사항 : 클래스명의 첫 글자는 항상 대문자로 시작을 권장한다.
                       변수명과 메서드명의 첫 글자는 항상 소문자로 시작을 권장한다.
                       여러 단어를 사용할 때는 단어의 첫 글자는 대문자를 사용할 것을 권장한다.
                       상수 이름은 전부 대문자 사용을 권장한다. (바뀌지 않는 변수 MALE 같은)

* 변수 타입
 주로 사용하는 값은 크게 문자와 숫자로 나뉜다. 숫자는 정수와 실수로 ...
 값(data)의 종류(type)에 따라 저장될 공간의 크기와 형식을 정하는 것이 자료형이다.
 
 자료형 - 기본형, 참조형
 
 기본형(primitive type) - 실제 값이 저장됨. (총 8가지)
           논리 boolean 문자 char 상수 int long (byte, short) 실수 double float ...
 참조형(reference type) - 실제 값이 저장되어 있는 주소값을 갖는다.
           기본형을 제외한 모든 나머지

 기본형(primitive type) 
 
 논리형 boolean : true / false, 주로 조건식, 논리계산(if)에 사용된다.
 문자형 char    : 변수 하나에 한 글자만 저장된다. 내부적으로는 숫자(정수 ASCII코드)로 저장된다.
 정수형 int long (byte short) : 정수, 주로 int를 사용한다.
 실수형 double float : 실수를 저장한다. 주로 double을 사용한다.
 
 수의 범위
 int              -2,147,483,648 ~ 2,147,483,647
 long -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807

* 상수 constant

 변수와 마찬가지로 값을 저장할 수 있는 공간이나 변수와는 달리 한 번 값을 저장하면 변경하지 않고 사용한다.
 선언하는 방법도 변수와 동일하지만 final을 붙여 상수를 나타낸다.
 관습적으로 상수명은 대문자로 표기한다.
 
 final int MAX_SPEED = 100; // 변수를 final로 선언하면 변경할 수 없다.
 실제 사용할 때는 final을 붙이지 않고 상수로 사용하기도 한다.
 
 상수 선언은 반드시 선언과 동시에 초기화해야만 한다.
 final int MIN_SPEED; (X)
 MIN_SPEED = 30; (X) 상수의 값은  수정/변경할 수 없다.
 final int MIN_SPEED = 0; (O)
 
 상수의 이름 모두 대문자로 하는 것이 암묵적인 관례이다. (HELLO_WORLD)
 
 작은 것을 큰 것에 넣을 수 있다.
 
 int i = 'A'; 문자 'A'의 코드값이 저장된다.
 long l = 1234; int 의 크기보다 long의 크기가 더 크다.
 double d = 3.14f; double이 float보다 더 크다.
 
 float f = 3.14; // 에러.. 끝의 f를 생략하면 double. double을 float에 넣을 수 없다.
 				 // 크기와는 상관없이 무조건 double은 float에 넣을 수 없다.
 int i = 387298542897587248597247235824l; 에러.. int < long
 
 
=========================================================================
 변수와 함께 많이 사용되는 printf()  print format 

 지금까지는 println()을 사용했지만 println()은 변수값을 그대로 출력하므로
 다른 형태로는 출력하기가 힘들다. 예를 들어 소수 2자리까지만 출력하는 등...
 - 처리해서 출력해줘야 했음.
 
 printf는 println과 달리 줄바꿈을 하지 않는다.
 %n /n 은 줄바꿈 표시
 %d decimal 10진수 즉 숫자출력
 %s String  문자열 출력
 %f 실수 출력 
 %c 문자 하나 출력
 
 int age = 14;
 int year = 2021;
 System.out.printf("age:%d", age); %d 위치를 선정 (%d, 변수명)의 위치에 age의 값이 들어감.
 System.out.printf("age:%d", age);
 
 System.out.printf("age:%d year:%d", age, year); // 순서대로 들어온다.
 System.out.printf("age:%d%n year:%d", age, year);
*/
		
//		String url = "www.naver.com";
//		float f1 = .10f;
//		float f2 = 3.14e3f; 
//		double d = 1.23456789;
//		
//		System.out.printf("f1 : %f, ", f1);
//		System.out.printf("f2 : %f, ", f2);
//		
////		System.out.printf("d : %d, ", d);
//		System.out.printf("d : %14.3f%n, ", d);
//// %전체자리수.소수점아래자리수f
//		
//		System.out.printf("Address : %s%n ", url);
//		System.out.printf("Address : %10.8s%n ", url); 
//// %(기본은 오른쪽 정렬, 총 만들 자리수에 '-'를 붙이면 왼쪽 정렬)총 만들 자리수.출력할 글자 수s
//		System.out.printf("Address : %-10.8s%n ", url); 
		
//		int curPos = 0;   // 변수명을 의미 있게, 약자 형태로. 현재위치 current position
//		int lastPos = -1; // 마지막 위치 last position
		
		// 두 변수의 값 교환
		// 교환, x의 10이 y로, y의 20을 x로

//		int x = 10;
//		int y = 20; 
//		
//		System.out.println("x = " + x);
//		System.out.println("y = " + y);
		
		// 틀린 예
		
//		x = y; // 얘가 먼저 처리된?  x 20 y 20
//		y = x; //         	     y 20 x 20
		
//		System.out.println("x = " + x);
//		System.out.println("y = " + y);
		
		// 맞는 예

//		int x = 10;
//		int y = 20; 
		
//		int temp; // 임시변수를 추가
//		temp = x; // temp = 10, x = 10, y = 20
//		x = y;    // temp = 10, x = 20, y = 20
//		y = temp; // temp = 10, x = 20, y = 10
//		
//		System.out.println("x = " + x);
//		System.out.println("y = " + y);
		
		
//		int year = 0;
//		int age = 15; // 시작값을 정의?
//		
//		System.out.println(year); // 출력
//		System.out.println(age);
//		
//		year = age + 2000;   // 15 + 2000 = 2015 year
//		age = age + 1; // age++ 15 +  1   = 16   age
//		
//		System.out.println(year);
//		System.out.println(age);

	}

}
