
public class LedTV implements TV { // public class implements interface명
    // LedTv 클래스는 TV 인터페이스를 구현했다.
    // TV 인터페이스에 정의된 메서드들을 모두 구현해야만 한다.
    
    //@_______ = annotation 애너테이션 - 확인 요청의 의미, 필수는 X 선택이나 필수로 사용됨.
    @Override // 어떤 기능을 썼는지 확인을 요청 - 실행까지 - - -
    public void turnOn() {
        System.out.println("TV on");
    }
    @Override
    public void turnOff() {
        System.out.println("TV off");
    }
    @Override
    public void changeVolume(int volumn) {
        System.out.println("Volume change");
    }
    @Override
    public void changeChannel(int channel) {
        System.out.println("Channel change");
    }
}