package com.eightcruz.study;

public class Truck extends Car {
	public Truck() { // 기본생성자를 호출하는데, 생성자를 만들었기 때문에 기본생성자가 없고, 따라서 호출이 불가함.
		super("트럭"); // 추가하지도 않아도 자동으로 super를 추가함. -> 부모를 호출
		// Car에 기본생성자를 하나 생성 / super에 인수 입력
		System.out.println("Truck의 기본 생성자");
	} // 부모, 자식 모두 기본 생성자 사용

}
