package poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        //부모 타입의 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 타입의 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        //부모 타입의 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child(); //부모 타입은 모든 하위 타입을 담을 수 있다. 반대는 컴파일 오류 발생.
        poly.parentMethod();
        //다양한 형태로 참조할 수 있다고 하여, 다형적 참조라고 한다.

        //다형적 참조의 한계: 자식의 기능은 호출할 수 없다. 컴파일 오류
        //poly.childMethod(); 불가능. 이런 경우 childMethod()를 호출하고 싶으면 캐스팅이 필요하다.


    }
}
