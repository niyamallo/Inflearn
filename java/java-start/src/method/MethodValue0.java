package method;

public class MethodValue0 {
    //너무너무 중요한 자바의 대원칙!
    //자바는 항상 변수의 값을 복사해서 대입한다.
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1; //num1이라는 변수 자체가 num2에 대입되는 것이 아니라,
        //num1에 있는 값을 복사해서 num2에 대입하는 것.
        num2 = 10;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
