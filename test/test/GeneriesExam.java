package test;

import java.util.ArrayList;

public class GeneriesExam {

	public static void main(String[] args) {
		
		// Generies 는 입력되는 자료형을 강제한다.
		
		ArrayList<String> alist = new ArrayList<String>();
		// <자료형> / <만든 자료형> String X
		
		alist.add("hello");
		alist.add("24144"); // 숫자는 "" 안에 들어가 String으로 인식시키지 않는 이상 들어갈 수 없다.
		alist.add("world");

		// Generies를 선언하면 형변환과 같은 불필요한 코딩과 잘못된 형변환 등의 오류를 사전에 방지할 수 있다. 
	}

}
