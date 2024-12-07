package exercises.KlausurvorbereitungZoo;

public class Animal {
    private final String description;
    private final double sizeInM;
    private final double weightInKg;

    public Animal(String description, double sizeInM, double weightInKg) {
        this.description = description;
        this.sizeInM = sizeInM;
        this.weightInKg = weightInKg;
    }

    public String getDescription() {
        return description;
    }
    public double getSizeInM() {
        return sizeInM;
    }
    public double getWeightInKg() {
        return weightInKg;
    }
}
