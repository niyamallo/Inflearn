package loop.ex;

public class ForEx3 {

    public static void main(String[] args) {
        int sum = 0;
        int max = 100;

        for (int count = 1; count <= max; count++) {
            sum += count;
        }
        System.out.println(sum);
    }
}
