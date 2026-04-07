class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

    Vehicle(String vehicleNumber, String brand, String fuelType) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.fuelType = fuelType;
    }

   
    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}


class Car extends Vehicle {
    protected int numberOfSeats;
    protected boolean ACavailable;

  
    Car(String vehicleNumber, String brand, String fuelType, int numberOfSeats, boolean ACavailable) {
        super(vehicleNumber, brand, fuelType); 
        this.numberOfSeats = numberOfSeats;
        this.ACavailable = ACavailable;
    }

   
    @Override
    void displayDetails() {
        super.displayDetails(); 
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("AC Available: " + ACavailable);
    }
}


class ElectricCar extends Car {
    private int batteryCapacity;
    private double chargingTime;


    ElectricCar(String vehicleNumber, String brand, String fuelType,
                int numberOfSeats, boolean ACavailable,
                int batteryCapacity, double chargingTime) {
        super(vehicleNumber, brand, fuelType, numberOfSeats, ACavailable);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

   
    @Override
    void displayDetails() {
        super.displayDetails(); 
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
    }
}


public class Practical25{
    public static void main(String[] args) {

      
        Vehicle v1 = new Vehicle("GJ01AB1234", "Toyota", "Petrol");
        System.out.println("\n--- Vehicle Details ---");
        v1.displayDetails();

     
        Car c1 = new Car("GJ02CD5678", "Honda", "Diesel", 5, true);
        System.out.println("\n--- Car Details ---");
        c1.displayDetails();

   
        ElectricCar e1 = new ElectricCar("GJ03EF9012", "Tesla", "Electric", 5, true, 75, 1.5);
        System.out.println("\n--- Electric Car Details ---");
        e1.displayDetails();

        Vehicle v2 = new Car("GJ04GH3456", "Hyundai", "Petrol", 4, false);
        System.out.println("\n--- Upcasting Example ---");
        v2.displayDetails();

        

        if (v2 instanceof Car) {
            Car c2 = (Car) v2; 
            System.out.println("\nDowncasting Successful!");
            System.out.println("Seats: " + c2.numberOfSeats);
        }

        Vehicle v3 = new ElectricCar("GJ05IJ7890", "Tata", "Electric", 5, true, 50, 2.0);

        if (v3 instanceof ElectricCar) {
            ElectricCar ec = (ElectricCar) v3;
            System.out.println("\nThis is an Electric Car object.");
            ec.displayDetails();
        }
    }
}