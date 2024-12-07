package exercises.KlausurvorbereitungZoo;

import java.util.ArrayList;
import java.util.List;

public class ZooTest {
    public static void main(String[] args) {
        Animal bird = new Bird("Red Bird", 0.3, 1.5);
        Animal fish1 = new Fish("Blue Fish", 0.5, 2.0);
        Animal fish2 = new Fish("Green Fish", 0.4, 1.8);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(bird);
        animalList.add(fish1);
        animalList.add(fish2);

        Zoo zoo = new Zoo("My Zoo", animalList);

        zoo.addAnimal(new Fish("Yellow Fish", 0.6, 2.5));

        Animal biggest = zoo.getBiggestAnimal();
        System.out.println("Biggest Animal: " + biggest.getDescription());

        List<Fish> greenFishes = zoo.getFishesByColor("Green");
        System.out.println("Fishes with 'Green' in description: " + greenFishes.size());
    }
}
