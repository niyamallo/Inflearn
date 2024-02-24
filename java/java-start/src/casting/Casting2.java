package casting;

public class Casting2 {

    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;
        
        //intValue = doubleValue; //컴파일 오류 발생
        intValue = (int) doubleValue; //명시적 형변환으로 강제로 변환 가능
        System.out.println("intValue = " + intValue); //1
        //형변환을 한다고 해서 그 안에 있는 값이 변경되는 것은 아니다.
        //doubleValue 안에 들어있는 값은 1.5로 그대로 유지된다.
        System.out.println("doubleValue = " + doubleValue); //1.5
        //변수의 값은 대입연산자 (=)를 사용해서 직접 대입할 때만 변한다.

        int z = (int) 10.5;
        System.out.println("z = " + z);
    }
}
