package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter (int max) {
        this.max = max;
    }

    public void increment() {
        //검증 로직
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return; //else를 사용하지 않고 return을 사용해 검증 로직과 실행 로직을 명확히 분리할 수 있다.
        }

        //실행 로직
        count++;
    }

    public int getCount() {
        return count;
    }
}