package extends1.ex2;

public class ElectricCar extends Car {
    //extends를 이용해서 상속받는다.
    //자바는 다중상속을 지원하지 않기 때문에 extends는 하나만 사용할 수 있다.

    public void charge() {
        System.out.println("차를 충전합니다.");
    }
}
