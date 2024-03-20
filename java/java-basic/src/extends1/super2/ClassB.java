package extends1.super2;

public class ClassB extends ClassA{

    public ClassB(int a) {
        super(); //이렇게 매개변수가 없는 기본 생성자의 경우에는 생략 가능. 자바가 알아서 해줌.
        System.out.println("ClassB 생성자 a=" + a);
    }

    public ClassB(int a, int b) {
        super(); //기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a=" + a + ", b=" + b);
    }
}
