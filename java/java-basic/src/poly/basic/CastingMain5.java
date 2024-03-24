package poly.basic;

public class CastingMain5 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);
        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    //실제로 어떤 인스턴스인지 확인하고 싶을 때 instanceof 사용
    //instanceof를 사용해서 원하는 타입으로 변경이 가능한지 확인한 다음 다운캐스팅을 하는 것이 안전하다.
    //참고로 instanceof는 오른쪽 대상의 자식 타입을 왼쪽에서 참조하는 경우에도 true를 반환한다.
    private static void call(Parent parent){
        parent.parentMethod();
        if (parent instanceof Child) {
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        } else {
            System.out.println("Child 인스턴스 아님");
        }
    }
}
