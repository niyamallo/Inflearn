package method;

public class Overloading1 {
    //매개변수의 갯수가 다른 경우
    public static void main(String[] args) {
        System.out.println("1: " + add(1,2));
        System.out.println("2: " + add(1,2,3));
    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }
}
