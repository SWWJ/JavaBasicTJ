package arrayExam;

public class ArrayExam {

	public static void main(String[] args) {
		/*
		 * array 배열 - '같은 타입'의 여러 변수들을 하나의 묶음으로 다루는 방식 - 배열은 생성 시 정한 개수를 수정할 수 없다. -
		 * 기본적으로 배열은 0으로 초기화되어 생성된다.
		 * 
		 * int[] score = new int[[5]; -> 5개의 배열을 생성 String[] name = new String[5];
		 * 
		 * int[] score = {35,46,75,86,97,99,45,43,54};
		 * 
		 */

//		int[] score = new int[5];
//// for each		(int i : score)
//		for (int i = 0; i < 5; i++)
//			System.out.println(score[i]);
//
////		for(int j = 10; j <= 50; j = j + 10 // j += 10)
////		score[i] = j;
//
//		score[0] = 10;
//		score[1] = 20;
//		score[2] = 30;
//		score[3] = 40;
//		score[4] = 50;
//
//		for (int i = 0; i < score.length; i++)
//			System.out.println(score[i]);
//
//		String[] name = new String[5];
//
//		int[] math = new int[5];
//
//		for (int j = 0; j < math.length; j++) {
//			math[j] = j * 10 + 50;
//		}
//		
//		for(int j = 0; j < math.length; j++) {
//			System.out.println(math[j]);
//		}

		// 배열의 길이를 수정하는 방법
		// 1. 더 큰 배열을 새로 생성한다.
		// 2. 기존 배열의 데이터들을 새로 생성한 배열로 복사한다.

//		int[] arr = new int[5];
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = i + 1;
//		}
//
//		System.out.println("배열 수정 전");
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("arr[" + i + "] : " + arr[i]);
//		}
//
//		System.out.println("배열 수정 후");
//
//		int[] tmp = new int[arr.length * 2];
//		
//		for(int i = 0; i < arr.length; i++) {
//			tmp[i] = arr[i];
//		}
//		for (int i = 0; i < tmp.length; i++) {
//			System.out.println("tmp[" + i + "] : " + tmp[i]);
//		}
//		
//		System.out.println("배열 수정 후 - arr");
//		
//		arr = tmp;
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("arr[" + i + "] : " + arr[i]);
//		}

		// arraycopy

//		char[] abc = { 'A', 'B', 'C', 'D' };
//		char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
//
//		System.out.println(abc);
//		System.out.println(num);
//
//		// 2개의 배열을 붙여서 하나의 배열로
//
//		char[] result = new char[abc.length + num.length]; // 크기 더함
//		System.arraycopy(abc, 0, result, 0, abc.length);
//		
//		System.out.println(result);
//		
//		System.arraycopy(num, 0, result, abc.length, num.length);		
//		System.out.println(result);
//		
//		System.arraycopy(abc, 0, num, 0, abc.length);
//		System.out.println(num);
//		
//		System.arraycopy(abc, 0, num, 6, 3);
//
////		System.arraycopy(src, srcPos, dest, destPos, length);
////		                넣고 싶은 소스 배열 , 소스 번째, 대상, 넣기 시작하는 대상의 배열 시작(4번째 등), 넣고 싶은 길이
//
//		// 학생 5명의 총합계 점수와 평균
//		int[] score = {100, 88, 98, 90, 96};
//		int plus = 0;
//		double avg = 0;
//		
//		// for (자료형 변수명 : 사용을 원하는 배열명) -> for each // for (int i: score) 하나씩 사용
//		for(int i = 0; i < score.length; i++) {
//			plus += score[i];
//			avg = plus / (double)score.length;
//		}
//		System.out.println("총점 : " + plus);
//		System.out.println("평균 : " + avg);

//		int[] score = {100, 88, 98, 90, 96, 21, 84, 65, 96};

		// 최대값 :
		// 최소값 :

//		int min = score[0];
//		int max = score[0];
//		
//		for(int item: score) {
//			if (max < item) {
//				max = item;
//			} else if (min > item) {
//				min = item;
//			}
//		}
//		System.out.println("최소값 : " + min);
//		System.out.println("최대값 : " + max);
//		
//		for(int i = 1; i < score.length; i++) {
//			if(min > score[i]) {
//				min = score[i];
//			} else if (max < score[i]) {
//				max = score[i];
//			}
//		}
//			
//		System.out.println("최소값 : " + min);
//		System.out.println("최대값 : " + max);

		// 거꾸로 뒤집음
		int[] score = { 100, 88, 98, 90, 96, 21, 84, 65 };
		int[] arr = new int[score.length];
		// score = {96, 65, 84, 21, 96, 90, 98, 88, 100}

		for (int i = 0; i < score.length; i++) {
			arr[i] = score[score.length - (i + 1)];
		}

		score = arr;

		for (int item : score) {
			System.out.print(item + " ");
		}

	}

}
