package vehicle;

public class Car extends Vehicle {
    public Car() {
    }

    public Car(String model, int yearOfIssue, TypeOfEngine typeOfEngine) {
        super(model, yearOfIssue, typeOfEngine);
    }

    @Override
    void drive() {
        System.out.println("We driving Car"+getModel());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
