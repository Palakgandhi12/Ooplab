abstract class Vehicle {

 
    abstract String fuelType();
    abstract int noOfWheels();
}

class Car extends Vehicle {

    public String fuelType() {
        return "Petrol/Diesel";
    }

    public int noOfWheels() {
        return 4;
    }
}


class Bike extends Vehicle {

    public String fuelType() {
        return "Petrol";
    }

    public int noOfWheels() {
        return 2;
    }
}


public class Practical30{
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bike = new Bike();

        System.out.println("Car Details:");
        System.out.println("Fuel Type: " + car.fuelType());
        System.out.println("Number of Wheels: " + car.noOfWheels());

        System.out.println("\nBike Details:");
        System.out.println("Fuel Type: " + bike.fuelType());
        System.out.println("Number of Wheels: " + bike.noOfWheels());
    }
}