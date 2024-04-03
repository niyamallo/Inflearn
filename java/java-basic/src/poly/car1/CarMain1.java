package poly.car1;

public class CarMain1 {

    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량 선택(k3)
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        //차량 변경(k3 -> model3)
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();

        //OCP(Open-Closed Principle)
        //기능을 확장해도 main() 일부를 제외한 프로그램의 핵심 부분의 코드는 전혀 수정하지 않음.
        //확장에는 열려있고(Open)
        //클라이언트(Driver)의 코드는 수정하지 않도록(Closed)
        //차량 변경(model3 -> newCar)
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
