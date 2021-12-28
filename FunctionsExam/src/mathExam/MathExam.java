package mathExam;

import java.lang.Math.*;

public class MathExam {

	public static void main(String[] args) {
/* Math는 기본적인 수학계산에 유용한 메서드들로 구성되어 있다. random()  round()
 * Math의 생성자는 접근제어자가 private()이기 때문에 다른 클래스에서는 다른 클래스에서는 Math 객체를 생성할 수 없다.
 * Math의 메서드는 모두 static, 직접  접근 Math.round()
 * round() : 반올림, ceil() : 올림, floor() : 버림 - 소수점을 기준으로 
 * 
 * 올림, 버림, 반올림 round()
 * 
 */
		
//		double val = 90.7552;
//		System.out.println(Math.round(val)); // round(변수) -> 그냥 반올림
//		
//		System.out.println(val);
//		System.out.println(Math.round(val)); // round(변수) -> 그냥 반올림
//		
//		System.out.println(Math.ceil(val)); // 올림
//		System.out.println(Math.floor(val)); // 버림
//		
//		System.out.println(Math.ceil(val)); // 올림
//		
//		
//		System.out.println();
//		
//		// 첫 번째 방법 : 원하는 자릿수까지 곱한 다음에 처리한 후 곱한 값을 다시 나눔
//		System.out.println(Math.round(val*100)/100); // round(변수) -> 그냥 반올림
//		
//		System.out.println(Math.ceil(val*100)/100); // 올림
//		System.out.println(Math.floor(val*100)/100); // 버림
//		
//		System.out.println(Math.ceil(val*100)/100); // 올림
//		
//		System.out.println();
//		
//		String val2 = String.format("%.2f", val);
//		System.out.print(val2);
		
		// Math.random() : 0.0 <= d < 1.0 (랜덤 한계), 즉 %값 형태로 난수를 발생시킨다.
		double d = Math.random();
		System.out.println(d);
		
		int i = (int)(Math.random() * 10);
		System.out.println(i);
		
		int j = (int)(Math.random() * 100);
		System.out.println(j);
		
	}

}
