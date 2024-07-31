package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public CarSkeleton() {
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void startEngine(){
        System.out.println("the car's engine is starting");
    };
    protected void runEngine(){};
    public void drive() {
        runEngine();
    }

}
