package loop;

public class DoWhile2 {

    public static void main(String[] args) {
        //DoWhile문은 처음에 무조건 1번은 실행
        int i = 10;

        do {
            System.out.println("현재 숫자는:" + i);
            i++;
        } while (i < 3);
    }
}
