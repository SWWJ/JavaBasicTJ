package j20211213;

public class HouseDog extends Dog { // java에서는 다중 상속은 X
 
    public HouseDog (String name) {// 생성자 - return 타입이 X -> void도!
        this.setName(name);
    }

    public HouseDog (int type) {
        if(type == 1) {
            this.setName("yoke");
        } else if (type == 2) {
            this.setName("bulldog");
        }
    }

    public void sleep() {
 
        System.out.println(this.name + " zzz  in house");
    }

    public void sleep(int hour) { // 인수, 매개변수 있음
        System.out.println(this.name + " zzz  in house for " + hour + " hours");
    }

public static void main(String[] args) {
    HouseDog houseDog1 = new HouseDog("happpy"); // 객체 생성할 때 자동으로 호출함. 문자열로 생성자 호출
    // houseDog.setName("happy"); // 할아버지 거를 가져다 쓴다.
    System.out.println(houseDog1.name);
    // houseDog.sleep();
    // houseDog.sleep(3);

    HouseDog houseDog2 = new HouseDog(1);  // 숫자로 생성자 호출

    System.out.println(houseDog2.name);
    }
}