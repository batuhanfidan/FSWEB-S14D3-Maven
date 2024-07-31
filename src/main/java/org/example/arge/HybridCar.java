package org.example.arge;

public class HybridCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;
    private int cylinders;

    public double getAvgKmPerLiter() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    public HybridCar(String name, String description, double avgKmPerCharge, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    public void startEngine() {
        System.out.println("Hybrid car's engine is starting");
    }

    @Override
    public String toString() {
        return "HybridCar{" + "carName = " +getName()+ ", type = "+ getDescription() +
                ", avgKmPerCharge=" + avgKmPerCharge +
                ", batterySize=" + batterySize +
                ", cylinders=" + cylinders +
                '}';
    }
}
