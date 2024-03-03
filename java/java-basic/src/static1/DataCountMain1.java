package static1;

public class DataCountMain1 {

    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A count=" + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("B count=" + data2.count);

        Data1 data3 = new Data1("C");
        System.out.println("C count=" + data2.count);
    }

    /*
    A count=1
    B count=1
    C count=1
    //이렇게 하면 객체를 생성할 때마다 count를 늘리고 싶은데 변수가 공유되지 않는다.
     */
}
