package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = input.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = input.nextInt(); //nextInt는 숫자 뒤에 Enter를 입력했을 때 \n이 남아있게 된다. 다음 입력에 영향을 줌.
            input.nextLine(); //그래서 이렇게 쓸모없는 \n을 읽고 버리는 작업을 해주면 된다.

            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }
    }
}
