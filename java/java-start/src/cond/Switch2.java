package cond;

public class Switch2 {

    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        //switch문은 값이 같은지만 비교할 수 있다.
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
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
