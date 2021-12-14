package ExceptionStudy;

public class ExceptionExam{
    public static void main(String []args) {

    	int [] array = new int[10];
        try {
        array[20] = 5;   
        } catch(Exception e) {
        	System.out.println("배열의 범위를 지나쳤어요.");
        } 
        System.out.println("성공");
    }
	
//public class ExceptionExam {
//	
//	public static void main(String[] args) {
//		int i = 10;
//		int j = 0;
//			try {
//				int k = i/j;
//				System.out.println(k);
//			} catch(Exception e) {
//				System.out.println("예외가 발생했습니다.\n" +e.toString());
//			} finally {
//				System.out.println("예외 발생 여부와 상관없이 항상 실행");
//			}
//			// 기본형 try{예외가 나지 않으면 출력, 예외가 날 것으로 보이는 구문} catch(예외 타입 변수명/모든 변수(Exception e) {예외가 났을 때 내보낼 구문}
//			// toString() -> String으로 형변환. \n -> 강제 줄바꿈
//			// finally는 생략 가능하나 잘 쓰인다. 에러 발생 여부와 상관없이 항상 실행.
//			
//		System.out.println("main end"); // 예외(에러)가 발생하면 그 뒤에 것은 작동하지 않는다.
//	}

}
