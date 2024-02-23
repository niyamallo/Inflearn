package scope;

public class Scope1 {

    public static void main(String[] args) {
        //지역 변수는 본인의 코드 블록 안에서만 생존한다.
        int m = 10; //m 생존 시작
        if (true) {
            int x = 20; //x 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } //x 생존 종료
        //System.out.println("main x = " + x); 불가능. cannot find symbol
        System.out.println("main m = " + m);
        //int m 은 main{} 전체에서 접근할 수 있기 때문에 스코프가 넓고,
        //int x 는 if{} 코드 블록 안에서만 접근할 수 있기 때문에 스코프가 짧다.
    }
}
