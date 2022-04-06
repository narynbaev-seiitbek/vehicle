package vehicle;

import static vehicle.TypeOfEngine.*;

public class Main {

    public static void main(String[] args) {

        Vehicle car1 = new Car("Tesla",2020, ELECTRIC);
        Vehicle car2 = new Car("Toyota",2019, HYBRID);
        Vehicle car3 = new Car("Mercedes",2017, FUEL);
        Vehicle car4 = new Car("Honda",2022, FUEL);
        Vehicle car5 = new Car("BMW",2020, ELECTRIC);
        Vehicle car6 = new Car("Volvo",2002, FUEL);
        Vehicle car7 = new Car("Hyundai",2021, ELECTRIC);
        Vehicle car8 = new Car("Audi",2015, HYBRID);

        Vehicle truck1 = new Truck("Mack",2023,FUEL);
        Vehicle truck2 = new Truck("Volvo",2010,HYBRID);
        Vehicle truck3 = new Truck("Mann",2020,ELECTRIC);
        Vehicle truck4 = new Truck("Brabus",2018,FUEL);
        Vehicle truck5 = new Truck("Kamaz",2014,FUEL);
        Vehicle truck6 = new Truck("Mercedes",2022,ELECTRIC);
        Vehicle truck7 = new Truck("Toyota",2009,HYBRID);

        Vehicle[] vehicles = {car1,truck1,car2,truck2,car3,truck3,car4,truck4,
                              car5,truck5,car6,truck6,car7,truck7,car8};

        printElementaryOfArray(vehicles);
        System.out.println();

//        int quantityOfElectricVehicles=getQuantityOfElectricVehicles(vehicles);
//        Vehicle[] electricVehicles = new Vehicle[quantityOfElectricVehicles];
//        electricVehicles = getOnlyElectricVehicles(electricVehicles,vehicles);
//        printElementaryOfArray(electricVehicles);
//        System.out.println();

//        int quantityOfFuelVehicles=getQuantityOfFuelVehicles(vehicles);
//        Vehicle[] fuelVehicles = new Vehicle[quantityOfFuelVehicles];
//        fuelVehicles = getOnlyFuelVehicles(fuelVehicles,vehicles);
//        printElementaryOfArray(fuelVehicles);
//        System.out.println();
//
//        int quantityOfHybridVehicles = getQuantityOfHybridVehicles(vehicles);
//        Vehicle[] hybridVehicles = new Vehicle[quantityOfHybridVehicles];
//        hybridVehicles=getOnlyHybridVehicles(hybridVehicles,vehicles);
//        printElementaryOfArray(hybridVehicles);

          Vehicle[] vehicle = getOnlyTypeOfVehicles(vehicles,FUEL);
          printElementaryOfArray(vehicle);

    }

    public static int getQuantityOfVehicle(Vehicle[] vehicles) {
        int counter=0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle[]) {

            }
        }
    }


    public static Vehicle[] getOnlyTypeOfVehicles(Vehicle[] vehicles,TypeOfEngine typeOfEngine) {
        int length = getQuantityOfVehicle(vehicles,typeOfEngine);
        Vehicle[] newVehicles = new Vehicle[length];
        int counterForNewArray = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfEngine().equals(typeOfEngine)) {
                newVehicles[counterForNewArray]=vehicle;
                counterForNewArray++;
            }
        }
       return newVehicles;
    }
    public static int getQuantityOfVehicle(Vehicle[] vehicles,TypeOfEngine typeOfEngine) {
          int length = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfEngine().equals(typeOfEngine)) {
                length++;
            }
        }
        return length;
    }

     public static int getQuantityOfHybridVehicles(Vehicle[] vehicles) {
        int quantityOfHybridVehicles = 0;
         for (Vehicle vehicle : vehicles) {
             if (vehicle.getTypeOfEngine().equals(HYBRID)) {
                 quantityOfHybridVehicles++;
             }
         }
        return quantityOfHybridVehicles;
     }

     public static Vehicle[] getOnlyHybridVehicles(Vehicle[] newEmptyArray,Vehicle[] vehicles) {
        int counterForEmptyArray=  0;
         for (Vehicle vehicle : vehicles) {
             if (vehicle.getTypeOfEngine().equals(HYBRID)) {
                 newEmptyArray[counterForEmptyArray]=vehicle;
                 counterForEmptyArray++;
             }
         }
         return newEmptyArray;
     }

    public static Vehicle[] getOnlyFuelVehicles(Vehicle[] newEmptyArray, Vehicle[] vehicles) {
        int counterForNewEmptyArray = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfEngine().equals(FUEL)) {
                newEmptyArray[counterForNewEmptyArray] = vehicle;
                counterForNewEmptyArray++;
            }
        }
        return newEmptyArray;
    }
    public static int getQuantityOfFuelVehicles(Vehicle[] vehicles) {
        int quantityOfFuelVehiclesCounter = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfEngine().equals(FUEL)) {
                quantityOfFuelVehiclesCounter++;
            }
        }
        return quantityOfFuelVehiclesCounter;
    }

    public static Vehicle[] getOnlyElectricVehicles(Vehicle[] newEmptyArray,Vehicle[] vehicles) {
        int counterForNewEmptyArray = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfEngine().equals(ELECTRIC)) {
                newEmptyArray[counterForNewEmptyArray]=vehicle;
                counterForNewEmptyArray++;
            }
        }
        return newEmptyArray;
    }
    public static int getQuantityOfElectricVehicles(Vehicle[] vehicles) {
        int electricVehiclesCounter=0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfEngine().equals(ELECTRIC)) {
                electricVehiclesCounter++;
            }
        }
        return electricVehiclesCounter;
    }

    public static void printElementaryOfArray(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
