package pl.mkluzniak;

public class Main {

    public static void main(String[] args) {
        // abstract = abstract classes cannot be instantied, but they can have a subclass
        //            abstract method are declared without an implementation

        //Vehicle vehicle = new Vehicle(); //cannot declare object when class is abstract
        Car car = new Car();
        car.go(); //call method go from another class
    }
}
