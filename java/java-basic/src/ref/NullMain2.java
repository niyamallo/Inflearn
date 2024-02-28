package ref;

//참조값 없이 객체를 찾을 때 발생하는 예외: NullPointerException
//즉, null에 .(dot)을 찍었을 때 발생한다.
public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        /*
        data.value = 10; //NullPointerException 예외 발생
        System.out.println("data = " + data.value);
         */
    }
}
