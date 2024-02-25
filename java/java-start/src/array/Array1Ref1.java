package array;

public class Array1Ref1 {
    public static void main(String[] args) {
        int[] students; //배열 변수 선언
        students = new int[5]; //배열 생성
        //자바는 배열을 생성할 때 내부 값을 자동으로 초기화한다.
        //숫자는 0, boolean은 false, String은 null(없다는 뜻)로 초기화.

        System.out.println(students); //[I@b4c966a [I는 Int형 배열이라는 뜻, @ 뒤는 참조값(메모리 주소)

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        //변수 값 사용
        System.out.println("학생1 점수: " + students[0]);
        System.out.println("학생2 점수: " + students[1]);
        System.out.println("학생3 점수: " + students[2]);
        System.out.println("학생4 점수: " + students[3]);
        System.out.println("학생5 점수: " + students[4]);
    }
}
