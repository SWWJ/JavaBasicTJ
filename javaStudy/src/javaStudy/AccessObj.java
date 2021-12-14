package javaStudy;

public class AccessObj {
	public int p = 3;     // 모든 접근을 허용한다.
	protected int p2 = 4; // protected 는 같은 패키지, 즉 같은 폴더에서만 접근을 허용한다.
						  // 단, 상속받은 경우는 예외이다. 
	int k = 2;			  // default 생략하면 기본. 무조건 같은 패키지 내에서만 접근을 허용한다.
	private int i = 1;    // private 은 자기 자신만 사용할 수 있다. (같은 클래스 안에서만)
	
	// 메서드, 변수, 클래스 앞에 사용 가능
		
	// public >> protected >> (default) >> private
}
