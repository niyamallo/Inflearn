package extends1.super1;

public class Child extends Parent {

    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this value = " + this.value); //this 생략 가능. this는 자기 자신(현재 내 타입에서 찾고 없으면 부모에서 찾음)
        System.out.println("super value = " + super.value);
        //자식 타입으로 들어갔을 때, 오버라이딩 된 메서드의 부모타입(본인 타입의 상위)을 쓰고싶을 때 super를 사용.
        //super는 부모 클래스에 대한 참조를 뜻한다.

        this.hello(); //this 생략 가능
        super.hello();
    }
}
