package array;

public class Array1Ref4 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50}; //배열 선언, 생성과 초기화를 이렇게 작성할 수도 있다.
        // 이때 new int[]라는 것은 자바가 추론함.

        //단, 이렇게 하고싶을 때
        //int[] students;
        //students = {90, 80, 70, 60, 50};
        //이렇게 하는 것은 students가 int형 배열인지 몰라서 불가능.

        //변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
