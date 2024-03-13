package final1;

public class FinalRefMain {

    public static void main(String[] args) {
        final Data data = new Data(); //참조형
        //data = new Data(); 컴파일 오류. 할당된 참조값을 바꿀 수 없다.

        //그런데, 참조 대상의 값은 변경 가능 (여기서 value는 final이 아니기 때문)
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
