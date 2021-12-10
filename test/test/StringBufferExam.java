package test;

public class StringBufferExam {
	public static void main(String[] args) {

        String result = ""; // 아무것도 없는 객체가 하나 생성 -> 수정이 아니라 계속 생성
        result += "hello";  // 거기에 객체 하나를 추가, 계속해서 객체를 만들어 냄
        result += " ";
        result += "world"; // 누적의 개념!!
        System.out.println(result);
	}
}
