package pl.mkluzniak;

public class Car extends Vehicle { //child class, sub class of vehicle class
    @Override
    void go() { //implementation for abstract go method

        System.out.println("The driver is driving the car");
    }
}
