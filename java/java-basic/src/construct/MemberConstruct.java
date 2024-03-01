package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //생성자를 만들 때는 클래스명과 동일하게! 따라서 첫글자도 대문자
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + " ,age=" + age + " ,grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
        //생성자는 반환 타입이 없다. 비워두어야 한다. 나머지는 메서드와 동일
    }
}
