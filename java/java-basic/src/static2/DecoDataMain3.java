package static2;

import static static2.DecoData.staticCall;
//정적 메서드를 선언해서 클래스명을 생략할 수 있게 한다.
//모든 메서드를 쓰고싶으면 static2.DecoData.* 이런식으로 사용.
//정적 메서드 뿐 아니라 정적 변수도 import static으로 사용할 수 있다.

public class DecoDataMain3 {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();
        staticCall();
        staticCall();
        staticCall();
        staticCall();
        staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();
    }

    //추가
    //main 메서드도 static이기 때문에 같은 클래스 내부에서 메서드를 호출하고 싶으면
    //정적 메서드로 만들어두어야 한다. 그래서 main이 호출하는 메서드 앞에 static을 붙였던 것.
}
