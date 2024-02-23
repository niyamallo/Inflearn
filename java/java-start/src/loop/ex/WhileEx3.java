package loop.ex;

public class WhileEx3 {

    public static void main(String[] args) {
        int sum = 0;
        int count = 1;
        int max = 5;

        while (count <= max) {
            sum += count++;
        }
        System.out.println(sum);
    }
}
