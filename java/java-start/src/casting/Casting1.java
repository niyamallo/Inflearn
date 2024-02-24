package casting;

public class Casting1 {

    public static void main(String[] args) {
        //자바에서 숫자를 표현할 수 있는 범위는 int < long < double
        //작은 범위에서 큰 범위에 값을 대입하는 코드는 문제없다.
        //내부적으로 자동 형변환(묵시적 형변환)이 일어남.
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; //int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; //int -> double
        System.out.println("doubleValue = " + doubleValue);
        
        doubleValue = 20L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
