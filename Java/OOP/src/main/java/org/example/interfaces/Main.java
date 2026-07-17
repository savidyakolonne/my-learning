package org.example.interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();

//        Engine car = new Car();

//        car.a;
        // cant access this with Engine car = new Car();.
        // because its nor work with the engine its in the Car class

//        car.acc();
//        car.start();
//        car.stop();

//        Media carMedia = new Car();
//        carMedia.stop();

        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
