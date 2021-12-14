package com.eightcruz.study;

public class Test {

	public void sayNick(String nick) throws FoolException {
		// 메소드 뒤에 예외를 호출한 곳으로  이동시킴
			if ("fool".equals(nick)) {
				throw new FoolException();
				// throw new 에러 타입 자료형 명 -> 예외가 아닌데 강제로 예외를 발생시킴
				// 발생시킨 예외명과 같은, Exception 을 상속받은 class를 새로 만듦.
				// 예외도 객체다. 객체를 만들기 위해서는 class를 만들어야.
				// 예외 값을 호출한 곳으로 예외를 throws해서 처리하도록 하는 것

			} System.out.println("당신의 별명은 " + nick + "입니다.");
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test(); // 객체 생성
		try { // 결과를 호출한 곳에서 예외 처리를 하면 예외가 발생한 곳에서 과정이 중지. (예외 발생)
			test.sayNick("fool"); // fool을 nick에 넣음
			test.sayNick("genious");// return 직후 계속 전개
		} catch(FoolException e) {
			System.out.println("에러가 발생했습니다.");
		}
	}

}
