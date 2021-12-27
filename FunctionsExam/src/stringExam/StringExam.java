package stringExam;

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

	}

}
