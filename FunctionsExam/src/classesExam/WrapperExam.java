package classesExam;

public class WrapperExam {

	public static void main(String[] args) {
/* 포장 클래스 wrapper class
 * 
 * 매개변수로 객체를 요구할 때, 기본형 값이 아닌 객체를 저장해야 할 때, 객체 간의 비교가 필요할 때. 
 * 8개의 기본형을 대표하는 8개 각각의 wrapper class를 이용하면 기본형 값을 객체 형태로 받을 수 있다.
 * 기본형         wrapper class
 * boolean Boolean         Boolean b = new Boolean(true); // 생성자를 지정
 * char    Character       Character c = new Character('a');
 * byte    Byte
 * Short   Short
 * int     Integer         Integer i = new Integer(100000);  Integer i = new Integer("100000");->문자 형태로 객체화
 * long    Long
 * float   Float
 * double  Double          Double d = new Double(3.141592);  Double d = new Double(3.141592);
 */

//		Integer i1 = new Integer(100);
//		Integer i2 = new Integer(100);
//		
//		System.out.println(i1 == i2);        // 주소값을 비교
//		System.out.println(i1.equals(i2));   // 값 자체를 비교
//		System.out.println(i1.toString() == i2.toString());  
		// wrapper class 들은 모두 equals()가 오버라이딩 되어 있어 주소값이 아닌 객체가 가지고 있는 값을 비교한다.
		// toString()도 오버라이딩 되어 있어 객체가 가지고 있는 값을 문자열로 변환하여 반환한다.
		
		int i1 = new Integer("100").intValue();
		
		int i2 = Integer.parseInt("100"); // 주로 사용되는 방법
		int i3 = Integer.valueOf("100");  // 자주 사용되는 방법

	// 둘 다 문자를 숫자로 바꿔주는 일을 하지만 전자(i1)는 반환값이 기본형, 후자(i2, i3)는 반환값이 래퍼클래스 타입이라는 차이가 있다.
	
		// JDK 1.5~ 도입된 오토박싱 autoboxing 기능 때문에 반환값이 기본형일 때와 래퍼 클래스일 때의 차이가 없어졌다.
		// 성능은 valueOf()가 조금 느리다.
	}

}
