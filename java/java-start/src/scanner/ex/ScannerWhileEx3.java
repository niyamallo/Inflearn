package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        double average = 0.0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");
        while (true) {
            int number = scanner.nextInt();

            if (number == -1) {
                System.out.println("입력한 숫자들의 합계: " + sum);

                //강의에는 나오지 않았지만, 첫 입력값이 -1일 때 sum을 0으로 나누는 문제가 발생.
                //count의 값을 조건문으로 검증하여 예외를 처리하는 방식을 사용해 보았음.
                if (count != 0) {
                    average = (double) sum / count;
                }

                System.out.println("입력한 숫자들의 평균: " + average);
                break;
            }
            sum += number;
            count += 1;
        }
    }
}
