package test;

public interface TV {
    
    public int MIN_VOLUMN = 0; // 변수를 대문자로 설정하면 변하지 않는 상수의 의미로 사용됨.
    public int MAX_VOLUMN = 100;

    public void turnOn();
    public void turnOff();
    public void changeVolume(int volumn);
    public void changeChannel(int channel); // interface 에는 이름만 정의 , 구체적 코드는 작성하지 않음.

}