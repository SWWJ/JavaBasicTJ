package stringExam;

import java.util.StringJoiner;

public class StringExam {

	public static void main(String[] args) {
/* 다른 언어에서는 문자열을 char 형의 배열로 다루었으나 자바에서는 문자열 클래스를 별도로 제공한다.
String 클래스는 문자열을 다루는 데 필요한 메서드들을 함께 제공한다. 지금까지는 String의 기본적인 것 몇 가지만 사용했지만
아주 아주 중요하므로 자세히 공부해보자.

1. immutable 클래스 : 변경불가
	한 번 생성한 String은 읽어 올 수만 있고 변경할 수 없다. 만약 +연산자를 이용하여 문자열을 결합하는 경우
	문자열 자체가 바뀌는 것이 아니라 결합된 새로운 문자열이 생성되는 것이다.
	
	String a = "a";
	String b = "b";
	String a = a + b;
	연산할 때마다 새로운 문자열을 가진 String 객체가 생성되어 메모리 공간을 차지하게 된다.
	가능한 한 결합횟수를 줄이는 것이 좋다.
	
	문자열 간의 결합 추출 등 문자열 작업이 많은 경우에는 String 대신 StringBuffer를 사용하는 것이 좋다.
	
	String 문자열의 비교는 언제나 항상 반드시 꼭                          기준객체.equals(비교객체)를 사용한다.
	
	빈 문자열
	String s = ""; // 참조변수 s가 참조하는 String 객체는 내부에
	new char[0] 과 같이 길이가 0인 char형 배열을 저장하는 것과 같다. 빈 문자열을 갖는 것.
	
	char[] chArr = new char[0]; // 길이가 0인 char 배열
	char c = ''; (X) ' '; 는 허용. char형 변수에는 반드시 하나의 문자를 지정해야 한다.
	
==== String의 생성자와 메서드 ====
*/
		char[] cArr = new char[0];
		String s = new String(cArr); //== String s = new String("");
		
		System.out.println(cArr.length);
		System.out.println("@@@" + s + "@@@");
		
		
		String a = new String("Hello"); // 주어진 문자열로 객체 생성
		
		char[] b = {'H', 'e', 'l', 'l', 'o'};
		String c = new String(b);
		
		System.out.println(c);

		// charAt() 지정된 위치index 에 있는 문자를 반환한다. 0부터 시작한다.
		String d = "Hello";
		String e = "012345";
		char f = d.charAt(2);
		char g = e.charAt(2);
		
		System.out.println(f);
		System.out.println(g);
		
		// compareTo() 비교해서 같으면 0, 이전이면 -1, 이후면 1
		int i = "a".compareTo("a");  // 0
		int i2 = "a".compareTo("b"); // -1
		int i3 = "b".compareTo("a");
		
		System.out.println(i + " " + i2 + " " + i3);
		
		// concat() 문자열들을 붙인다.
		
		String h = "Hello ";
		String k = "World";
		String l = h.concat(k);
		
		System.out.println(l);
		
		// contains() 문자열이 포함되어 있는지 검사 boolean(true, false)
		String z = "abcdefg";
		boolean y = z.contains("bc");
		
		System.out.println(y);
		
		// endsWith() 지정된 문자열로 끝나는지 검사. boolean(true, false)
		String ab = "Hello.txt";
		boolean bc = ab.endsWith("txt");
		
		System.out.println(bc);
		
		// startsWith() 지정된 문자열로 시작하는지 검사. boolean(true, false)
		System.out.println(ab.startsWith("He"));
		

		// equalsIgnoreCase() 대소문자 구별 없이 내용이 같은지 비교 boolean(true, false)
		String r = "Hello";
		System.out.println(r.equalsIgnoreCase("hello"));
		
		// indexOf() 주어진 문자가 문자열에 존재하는지 확인, 없으면 -1, 있으면 인덱스 출력, 여러 개면 맨 앞의 것의 인덱스 출력
		System.out.println(r.indexOf('l'));
		
		// lastIndexOf() 지정된 문자가 오른쪽부터 찾아서 index를 알려준다. 없으면 -1, 세는 것만 오른쪽부터이고 인덱스는 똑같이 알려줌
		System.out.println(r.lastIndexOf('o'));
		
		// length() 문자열의 개수 길이를 리턴한다.
		System.out.println(r.length());
		
		// replace() 글자(한 글자, char)를 바꿔서 보여준다. (문자열은 immutable)
		System.out.println(r.replace('e', 'o')); // replace('기존 글자', '바꿀 글자') -> 실제 String이 바뀐 것은 아니다.
		
		// replaceAll() 문자열을 바꿔서 보여준다. (문자열은 immutable)
		System.out.println(r.replaceAll("ll", "ad"));
		
		// split() 문자열을 지정된 분리자로 나누어 배열로 반환
		String animals = "dog cat bear";
		String[] arr = animals.split(" ");
		
		// for 구문
		for(int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]);
			
