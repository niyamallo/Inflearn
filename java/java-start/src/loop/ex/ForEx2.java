package loop.ex;

public class ForEx2 {

    public static void main(String[] args) {

        for (int num = 2, count = 1; count <= 10; num += 2, count++) {
            //이렇게 여러개의 변수를 동시에 관리할 수도 있다.
            //그냥 num을 밖에 int num = 2;라고 빼고 for 선언과 증감에는 카운트 관련 변수만 사용하는게 깔끔
            System.out.println(num);
        }
    }
}
