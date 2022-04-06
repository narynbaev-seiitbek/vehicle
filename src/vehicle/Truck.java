package vehicle;

public class Truck extends Vehicle {

    public Truck() {
    }

    public Truck(String model, int yearOfIssue, TypeOfEngine typeOfEngine) {
        super(model, yearOfIssue, typeOfEngine);
    }

    @Override
    void drive() {
        System.out.println("We driving Truck"+getModel());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
