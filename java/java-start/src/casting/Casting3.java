package casting;

public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647L; //int 최고값
        //long maxIntOver = 2147483648; //integer number too large
        long maxIntOver = 2147483648L; //int 최고값 + 1 (초과)
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting= " + intValue); //2147483647 int에 들어갈 수 있는 값이니까 문제 없음.

        intValue = (int) maxIntOver; //형변환
        System.out.println("maxIntOver casting= " + intValue); //-2147483648 int의 범위를 넘어서 int의 가장 작은 범위부터 다시 시작. 오버플로우
        //오버플로우 되는 값을 활용해서 무언가 하려고 하면 안됨.
        //오버플로우가 생긴 것 자체가 이미 문제. 오버플로우가 생기지 않도록 하자.
    }
}
