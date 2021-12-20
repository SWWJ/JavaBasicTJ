package control;

import java.util.Random;
import java.util.Scanner;

public class DowhlieExam {

	public static void main(String[] args) {
		/*
		 * do ~ while은 while의 변형으로 기본 구조는 같다. while은 경우에 따라 단 한 번도 실행되지 않는 경우도 있지만 do ~
		 * while의 경우 반드시 한 번은 무조건 실행되도록 한다.
		 * 
		 * 1~100 사이의 난수를 하나 생성해서 1과 100 사이의 정수를 입력하세요 >> 난수와 비교해서 더 큰/작은 값으로 다시 입력하세요.
		 * 
		 * 1과 100 사이의 정수를 입력하세요 >> 난수와 비교해서 더 큰 값으로 다시 입력하세요.
		 * 
		 * 정답입니다. 총시도한 횟수는 번입니다.
		 */

//		Random rand =  new Random();
//		int r = rand.nextInt(99) + 1;    난수 발생 방법

//		Scanner sc = new Scanner(System.in);
//		Random rand = new Random();
//
//		int r = rand.nextInt(99) + 1;
//		int count = 0;
//		int tr = 0;
//
//		do {
//			System.out.print("1과 100 사이의 정수를 입력하세요 >> ");
//			tr = sc.nextInt();
//
//			if (tr > r) {
//				System.out.println("더 작은 값을 입력하세요.");
//			} else if (r > tr) {
//				System.out.println("더 큰 값을 입력하세요");
//			}
//				count++;
//		} while (r != tr);
//
//		System.out.println("정답입니다. 총 시도한 횟수는 " + count + "번입니다.");

		// 369 게임 do while
		// 100 이하 3의 배수/ 3이 들어갈 때 짝을 출력.

		// 3 짝. 36 짝짝 99 짝짝. 한 글자씩!

		int num = 1;

		do {
			if (num % 3 == 0) {
				System.out.print("짝");
			} else {
				System.out.println(num);
			}
			for (num = 1; num <= 100; num++) {
				if (num % 10 % 3 == 0) {
				} else {
					System.out.println(num);
				}
			}
			num++;
		} while (num <= 100);

	}

}
