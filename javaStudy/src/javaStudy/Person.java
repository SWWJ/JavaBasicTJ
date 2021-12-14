package javaStudy;

class Person {
	String name;
	int age;
	
	public Person(int num) { // 들어가는 자료형
		this.age = num; // this. 는 생략 가능, But 넣는 것을 추천
		// 호출한 객체명 = this - this.age = person.age
	}
	
	// 인수가 하나일 때는 위에서 처리
	
	public Person(String nam, int num) {
		this.name = nam;
		this.age = num;
	}
	
	// 인수가 두 개, 혹은 자료형에 따라 아래에서 처리

}
