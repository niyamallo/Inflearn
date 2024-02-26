package array.ex;

import java.util.Scanner;

public class ArrayEx3 {

    public static void main(String[] args) {
        //사용자에게 5개의 정수를 입력받아 배열에 저장하고, 역순으로 출력하시오.

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        
        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("입력한 정수를 역순으로 출력");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[numbers.length - 1 - i]);
            if (i != numbers.length - 1) {
                System.out.print(", ");
            }
        }
        //또는 for (int i = numbers.length - 1; i >= 0; i--){}
        //같은 방식으로 처리
    }
}
