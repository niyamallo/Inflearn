package pack;

public class PackageMain1 {

    public static void main(String[] args) {
        Data data = new Data(); //같은 패키지에 있는 클래스는 그냥 쓰면 됨.
        //패키지가 다른 클래스를 쓸 때는 원칙적으로는
        pack.a.User user = new pack.a.User();
    }
}
