package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        //생성자는 인스턴스를 생성하고 나서 즉시 호출된다.
        //따라서 new 명령어 다음에 생성자 이름과 매개변수에 맞추어 인수를 전달하면 된다.
        MemberConstruct member1 = new MemberConstruct("user1", 15 , 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16 , 80);

        MemberConstruct[] members = { member1, member2 };

        for (MemberConstruct s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
        //생성자 장점
        //1.중복 호출 제거
        //2.제약-생성자 호출 필수: 실수로 메서드를 호출하지 않는 경우를 사전에 예방
        //  유령으로 존재하는 인스턴스가 생기는걸 사전에 방지(생성자 없는 경우 매서드를 호출하지 않아도 컴파일 에러가 발생x)
        //  따라서 필수적인 값들은 생성자를 이용해서 넣어주게 만드는 것이 좋다.
    }
}
