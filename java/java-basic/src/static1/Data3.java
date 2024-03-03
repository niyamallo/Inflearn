package static1;

public class Data3 {
    public String name;
    public static int count;
    //static을 사용하면 공용으로 함께 사용하는 변수를 만들 수 있다!!
    //이렇게 멤버 변수에 static을 붙이게 되면 static 변수, 정적 변수 또는 클래스 변수라 한다.

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
