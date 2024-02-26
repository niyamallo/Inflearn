package method;

public class MethodCasting2 {

    public static void main(String[] args) {
        int number = 100;
        printNumber(number);
    } //숫자: 100.0
    //double형 매개변수(파라미터)에 int형 인수를 전달하는 것은 문제없이 잘 동작한다.
    //따라서, 메서드를 호출할 때는 전달하는 인수의 타입과 매개변수의 타입이 맞아야 한다.
    //단, 타입이 달라도 자동 형변환이 가능한 경우에는 호출할 수 있다.

    public static void printNumber(double n) {
        System.out.println("숫자: " + n);
    }
}
