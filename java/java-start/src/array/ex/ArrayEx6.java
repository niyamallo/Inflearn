package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        //사용자에게 입력받을 숫자의 개수를 입력받고, 최솟값, 최댓값을 출력하시오.

        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 받을 숫자의 개수를 입력하세요:");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        int minNumber, maxNumber;

        System.out.println(n + "개의 정수를 입력하세요:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        minNumber = maxNumber = numbers[0]; //이렇게는 잘 사용하지 않고 2줄에 나눠서 각각 numbers[0] 할당하는게 일반적
        for (int number : numbers) {
            if (number < minNumber) {
                minNumber = number;
            } else if (number > maxNumber) {
                maxNumber = number;
            }
        }

        System.out.println("가장 작은 정수: " + minNumber);
        System.out.println("가장 큰 정수: " + maxNumber);
    }
}
