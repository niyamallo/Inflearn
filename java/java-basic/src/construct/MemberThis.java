package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        //매개변수(지역변수)에 nameField와 같은 이름이 없으니까 이런 경우 맴버변수에 자연스럽게 접근한다.
        //이런 경우는 this를 생략할 수 있다.
        nameField = nameParameter;
    }
}
