package com.eightcruz.study;

public class DuckExam {

	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.sing(); // Duck
		duck.fly();  // Bird
		
//		Bird b = new Bird();
		// class긴 class이나, 추상 class는 부모 class로는 사용할 수 있지만
		// 객체를 생성할 수는 없다. (interface의 특징)

		// 추상 class - abstract 키워드를 클래스 앞에 사용한다.
		// 추상 class - 추상 메서드(인터페이스/명령서처럼)를 포함할 수 있다. - 구현지시
		// 추상 메서드도 abstract 키워드를 붙인다.
		// 추상 메서드는 객체 생성이 불가능하다.
	}

}
