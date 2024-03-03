package static1;

public class DataCountMain2 {

    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count=" + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count=" + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count=" + counter.count);
    }
    /*
    A count=1
    B count=2
    C count=3
    //이렇게 하면 원하는 결과는 얻을 수 있지만 생성자 구조가 복잡해진다.
    외부의 도움을 받지 않고 Data2 내부에서 관리할 수 있는 공용 변수를 만들 수 없을까?
     */
}