			if(j != arr.length - 1) {
				System.out.print(", ");
			}
		}
		
		System.out.println();
		
		System.out.print("[");
		for(int j = 0; j < arr.length - 1; j++) {
			System.out.print(arr[j] + ", ");		
		}
		
		System.out.println(arr[arr.length - 1] + "]"); // 마지막 거만 따로
		
		System.out.println();
		
		// for each 구문
		for(String item: arr) {
			System.out.print(item);
		}
		
		// substring() 문자열(여러 글자) 잘라내기
		System.out.println(r.substring(2, 4)); // substring(begin index, end index(미만))
		
		// toLowerCase() 전부 소문자로 보여주기
		System.out.println(r.toLowerCase());
		
		// toUpperCase() 전부 대문자로 보여주기
		System.out.println(r.toUpperCase());
		
		System.out.println(r); // 여전히 String r은 바뀌지 않고 그대로이다.
		
		// trim() 문자열 앞뒤에 있는 불필요한 여백을 제거
		String rr = "       Hello      ";
		System.out.println(rr.trim());
		
		// join() 문자열들을 결합한다. split()과 반대
		String animal = "dog,car,bear";
		String[] arr1 = animal.split(","); 
		
		System.out.println(String.join(", ", arr1)); // -를 기준으로 arr1의 항목들을 붙여라
		// 항목1" "항목2" "항목3 -> for문 쓰지 않고도 배열 출력
		
		System.out.println();

		// import java.util.StringJoiner; 필요
		StringJoiner sj = new StringJoiner(", ", "[", "]"); // 객체생성("중간마다", "처음 시작", "끝")
		for (String ani: arr1) {  // for each
			sj.add(ani);          // 생성한 StringJoiner 객체.add(for each String 객체)
			System.out.println(sj.toString());
		}
		
		// Integer.parseInt(), Integer.valueOf() : String을 기본형 값으로 변환
		int ii = Integer.parseInt("100");
		int jj = Integer.valueOf("100");
		
		int iVal = 100;
		String strVal = String.valueOf(iVal); // int를 String으로 변환
		
		double dVal = 200.0;
		String strVal2 = dVal + ""; // 숫자를 문자열로 바꾸는 또 다른 방법
		
		double sum = Integer.parseInt(strVal) + Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println(sum);
		System.out.println(sum2);
		
//		int val = Integer.parseInt(" 123 "); // 공백이 있을 시 int로 바뀌지 않고 에러 발생
		int val = Integer.parseInt(" 123 ".trim());
		System.out.println(val);
		
		// 문자열을 숫자로 변환하는 과정에서는 예외가 발생할 확률이 아주 높기 때문에 주의를 기울여야 한다.
		
		System.out.println();
		
		// 
		String fullName = "Hello.java";
		
		// 확장자를 제외한 이름, 확장자는?
		String[] ar = fullName.split("\\.");

		System.out.println("확장자를 제외한 이름은 " + ar[0]);
		System.out.println("확장자는 " + ar[1]);
		
		int co = fullName.indexOf('.');
		System.out.println("확장자를 제외한 이름은 " + fullName.substring(0, co));
		System.out.println("확장자는 " + fullName.substring(co + 1, fullName.length())); // 끝까지
		
	}

}
