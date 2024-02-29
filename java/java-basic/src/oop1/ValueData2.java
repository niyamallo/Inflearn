package oop1;

public class ValueData2 {
    //자바 같은 객체 지향 언어는 클래스 내부에 속성(데이터)과 기능(메서드)을 함께 포함할 수 있다.
    int value;

    //원칙적으로 메서드는 객체를 생성해야 호출할 수 있다.
    //그런데 static이 붙으면 객체를 생성하지 않고도 메서드를 호출할 수 있음.
    void add() {
        value++;
        System.out.println("숫자 증가 value=" + value);
    }
}
