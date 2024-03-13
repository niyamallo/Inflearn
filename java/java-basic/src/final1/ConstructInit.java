package final1;
//final - 필드(멤버변수)

public class ConstructInit {

    final int value;
    //final을 필드에 사용할 경우에는 생성자를 통해서 값을 넣어주어야하고, 이후에는 변경 불가능.

    public ConstructInit(int value) {
        this.value = value;
    }
}
