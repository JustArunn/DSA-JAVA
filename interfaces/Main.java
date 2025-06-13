package interfaces;

public class Main {

    public static void main(String[] args) {
    //    Car car = new Car();
    //    car.start();
    //    car.stop();
        NiceCar car = new NiceCar();

        car.startEngine();
        car.startMusic();
        car.stopMusic();
        car.stopEngine();
        car.upgradeEngine();
        car.startEngine();
    }
}
