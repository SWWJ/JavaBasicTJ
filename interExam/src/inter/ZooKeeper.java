package inter;

public class ZooKeeper {
	
	public void feed(Predator predator) { // 인터페이스 구현한 것은 그 인터페이스의 자료형이다.
		System.out.println("feed " + predator.getFood()); // 각 문서에서 getFood를 호출
		// Predator predator -> Lion lion (구현한 인터페이스) 해당 predator(인터페이스)의 getFood를 호출함.
		
		// 객체가 한 개 이상의 자료형 타입을 갖게 되는 특성을 다형성이라고 한다.
		
//	public void feed(Tiger tiger) { // Tiger 자료형의 tiger가 들어옴
//		System.out.println("feed apple");
//	}
//	
//	public void feed(Lion lion) { // Lion 자료형
//		System.out.println("feed banana");
//	}
//	
//	public void feed(Donkey donkey) { // Donkey 자료형
//		System.out.println("feed carrot");
//	}
	}
	
	public static void main(String[] args) {
		ZooKeeper zooKeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		Donkey donkey = new Donkey();
		Cheetah cheetah = new Cheetah();
		Cat cat = new Cat();
		
		zooKeeper.feed(tiger); // tiger 를 호출 메서드 오버로딩 - 자료형에 따라 달라짐.
		zooKeeper.feed(lion);
		zooKeeper.feed(donkey);
		zooKeeper.feed(cheetah);
		zooKeeper.feed(cat);
	}
}
