package static2.ex;
/*
다음 기능을 제공하는 배열용 수학 유틸리티 클래스를 만드세요.
sum(int[] array): 배열의 모든 요소를 더하여 합계를 반환합니다.
average(int[] array): 배열의 모든 요소의 평균값을 계산합니다.
min(int[] array): 배열에서 최소값을 찾습니다.
max(int[] array): 배열에서 최대값을 찾습니다.

요구사항: MathArrayUtils의 인스턴스를 생성하지 못하게 막으세요.
 */

public class MathArrayUtils {

    private MathArrayUtils(){
        //private로 인스턴스의 생성을 막는다.
    };

    public static int sum(int[] array) {
        int total = 0;
        for (int i : array) {
            total += i;
        }
        return total;
    }

    public static double average(int[] array) {
        return (double) sum(array) / array.length;
    }

    public static int min(int[] array) {
        int minValue = array[0];
        for (int i : array) {
            if (minValue > i) {
                minValue = i;
            }
        }
        return minValue;
    }

    public static int max(int[] array) {
        int maxValue = array[0];
        for (int i : array) {
            if (maxValue < i) {
                maxValue = i;
            }
        }
        return maxValue;
    }
}
