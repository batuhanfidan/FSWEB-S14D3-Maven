package org.example.arge;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;



    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    public void startEngine() {
        System.out.println("Electric car's engine is starting");
    }

    @Override
    public String toString() {
        return "ElectricCar{" + "carName = " +getName()+ ", type = "+ getDescription() +
                ", avgKmPerCharge=" + avgKmPerCharge +
                ", batterySize=" + batterySize +
                '}';
    }
}
