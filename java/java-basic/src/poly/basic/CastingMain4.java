package poly.basic;

//다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {

    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod(); //문제 없음.

        Parent parent2 = new Parent();
        //Child child2 = (Child) parent2; //런타임 오류(프로그램 실행 중에 발생) - ClassCastException
        //new Parent()로 부모 타입으로 객체를 생성했기 때문에 메모리 상에 자식 타입이 전혀 존재하지 않는다.
        //child2.childMethod(); 실행 불가

        //하위 타입을 만들면 부모가 모두 만들어지기 때문에 업캐스팅은 안전.
        //자식 타입의 인스턴스가 생성되지 않을 수 있기 때문에 다운캐스팅은 명시적으로만 사용가능.
    }
}
