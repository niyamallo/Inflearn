package array;

public class ArrayDi3 {

    public static void main(String[] args) {
        //2x3 2차원 배열을 만든다.
        int[][] arr = {
            {1,2,3},
            {4,5,6}
        }; //이렇게 라인을 적절하게 넘겨주면 행과 열이 명확해져서
        //코드를 더 쉽게 이해할 수 있다.
        
        //종료 부분을 length로 처리
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println(); //한 행이 끝나면 라인을 변경한다.
        }
    }
}
