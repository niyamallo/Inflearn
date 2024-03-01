package pack;

import pack.a.User;

public class PackageMain3 {

    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
        //같은 클래스 명을 가지는 다른 패키지의 클래스를 사용하고 싶을 때는
        //어쩔 수 없이 하나는 전체 경로를 적어주어야 한다.
        //따라서, 이런 경우 자주 사용하는 클래스를 import 하는 것이 낫다.
        //둘 다 경로를 표시하는 것은 가능
    }
}
