package method;

public class Overloading3 {
    //매개변수의 타입이 다른 경우2
    public static void main(String[] args) {
        System.out.println("1: " + add(1,2));
        //위의 코드는 두 가지 메서드에 모두 들어갈 수 있지만,
        //이 경우 형변환 없이 들어갈 수 있는 메서드를 우선한다.
        System.out.println("2: " + add(1.2,1.5));
    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
