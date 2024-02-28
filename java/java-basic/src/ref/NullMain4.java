package ref;

public class NullMain4 {
    //클래스 NullMain3의 NullPointerException 해결
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("bigData.count=" + bigData.count);
        System.out.println("bigData.data=" + bigData.data);

        System.out.println("bigData.data.value=" + bigData.data.value);
    }
}
