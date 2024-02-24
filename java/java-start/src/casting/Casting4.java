package casting;

public class Casting4 {

    public static void main(String[] args) {
        //자바에서 계산은 다음 2가지를 따른다.
        //1. 같은 타입끼리의 계산은 같은 타입의 결과를 낸다.
        //2. 서로 다른 타입의 계산은 큰 범위로 자동 형변환이 일어난다.
        int div1 = 3 / 2; //1.5
        System.out.println("div1 = " + div1); //1

        double div2 = 3 / 2; //1.5
        System.out.println("div2 = " + div2); //1.0, 3과 2가 모두 int형이라 일단 1이라는 int 값이 나온 뒤 double에 할당

        double div3 = 3.0 / 2; //1.5
        System.out.println("div3 = " + div3); //1.5, 2가 3.0으로 자동 형변환되어 1.5라는 double 값이 나온 뒤 double에 할당

        double div4 = (double) 3 / 2; //1.5, 3을 double로 캐스팅
        System.out.println("div4 = " + div4); //1.5

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result); //1.5
    }
}
