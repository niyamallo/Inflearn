package construct;

public class MemberConstruct2 {
    String name;
    int age;
    int grade;

    //생성자도 메서드처럼 오버로딩 할 수 있다.
    MemberConstruct2(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 50;
        //위의 3줄을 입력하는 대신
        //this(name, age, 50); 라고 변경해도 동일함.
        //생성자에서 자신의 다른 생성자를 호출하고 싶으면 this 사용
        //이를 통해 생성자 내부의 중복되는 코드를 제거할 수 있다.
        //규칙: 생성자 호출 this()는 생성자 코드의 첫줄에만 작성할 수 있다!
        //System.out.println("hello!");
        //this(name, age, 50); 이런 순서로 작성하면 안된다는 말!
    }
    MemberConstruct2(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + " ,age=" + age + " ,grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
