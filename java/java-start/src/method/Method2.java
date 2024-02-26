package method;

public class Method2 {

    public static void main(String[] args) {//메서드가 값을 반환하지 않을 때는 void
        printHeader();
        System.out.println("프로그램이 동작합니다.");
        printFooter();
    }

    public static void printHeader() {//매개변수가 없는 경우
        System.out.println("= 프로그램을 시작합니다 =");
        return; //반환 값이 없을 때는 그냥 return만 사용
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다 =");
        //반환 값이 없는 경우 return;을 적지 않아도 된다.
        //Java가 알아서 처리해줌.
    }
}
