package exercises.Vehicle01;

public class Vehicle {
    public String make;
    public String model;
    public double speedInKmh;

    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
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
