package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLiter, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    public void startEngine() {
        System.out.println("Gasolin car's engine is starting");
    }

    @Override
    public String toString() {
        return "GasPoweredCar{" + "carName = " +getName()+ ", type = "+ getDescription() +
                ", avgKmPerLiter = " + avgKmPerLiter +
                ", batterySize = " + cylinders +
                '}';
    }
}
