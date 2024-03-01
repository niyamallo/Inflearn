package construct;

public class MemberInit2 {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade) {
        //매개변수의 이름과 맴버 변수의 이름이 같은 경우 가장 가까운 스코프에서 가져오기 때문에
        //둘 다 initMember 의 파라미터가 적용된다.
        //자신의 인스턴스를 가리키고 싶으면 앞에 this를 붙인다.
        //this는 인스턴스 자신의 참조값을 가리킨다.
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
