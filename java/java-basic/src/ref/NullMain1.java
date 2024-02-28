package ref;

public class NullMain1 {

    public static void main(String[] args) {
        //null은 참조형 변수에서 가리키는 객체가 없다는 뜻
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data();
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = " + data);
        //이러면 더이상 Data 인스턴스를 아무도 참조하지 않게 된다.
        //자바에서 아무도 참조하지 않는 인스턴스가 있으면, JVM의 GC(가비지 컬렉션)가
        //더 이상 사용하지 않는 인스턴스라 판단하고 해당 인스턴스를 자동으로 메모리에서 제거해준다.
        //특히 메서드의 지역변수들이 사라질 때 GC의 대상이 된다.
    }
}
