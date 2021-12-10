package test;

public class TernaryExam {

	public static void main(String[] args) {
		
		// 삼항연산자

//		int b1 = (5 > 4) ? 50 : 40;
		//        조건식 true일 때  false일 때
//		System.out.println(b1);
		
//		boolean 사용 시
		
//		boolean b1 = 5 > 4;
//		
//		if(b1) {
//			System.out.println(50);
//		} else {
//			System.out.println(40);
		
//		boolean 없이 조건식만 사용
	
//		if(5 > 4) {
//			System.out.println(50);
//		} else {
//			System.out.println(40);
//		}
		
//		변수에 담아서 처리
		
		int b1; // int b1을 밖에서 선언하고 그 안에서 지역변수를 선언해 결과가 달라지도록 함.
		
		if(5 > 4) { // 지역변수로 막아두고 결과값만 꺼내는 .. 
			b1 = 50; // 이곳의  b1과
		} else {
			b1 = 40; // 이곳의 b1을 다르게 인식
		}
		System.out.println(b1);
		
/* Variable 1) local variable;  지역변수 - 일부에만 영향을 미친다.
 							    {} 안에서 변수를 선언하면 지역변수.
		
	     	2) global variable; 전역변수 - 전체에 영향을 미친다. {} 밖에서 선언
 								생각지도 않은 곳에서 문제가 생길 가능성이 높다.
*/

	}

}
