package poly.basic;

public class CastingMain2 {
    //다운캐스팅 결과를 변수에 담아두고 이후에 기능을 사용하기 번거로울 때,
    //일시적 다운 캐스팅
    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        //단, 자식의 기능은 호출할 수 없다. 컴파일 오류
        //poly.childMethod();

        //일시적 다운 캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod();
    }
}
