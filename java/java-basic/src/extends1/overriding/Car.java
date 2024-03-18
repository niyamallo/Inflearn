package extends1.overriding;

public class Car {

    public void move() {
        System.out.println("차를 이동합니다.");
    }

    //추가. 자식들에게 한 번에 기능을 추가하기 편하다.
    public void openDoor() {
        System.out.println("문을 엽니다.");
    }
}
