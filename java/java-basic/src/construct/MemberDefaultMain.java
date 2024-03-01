package construct;

public class MemberDefaultMain {

    public static void main(String[] args) {
        MemberDefault memberDefault = new MemberDefault();
    }

    /*
    정리
    - 생성자는 반드시 호출되어야 한다.
    - 생성자가 없으면 기본 생성자를 자바가 자동으로 만들어준다.
    - 생성자가 하나라도 있으면 기본 생성자가 제공되지 않는다!
      이 경우 개발자가 정의한 생성자를 직접 호출해야 한다!
     */
}
