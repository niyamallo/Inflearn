package method.ex;

public class MethodEx2Ref {
    //반복 출력 리펙토링
    public static void main(String[] args) {
        printMessage("Hello, world!",3);
        printMessage("Hello, java!",5);
        printMessage("Hello, hi!",7);
    }

    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
