public class HouseDog extends Dog { // java에서는 다중 상속은 X
    
    public void sleep(){

        System.out.println(this.name + " zzz  in house");
    }


public static void main(String[] args) {
    HouseDog houseDog = new HouseDog();
    houseDog.setName("happy"); // 할아버지 거를 가져다 쓴다.
    houseDog.sleep();
    }
}
