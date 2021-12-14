package javaStudy;

public class EnumExam {
	
	public static final String MALE="MALE";
	public static final String FEMALE="FEMALE";
	// static은 객체 생성 없이도 접근하여 사용 허용
	// final 상수(변하지 않는 수/String)로 선언 (변수의 반대 개념)
	// String 문자열로
	// 상수형태로 선언할 경우 대문자로 사용한다. (위 final과 같은 개념)
	
	public static void main(String[] args) {
		String gender1;
		
		gender1 = EnumExam.MALE; // class 명으로 접근
		gender1 = EnumExam.FEMALE;
		
		
		gender1 = "boy";
		
		Gender gender2;
		
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		
//		gender2 = "girl";
//		gender2 = 1;
	}

}

	// 열거형
enum Gender { // 자료형을 생성
	MALE, FEMALE; // 이 자료형에는 MALE, FEMALE 만 들어갈 수 있게 열거함
}


