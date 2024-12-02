package exercises.Vehicle01;

public class Vehicle {
    private final String make;
    private final String model;
    private double speedInKmh;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
        this.speedInKmh = 0.0;
    }

    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public double getSpeedInKmh(){
        return speedInKmh;
    }
    public void accelerate(int valueInKmh){
        speedInKmh += valueInKmh;
        System.out.println(make +" "+ model+ " " + "accelerated to " + speedInKmh + " kmh");
    }
    public void brake(int valueInKmh){
        speedInKmh -= valueInKmh;
        System.out.println(make +" "+ model+ " " + "braked to " + speedInKmh + " kmh");
    }
    public String toString(){
        return make + " " + model;
    }
}
