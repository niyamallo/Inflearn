package construct;

public class MemberDefault {
    /*
    기본생성자
    - 매개변수가 없는 생성자를 기본 생성자라 한다.
    - 클래스에 생성자가 하나도 없으면 자바 컴파일러는 매개변수가 없고, 작동 코드가 없는 기본 생성자를 자동으로 생성.
    - 주의: 생성자가 하나라도 있으면 자바는 기본 생성자를 만들지 않는다.
    public MemberDefault() {} //기본생성자
    이때, 클래스가 public이면 기본생성자 앞에도 public이 붙는다.
    물론, 기본생성자를 직접 정의해도 됨.
     */

    String name;
    
    public MemberDefault() {
        System.out.println("생성자 호출");
    }
}
