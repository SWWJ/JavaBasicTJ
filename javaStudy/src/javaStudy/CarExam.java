package javaStudy;

public class CarExam {
	
	public static void main(String[]args) {
        Car car = new Car();
        if( car instanceof Machine) {
            System.out.println("Car가 Machine을 상속받았습니다.");
        }
        else{            
            System.out.println("Car가 Machine을 상속받지 않았습니다.");
        }
    }
}
	
//	public static void main(String[] args) {
//		Car car = new Car("포니", 1234);
//		
//		System.out.println("name: "+car.name);
//		System.out.println("number: "+car.number);
		// 생성자는 반드시 1개 이상 존재해야만 한다.
		// 개발자가 만들지 않으면 기본으로 기본생성자 (default constructor) 를 자바가 만들어준다.
//		Car c1 = new Car(); // 객체(object)의 또다른 표현 인스턴스(instance). 빈스(beans)
//		Car c2 = new Car("Grandeur"); // 클래스로 만들어낸 객체 -> 클래스와의 관계를 설명할 때 인스턴스를 사용함
		// new Car() -> () 가 생성자 호출하는 것
		// 하나라도 만들면 기본생성자를 사용할 수 없다. "이름"을 주기로 했기 때문에
		
//		System.out.println(c2.name);	
//	}
//
//}
