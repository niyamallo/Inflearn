package final1;
//final 키워드는 이름 그대로 끝!이라는 뜻.
//변수에 final 키워드가 붙으면 더는 값을 변경할 수 없다.
//final은 class, method를 포함한 여러 곳에 붙을 수 있다.

public class FinalLocalMain {

    public static void main(String[] args) {
        //final 지역 변수
        final int data1;
        data1 = 10; //최초 1번만 할당 가능
        //data1 = 20; //컴파일 에러

        //final 지역 변수2
        final int data2 = 10;
        //data2 = 20; //컴파일 에러
    }

    static void method(final int parameter) {
        //parameter = 20; //컴파일 오류. parameter로 들어오는 값이 final로 고정되기 때문.
        //즉, 매개변수에 final이 붙으면 메서드 내부에서 매개변수의 값을 변경할 수 없다.
    }
}
