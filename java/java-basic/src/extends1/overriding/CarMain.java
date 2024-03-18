package extends1.overriding;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();

        GasCar gasCar = new GasCar();
        gasCar.move();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
    }
    /*
    전기차를 빠르게 이동합니다.
    차를 이동합니다.
    차를 이동합니다.
     */
}
