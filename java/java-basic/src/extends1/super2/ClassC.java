package extends1.super2;

public class ClassC extends ClassB{

    public ClassC() {
        //super(); 불가능. ClassB에서 생성자를 직접 만들어뒀기 때문에 기본생성자가 자동으로 만들어지지 않음.
        super(10, 20); //생성자가 정의되어 있으면 개발자가 직접 호출해야 한다.
        System.out.println("ClassC 생성자");
    }
    /*
    ClassA 생성자
    ClassB 생성자 a=10, b=20
    ClassC 생성자
     */
}
