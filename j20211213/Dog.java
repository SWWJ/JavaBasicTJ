public class Dog extends Animal { // public class 현재의 class extends class명 -> Animal class의 기능을 모두 가져옴

public void sleep(){

    System.out.println(this.name + " zzz");
}

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep();
    }
}
