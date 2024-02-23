package loop;

public class Break3 {

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; ; i++) {
            //이렇게 for문 안에서 i를 선언하면 외부에서는 사용할 수 없다.
            //자세한건 scope에서 배움.
            sum = sum + i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }
        }
    }
}
