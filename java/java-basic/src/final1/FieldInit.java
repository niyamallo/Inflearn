package final1;

public class FieldInit {

    static final int CONST_VALUE = 10;
    //자바에서 static fianl이 붙으면 대문자로 변수명 처리하는 것이 관례.(상수)
    final int value = 10;
    //모든 인스턴스가 같은 값을 사용하기 때문에 메모리를 낭비하게 된다.
    //그래서 static을 사용하는 것이 좋다.
    //static final int MY_VALUE = 10; 이런 식으로 사용

    /*
    public FieldInit(int value) {
        //this.value = value; //final에 이미 값이 들어있는 경우, 생성자로 값을 못 바꿈.
    }
     */

}
