package method;

public class MethodReturn2 {

    public static void main(String[] args) {
        checkAge(10);
    } //10살, 미성년자는 출입이 불가능합니다.

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + "살, 미성년자는 출입이 불가능합니다.");
            return; //return을 만나면 메서드를 빠져나간다.
        }

        System.out.println(age + "살, 입장하세요.");
    }
}
