package method;

public class MethodCasting1 {

    public static void main(String[] args) {
        double number = 1.5;
        //printNumber(number); double을 int에 담을 수 없어 컴파일 에러
        printNumber((int) number); //명시적 형변환으로 double을 int로 바꿈.
    }

    public static void printNumber(int n) {
        System.out.println("숫자: " + n);
    }
}
