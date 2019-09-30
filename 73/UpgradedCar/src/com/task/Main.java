package com.task;

public class Main {

    public static void main(String[] args) {
        // автомобиль движется вперед 20 часов со скоростью 5 км/ч
        Car car = new Car(5, Direction.FORWARD);
        car.move(20);
        System.out.println(car.getDistance()); // 100

        // автомобиль движется назад 3 часа со скоростью 10,5 км/ч
        car.setDirection(Direction.BACKWARD);
        car.setSpeed(10.5);
        car.move(3);
        System.out.println(car.getDistance()); // 68.5
    }
}