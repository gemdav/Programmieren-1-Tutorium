package solutions.lesson_05_inheritance.showcases.vehicle;

public class Car extends Vehicle {

    // Attributes of the Car
    private String licensePlate;
    private String brand;

    public Car(double x, double y, String color, String licensePlate, String brand) {
        super(x, y, color);
        this.licensePlate = licensePlate;
        this.brand = brand;
    }

    // Getters and Setters
    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
