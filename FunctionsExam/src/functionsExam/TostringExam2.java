package functionsExam;

class Card1 {
	String kind;
	int number;

	Card1() {
		this("SPADE", 1);
	}

	Card1(String kind, int number) { // 값이 떨어지면 여기서 처리
		this.kind = kind;
		this.number = number;
	}

	@Override // annotation. Card 인스턴스 c1, c2의 toString()을 호출하면 객체가 갖고 있는 변수 kind와 number
	// 삾을 문자열로 	반환하도록 toString()을 오버라이딩 했다.

	public String toString() {
		return "kind : " + kind + ", number : " + number;
	}
}

public class TostringExam2 {

	public static void main(String[] args) {

		Card1 c1 = new Card1();
		Card1 c2 = new Card1("HEART", 10);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
