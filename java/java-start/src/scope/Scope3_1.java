package scope;

public class Scope3_1 {

    public static void main(String[] args) {
        int m = 10;
        int temp = 0;
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
    //이렇게 코드를 짜면 temp가 if코드 블록에서만 필요한데 밖에서 선언됨.
    //1. 비효율적인 메모리 사용 : main 코드 블록이 종료될 떄 까지 temp가 메모리에 유지됨.
    //2. 코드 복잡성 증가 : if가 끝난 이후에도 temp를 계속 신경써야 함.
}
