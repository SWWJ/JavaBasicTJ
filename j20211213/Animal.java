package j20211213;

public class Animal {

    String name;

    public void setName(String n) { // setname 이라는 메서드를 추가. n에 "boby", "happpy"가 입력.. 개개의 특성을 유지한다.
        this.name = n; // this는 호출한 객체 이름이다. cat이 호출했고, 그것을 boby라고 부여.
    }

    // public static void main(String[] args) {
    //     Animal cat = new Animal(); // 객체 생성 - Animal 이라는 class 로 cat이라는 객체를 생성
    //     cat.setName("boby"); // name에 boby가 들어옴. setName을 호출
    //     System.out.println(cat.name); // 객체를 통해 내용으로 접근할 수 있다. 객체 변수.

    //     Animal dog = new Animal(); // 객체 생성
    //     dog.setName("happy");
    //     System.out.println(dog.name);

    //     Animal horse = new Animal(); // 객체 생성
    //     horse.setName("windy");
    //     System.out.println(horse.name);
    // }
}
