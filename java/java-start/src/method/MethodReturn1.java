package method;

public class MethodReturn1 {

    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }

    /*
    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        }
    } //이렇게 할 경우 조건을 만족하지 않을 때 return문이 실행되지 않아
    //return 문을 누락했다는 컴파일 오류가 발생한다.
    //java: missing return statement
     */

    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        } else {
            return false;
        } //이렇게 조건에 상관없이 항상 return이 나오도록 만들어야 함.
    }
}
