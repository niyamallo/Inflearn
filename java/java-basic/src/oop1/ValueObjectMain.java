package oop1;

public class ValueObjectMain {

    public static void main(String[] args) {
        ValueData2 valueData = new ValueData2();
        //객체는 자신의 메서드를 통해 자신의 멤버 변수에 접근할 수 있다.
        //기본적으로 인스턴스에서 메서드를 호출하면,
        //본인 인스턴스에 있는 멤버변수에 접근한다.
        valueData.add();
        valueData.add();
        valueData.add();
        System.out.println("최종 숫자=" + valueData.value);
    }
}
