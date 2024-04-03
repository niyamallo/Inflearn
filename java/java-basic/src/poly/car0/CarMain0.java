package poly.car0;
//다형성을 사용하지 않은 상태
public class CarMain0 {

    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();

        driver.setK3Car(k3Car);
        driver.drive();
    }
}
