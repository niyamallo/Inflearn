package static2;

public class DecoData {
    //static 메서드는 static만 사용할 수 있다.
    //클래스 내부의 기능을 사용할 때, 정적 메서드는 static이 붙은 정적 메서드나 정적 변수만 사용할 수 있다.
    //클래스 내부의 기능을 사용할 때, 정적 메서드는 인스턴스 변수나, 인스턴스 메서드를 사용할 수 없다.
    private int instatnceValue;
    private static int staticValue;

    public static void staticCall() {
        /*
        instanceValue++; //인스턴스 변수 접근, compile error
        instanceMethod(); //인스턴스 메서드 접근, compile error
        */
        
        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }
    
    public void instanceCall() {
        instatnceValue++; //인스턴스 변수 접근
        instanceMethod(); //인스턴스 메서드 접근
        
        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    private void instanceMethod() {
        System.out.println("instanceValue=" + instatnceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}
