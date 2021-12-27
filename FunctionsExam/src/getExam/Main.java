package getExam;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		// # 7-8
//		Scanner sc = new Scanner(System.in);
//		Random rand = new Random();
//		
//		System.out.println("난수를 생성합니다.");
//		System.out.print("하한값:");
//		int a = sc.nextInt();
//		System.out.print("상한값:");
//		int b = sc.nextInt();
//		
//		int r = 0;
//		String c = "success";
//		
//		try {
//		r =  a + rand.nextInt(b - a) + 1;
//		} catch (IllegalArgumentException e) {
//			System.out.println(a + ", " + b);
//			c = "fail";
//		} 
//		if (c.endsWith("ss")) {
//		System.out.printf("생성한 난수는 %d입니다.", r);
//		}
		
		// # 7-7
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
//		System.out.print("단수는: ");
//		int num = sc.nextInt();
//		
//		for(int i = 0; i < num; i++) {
//			for(int j = 0; j <= i; j++) {
//				System.out.print("*");
//			} System.out.println();
//		}
		
		// # 7-6
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("몇 월입니까(1~12):");
//		int m = sc.nextInt();
//		String season = "";
//		
//		if (m < 3 || m == 12) {
//			season = "겨울";
//		} else if (m < 6) {
//			season = "봄";
//		} else if (m < 9) {
//			season = "여름";
//		} else if (m < 12) {
//			season = "겨울";
//		}
//		
//		System.out.println("해딩 월의 계절은 " + season + "입니다.");
//		
		// # 7-4
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("1부터 x까지의 합을 구하자.");
//		System.out.print("x의 값: ");
//		int x = sc.nextInt();
//		
//		int sumUp = 0;
//		
//		for(int i = 1; i <= x; i++) {
//			sumUp = sumUp + i;
//		}
//		
//		System.out.println("1부터 " + x + "까지의 합은 " + sumUp + "입니다.");
		
		
		// # 7-3
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수 a : ");
//		int a = sc.nextInt();
//		System.out.print("정수 b : ");
//		int b = sc.nextInt();
//		System.out.print("정수 c : ");
//		int c = sc.nextInt();
//		
//		int max = a;
//		int med = 0;
//		
//		if(max < b) {
//			max = b;
//		} else if(max < c) {
//			max = c;
//		}
//		
//		int min = a;
//		
//		if(min > b) {
//			min = b;
//		} else if (min > c) {
//			min = c;
//		}
//		
//		if (min < a && max > a) {
//			med = a;
//		} else if (min < b && max > b) {
//			med = b;
//		} else if (min < c && max > c) {
//			med = c;
//		}
//		
//		System.out.println("중간값은 " + med + "입니다.");

	}

}
