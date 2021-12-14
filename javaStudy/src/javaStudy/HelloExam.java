package javaStudy;

import com.eightcruz.study.Hello;
// 다른 패키지에 위피한 파일을 사용할 때.

// import com.eightcruz.study.Hello;

// import com.eightcruz.study.*;
// 링크해 줌. *은 모든 것이라는 의미. 위 폴더에 있는 모든 파일을 임포트한다.
// ctrl + spacebar / ctrl + shift + O

public class HelloExam {
	
	public static void main(String[] args) {
		Hello/* 여기에 ctrl + spacebar */ hello = new Hello();
		// 같은 패키지, 같은 디렉토리가 아니다. 
		// 다른 패키지에 들어 있는 클래스를 이용하기 위해서는 추가적인 작업이 필요하다. - 디렉토리 연결
	}

}
