public class StringBufferExam {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        sb.append("Hello World");
        System.out.println(sb.substring(0,4));
        
        // StringBuffer - 문자열을 수정/변경할 때 사용

        // StringBuffer sb = new StringBuffer();  // SpringBuffer 객체 생성, .append로 값 입력
        // sb.append("hello");
        // sb.append(" ");
        // sb.append("world"); // 순차적으로 입력.

        // String result = sb.toString();
        // System.out.println(result); // 이건 객체가 하나, 안에서 수정을 계속 해 나감

        // String result = ""; // 아무것도 없는 객체가 하나 생성 -> 수정이 아니라 계속 생성
        // result += "hello";  // 거기에 객체 하나를 추가, 계속해서 객체를 만들어 냄
        // result += " ";
        // result += "world"; // 누적의 개념!!
        // System.out.println(result);
    }
}

        // 첫 번째 예제 StringBuffer는 객체가 한 번만 생성된다.
        // 반면에 두 번째 String 예제는 자료형에 + 연산이 사용될 때마다 계속 새로운 객체가 추가되어 생성된다. (새로운 객체를 만들어낸다.)

        // String 자료형은 한 번 만들게 되면 수정이 불가능하다. 그 값을 변경할 수 없다. immutable (수정x) 하다고 표현한다.
        // toUpperCase와 같은 메서드의 경우도 문자열이 변경되는 것처럼 보일 수는 있지만 메서드 수행 시 또 다른 객체를 생성하여 return하는 것이다.

        // 그렇다면 무조건 StringBuffer() 를 사용하는 것이 좋은가?
        // - 상황에 따라 다르다. StringBuffer()는 기본적으로 String 보다 무겁다. 기본적인 메모리 사용량도 크고 속도도 느리다.
        // 문자열 추가나 변경이 많을 경우에만 StringBuffer를 사용하고 변경/수정 작업이 거의 없는 경우에는 String을 사용하자.