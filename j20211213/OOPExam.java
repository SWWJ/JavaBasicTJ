package j20211213;

public class OOPExam {
    
    /*
    OOP Object Oriented Programming 객체 지향 프로그래밍

    class - 붕어빵을 만들어내는 틀
    object (객체) - 붕어빵틀로 만들어내는 붕어빵

    생성된 객체들은 각각 다른 개성을 갖게 된다. (*****************************) 같은 속성을 가지는 게 아니다. 객체들이 각자 지향하는 바가 다르다.

    method (메서드) - 다른 언어에서는 함수 또는 메서드로 사용되나 자바에서는 메서드만 존재한다. 
                      class 내의 함수 -> 메서드, 특정 기능을 수행하는 역할, 인풋-아웃풋. add/sub 등 - return

    클래스 밖 - 함수
    클래스 안 - method

    // public 접근제어자 private default etc.
    public int sum(int a, int b) { // int 리턴 타입 return이 되는 a+b의 자료형. return 자료형의 타입. 
    이 자리에 void가 오면 return이 온다. return이 없으면 void를 쓴다.
    // 메서드명 sum. (임의로 지정)
    // () 인풋(input 입력) -> 매개변수, 인수. a에 값이 들어옴. a=3이라 할 때, a를 매개변수, 실제값인 3이 인수.
    // return output ->  (return이 없을 때에는 리턴 자료형(int) void를 입력)
        return a+b;
    }
    
    == RETURN의 형태 ==

    입력 출력이 모두 있는 메서드 (네 개 중 일반적으로 가장 많이 사용되는 형태)
        public int sum(int a, int b) { 
            return a+b; - 출력 자리
        }

    입력 출력이 모두 없는 메서드
        public void sum() {  // return이 없어서 void로 전환

        }

    입력만 있는 메서드
        public void sum(int a, int b) { 
        }

    출력만 있는 메서드
        public int sum() { 
            return a+b;
        }
    */

}