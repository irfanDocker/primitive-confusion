package solutions.techcircle.Polymorphism2;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int CLD, String carName) {
        this.cylinders = CLD;
        this.name = carName;
        this.wheels = 4;
        this.engine = true;
    
    }
    
    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }
    
    
}