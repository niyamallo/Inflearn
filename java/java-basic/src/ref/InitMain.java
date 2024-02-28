package ref;

public class InitMain {

    public static void main(String[] args) {
        //멤버 변수는 초기값이 없으면 자동으로 초기화(null, false, 0)
        //지역 변수는 초기화를 해줘야 사용할 수 있다.
        InitData data = new InitData();
        System.out.println("value1 = " + data.value1); //0
        System.out.println("value2 = " + data.value2); //10
    }
}
