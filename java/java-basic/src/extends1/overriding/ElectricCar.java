package extends1.overriding;

public class ElectricCar extends Car {

    //부모의 기능을 자식이 새로 재정의하는 것을 오버라이딩이라 한다.
    @Override //@가 붙은 부분을 애노테이션이라 함. 프로그램이 읽을 수 있는 특별한 주석이라고 생각하면 된다.
    //애노테이션을 안적어도 정상적으로 작동하지만, 코드를 명확히 하기 위해 꼭 적자.
    //@Override는 override가 정확히 되지 않았을 때 컴파일 오류를 만드는 애노테이션.
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("차를 충전합니다.");
    }
}
