package construct;

public class MethodInitMain3 {

    public static void main(String[] args) {
        MemberInit2 member1 = new MemberInit2();
        member1.initMember("user1", 15, 90);

        MemberInit2 member2 = new MemberInit2();
        member2.initMember("user2", 16, 80);

        MemberInit2[] members = { member1, member2};

        for (MemberInit2 s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성정:" + s.grade);
        }
    }
}
