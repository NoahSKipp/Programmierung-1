package exercises.Vehicle01;

public class Vehicle01 {
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle();

        vehicle.setMake("Porsche");
        vehicle.setModel("911");

        vehicle.accelerate(50);
        vehicle.brake(20);
        vehicle.accelerate(80);
        vehicle.brake(30);
    }
}
