package array.ex;

import java.util.Scanner;

public class ArrayEx4 {

    public static void main(String[] args) {
        //사용자에게 5개의 정수를 입력받아 배열에 저장하고, 합계와 평균을 출력하시오.

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;
        double average;
        
        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        average = (double) sum / numbers.length;

        //출력
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
