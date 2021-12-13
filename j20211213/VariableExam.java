public class VariableExam { // class도 하나의 자료형으로 사용된다. class로 찍어낸 객체 유형만 적용할 수 있다.
    /* 변수의 영향 범위
    
    전역 변수와 지역 변수
    전역 변수는 밖에서 선언 - 전역에 영향을 미친다.
    지역 변수는 메서드 안에서 선언 - 어떤 지역({ })에만 영향을 끼친다.
    */

    int a;  // 전역 변수의 사용은 지양하자.

    public void varTest(VariableExam testVar) {
        testVar.a++;
//      return a; // return이 지정되면 개개의 변수였던 것이 연결된다. return형!
    }

    public static void main(String[] args) {
//      int a = 1; // 이것을 method 안에서 선언함. 
        VariableExam testVar = new VariableExam(); // 객체 생성
        testVar.a = 1; // 객체의 변수를 설정
        testVar.varTest(testVar);
        System.out.println(testVar.a); // 위와 아래의 변수가 완전히 다른 것? 

        /// 1. 메서드 안에서 선언된 변수는 그 메서드 안에서만 사용이 된다. (지역변수)
    }
}
