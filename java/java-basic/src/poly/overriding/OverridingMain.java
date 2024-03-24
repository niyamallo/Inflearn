package poly.overriding;
/*
메서드 오버라이딩에서 꼭! 기억해야 할 점: 오버라이딩 된 메서드가 항상 우선권을 가진다.
(자식 밑에 손자가 있다면 손자가 우선권. 가장 하위 자식의 오버리이딩 된 메서드가 우선권!!)
참고: 멤버 변수는 오버라이딩 되지 않는다. 부모, 자식 모두 같은 이름의 변수를 각각 가질 수 있다.
 */

public class OverridingMain {

    public static void main(String[] args) {
        //자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();

        //부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value); //변수는 오버라이딩X: value = parent
        poly.method(); //메서드 오버라이딩 호출: Child.method
    }
}
