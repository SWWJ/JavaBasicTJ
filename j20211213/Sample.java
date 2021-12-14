package j20211213;

public class Sample { // 한 파일 안에 한 클래스 위치
    public static void main(String[] args) {
        System.out.println(CalExam.add(3)); // class CalExam의 add 메서드를 호출, 에 3을 추가
        System.out.println(CalExam.add(4));

        System.out.println("");

        System.out.println(CalExam2.add(6)); // class CalExam의 add 메서드를 호출, 에 3을 추가
        System.out.println(CalExam2.add(5)); // 계산기가 따로 그 값을 유지해야 한다.
    }
}