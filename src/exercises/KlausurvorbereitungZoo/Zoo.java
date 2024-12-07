package exercises.KlausurvorbereitungZoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private final String name;
    private final List<Animal> animals;

    public Zoo(String name, List<Animal> animals) {
        this.name = name;
        this.animals = animals != null ? new ArrayList<>(animals) : new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        if (animal != null) {
            animals.add(animal);
        }
    }

    public Animal getBiggestAnimal() {
        if (animals.isEmpty()) {
            return null;
        }
        Animal biggest = animals.get(0);
        for (Animal animal : animals) {
            if (animal.getSizeInM() > biggest.getSizeInM()) {
                biggest = animal;
            }
        }
        return biggest;
    }

    public List<Fish> getFishesByColor(String color) {
        List<Fish> fishesByColor = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Fish) {
                Fish fish = (Fish) animal;
                if (fish.getDescription() != null && fish.getDescription().contains(color)) {
                    fishesByColor.add(fish);
                }
            }
        }
        return fishesByColor;
    }
}
