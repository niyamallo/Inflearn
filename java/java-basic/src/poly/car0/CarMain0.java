package poly.car0;
//다형성을 사용하지 않은 상태
public class CarMain0 {

    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();
        driver.setK3Car(k3Car);
        driver.drive();

        //추가
        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null);
        driver.setModel3Car(model3Car);
        driver.drive();
        
        //자동차가 늘어날 때마다 Driver의 코드를 계속 고쳐야하는 문제 발생
        //역할과 구현을 구분하지 않았기 때문!
    }
}
