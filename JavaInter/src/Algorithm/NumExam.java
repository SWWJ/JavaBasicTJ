package Algorithm;

public class NumExam {

//	static int[] arr = { 2, 4, 6, 8, 9, 14, 17 }; // 두 method 모두에서 사용할 수 있도록 static 변수 사용

//	static int binarySearch(int key, int head, int tail) { // method - 각 변수를 설정함

//		int center;

	//	while (head <= tail) {
//			center = (head + tail) / 2;

//			if (key == arr[center]) {
//				return center; // 메서드로 처리
//			} else if (key < arr[center]) {
//				tail = center - 1;
//			} else {
//				head = center + 1;
//			}
//		}

//	return-1;

//	}

//	public static void main(String[] args) {

		// return한 값 = a
//		int a = binarySearch(17, 0, arr.length - 1); // return한 것이 center기 때문에.
//		if (a == -1) {// 찾을 값(key), head, tail(array의 갯수(index와 일치)) -> 메서드 호출
//			System.out.println("찾지 못했습니다.");
//		} else {
//			System.out.println(a + "번째 요소와 일치합니다.");
//		}

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("a를 입력하세요 > "); double a = sc.nextDouble();
//		System.out.print("b를 입력하세요 > "); double b = sc.nextDouble();
//		
//		if(a>b) {
//			System.out.println(a);
//		} else if (b>a) {
//			System.out.println(b);
//		} else {
//			System.out.println("a와 b는 같습니다.");
//		}

//		int A = 11;
//		int B = 55;
//		int W = A;
//		
//		A = B;
//		B = W;
//		
//		System.out.printf("A값 : %d \t B값 : %d", A, B);

//		int[] arr = {12};
//		int sum = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		}
//		System.out.println(sum);

//		int i = 0;
//		while(i < 5) {
//			sum = sum + arr[i];
//			i++;
//		}

//		int[] arr = { 54, 65, 44, 21, 12 };
//		int max = arr[1];

//		for(int i = 0; i < arr.length; i++) {
//			if(max < arr[i]) {
//				max = arr[i];
//			}
//		}

//		int[] arr = { 54, 65, 44, 5, 12 };
//
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(5 == arr[i]) {
//				System.out.println(i + "번째 요소가 일치");
//				break;
//			} else if (i == arr.length - 1) { // length 5개가 다 차면!
//				System.out.println("찾지 못했습니다.");				
//			}
//		}

//		while (i < arr.length) { // i가 array의 길이(5)보다 작아야 한다
//			if (max < arr[i]) {  // arr[i번째]가 초기 설정한 max보다 크면 그 값을 max에 대입
//				max = arr[i];
//			}
//			i++; 				 // i를 하나씩 증가
//		}
//
//		System.out.println(max);
	}
}
