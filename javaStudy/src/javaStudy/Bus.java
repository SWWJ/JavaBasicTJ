package javaStudy;

public class Bus extends Car {
	
	public void ppangppang() {
		System.out.println("PPANG PPANG!");
	}
	
	public static void main(String[] args) {
		Bus bus = new Bus();
//		bus.run();
		bus.ppangppang();
	} // 상속 - 기능의 확장

}
