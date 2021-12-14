package j20211213;

public class MethodExam {

    // 1. 입력(input)과 출력(output)이 모두 있는 method (***)
    public int sum(int a, int b) {
        return a+b;
    }

    // 2. 입력(input)과 출력(output)이 모두 없는 method
    public void noino() {
        System.out.println("no input no output");
    }

    // 3. input만 있는 method
    public void onlyInput(String a) {
        System.out.println(a);
    }

    // 4. output만 있는 method
    public String onlyOutput() {
        return "hi";
    }

    // * return의 다른 사용법
        public void sayNick(String nick) {
            if ("fool".equals(nick)) {
               return;  // return 값이 없음. fool로 들어오면 그냥 돌아감.
            }
            System.out.println("my nick name is " + nick);
        }


    public static void main(String[] args) { // 시작점을 나타내는 메서드
        MethodExam inandout = new MethodExam(); // 객체 생성
        // System.out.println(inandout.sum(3,4)); // 객체로 메서드 호출. 결과값이 (inandout.sum(3,4))에 값이 돌아와서 출력.
        // inandout.noino(); // 이 안에 아무것도 없어서 그냥 호출, 돌아오는 것도 없고, 거기서 찍으라는 명령어가 있어서 출력된 것일 뿐이다.
        // inandout.onlyInput("Hello World"); // return 값은 없다.
        // System.out.println(inandout.onlyOutput());
        inandout.sayNick("fool");
        inandout.sayNick("austin");
    }
}