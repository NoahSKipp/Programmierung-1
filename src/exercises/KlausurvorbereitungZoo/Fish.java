package exercises.KlausurvorbereitungZoo;

public class Fish extends Animal{
    public Fish(String description, double sizeInM, double weightInKg) {
        super(description, sizeInM, weightInKg);
    }

    public void swim() {
        System.out.println("schwimm, schwimm");
    }
}

