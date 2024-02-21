package cond.ex;

public class CondOpEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int big;

        big = (a > b) ? a : b;

        System.out.println("더 큰 숫자는 " + big + "입니다.");
    }
}
