package exercises.KlassenDiagramme;

import exercises.Dice01.Dice;

import java.util.ArrayList;

public class DiceCup {
    public void rollTheDices(ArrayList<Dice> dices) {
        for (Dice dice : dices) {
            dice.rollTheDice();
            System.out.println("Würfel " + dice.getId() + ": " + dice.getValue());
        }
    }
    public void rollTheDices(Dice[] dices) {
        for (Dice dice : dices) {
            dice.rollTheDice();
            System.out.println("Würfel " + dice.getId() + ": " + dice.getValue());
        }
    }
}
