package org.example.arge;

public class Main {
    @Override
    public String toString() {
        return "Main{}";
    }

    public static void main(String[] args) {
        CarSkeleton gasolin = new GasPoweredCar("mercedes", "benz", 20, 5);
        CarSkeleton electric = new ElectricCar("tesla", "electric", 30, 4);
        CarSkeleton hybrid = new HybridCar("toyota", "hybrid", 45, 2, 4 );

        gasolin.startEngine();
        System.out.println(gasolin);

        electric.startEngine();
        System.out.println(electric);

        hybrid.startEngine();
        System.out.println(hybrid);
    }
}
