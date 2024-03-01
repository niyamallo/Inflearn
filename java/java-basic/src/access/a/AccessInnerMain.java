package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        //같은 패키지 default 호출 가능
        data.defaultField = 2;
        data.defaultMethod();

        //private 호출 불가
        //data.privateField = 3;
        //data.privateMethod();

        data.innerAccess(); //public 메서드여서 가능
        //privateMethod를 public 메서드 안에 넣어두었기 때문에 메서드가 속한 클래스 내부에서는 동작.
        /*
        내부 호출
        publicMethod 호출 100
        defaultMethod 호출 200
        privateMethod 호출 300
         */
    }
}
