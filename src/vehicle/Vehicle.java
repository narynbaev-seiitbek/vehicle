package vehicle;

import java.time.LocalDate;

public abstract class Vehicle {
    private String model;
    private int yearOfIssue;
    private TypeOfEngine typeOfEngine;

    public Vehicle() {
    }

    public Vehicle(String model, int yearOfIssue, TypeOfEngine typeOfEngine) {
        this.model = model;
        this.yearOfIssue = checkYearOfIssue(yearOfIssue);
        this.typeOfEngine = typeOfEngine;
    }

    private int checkYearOfIssue(int yearOfIssue) {
        int currentYear = LocalDate.now().getYear();
        try {
            if (yearOfIssue > currentYear || yearOfIssue < currentYear - 100) {
                throw new InvalidYearOfIssue(this.model + " has invalid year of issue [" + yearOfIssue+"]");
            }
            return yearOfIssue;
        }catch (InvalidYearOfIssue e) {
            System.err.println(e.getMessage());
            return currentYear;
        }
    }

    abstract void drive();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public TypeOfEngine getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(TypeOfEngine typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    @Override
    public String toString() {
        return "Vehicle [" +
                "model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", typeOfEngine=" + typeOfEngine +
                ']';
    }
}
