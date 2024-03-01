package pack; //코드는 package, import class 순으로 작성하면 된다.

import pack.a.User;
import pack.a.*; //패키지 안에 있는 여러 class를 사용하고 싶을 떄는 *을 이용하면 된다.

public class PackageMain2 {

    public static void main(String[] args) {
        Data data = new Data();
        //import를 했기 때문에 pack.a.User()로 쓰지 않아도 된다.
        User user = new User();
        User2 user2 = new User2();
    }
}
