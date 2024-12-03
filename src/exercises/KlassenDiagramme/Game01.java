package exercises.KlassenDiagramme;

import exercises.Dice01.Dice;

import java.util.Random;

public class Game01 {
    public static void main(String[] args){
        Player player1 = new Player("Hans");
        Player player2 = new Player("Martin");

        Dice dice = new Dice(1);
        Dice dice2 = new Dice(2);
        dice.rollTheDice();
        System.out.println("Hans wirft eine: " + dice.getValue());
        dice2.rollTheDice();
        System.out.println("Martin wirft eine: " + dice2.getValue());

        if(dice.getValue() > dice2.getValue()){
            System.out.println("Hans gewinnt!");
        } else if (dice.getValue() < dice2.getValue()){
            System.out.println("Martin gewinnt!");
        } else { System.out.println("Unentschieden, niemand gewinnt!");
        }


    }
}
