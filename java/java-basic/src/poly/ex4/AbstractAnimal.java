package poly.ex4;

public abstract class AbstractAnimal {
    //순수 추상 클래스: 모든 메서드가 추상 메서드인 추상 클래스
    //순수 추상 클래스는 로직을 전혀 가지고 있지 않다.
    //단지, 다형성을 위한 부모 타입으로써 껍데기 역할 제공할 뿐.
    //자바는 순수 추상 클래스를 더 편리하게 사용할 수 있도록
    //인터페이스 라는 개념을 제공한다!(다음 수업내용)
    public abstract void sound();
    public abstract void move();
}
