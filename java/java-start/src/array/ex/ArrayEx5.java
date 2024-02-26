package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {
        //사용자에게 입력받을 숫자의 개수를 입력받고, 합계와 평균을 출력하시오.

        Scanner input = new Scanner(System.in);
        System.out.print("입력 받을 숫자의 개수를 입력하세요:");
        int count = input.nextInt();

        int[] numbers = new int[count];
        int sum = 0;
        double average;
        
        System.out.println(count + "개의 정수를 입력하세요:");
        for (int i = 0; i < count; i++) {
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        average = (double) sum / count;

        //출력
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
