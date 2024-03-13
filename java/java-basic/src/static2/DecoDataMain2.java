package static2;

public class DecoDataMain2 {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        //추가
        //인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall(); //인스턴스 거쳐서 클래스 메서스 접근하는 방식이라 권장하지 않음.
        //이렇게 작성하면 마치 인스턴스 소속 메서드를 호출하는 것처럼 보이니까 이렇게 작성하지 말자.

        //클래스를 통한 접근
        DecoData.staticCall();
    }
}
