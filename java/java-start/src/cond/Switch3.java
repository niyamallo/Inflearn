package cond;

public class Switch3 {

    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        //switch문은 값이 같은지만 비교할 수 있다.
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2: //break가 없으면 다음 case가 실행되어 coupon이 3000이 됨.
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
                break;
        }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
