package cond.ex;

public class ExchangeRateEx {

    public static void main(String[] args) {
        int dollar = 20;
        int won = dollar * 1300; //문제에서 환율은 달러당 1300원

        if (dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            System.out.println("환전할 금액은 " + won + "원입니다.");
        }
    }
}
