package exercises.Würfelspiel04;

import java.util.Scanner;

public class MainClass {
    private static Player player1;
    private static Player player2;
    private static Scanner scanner = new Scanner(System.in);
    private static AmountDice amountDice;
    private static FoodCategoryDice foodCategoryDice;
    private static int rounds;

    public static void main(String[] args){
        System.out.println("Player 1, please enter your name: ");
        Player player1 = new Player(scanner.next(), 100);
        System.out.println("Player 2, please enter your name: ");
        Player player2 = new Player(scanner.next(), 100);
        rounds = 1;

        while(player1.getPoints() > 0 && player2.getPoints() > 0){
            AmountDice amountDice1 = new AmountDice();
            AmountDice amountDice2 = new AmountDice();
            FoodCategoryDice foodCategoryDice1 = new FoodCategoryDice();
            FoodCategoryDice foodCategoryDice2 = new FoodCategoryDice();
            int player1roll = amountDice1.rollTheDice();
            int player2roll = amountDice2.rollTheDice();
            FoodCategory player1food = foodCategoryDice1.rollTheDice();
            FoodCategory player2food = foodCategoryDice2.rollTheDice();




            System.out.println("---Round " + rounds + "---");
            System.out.println(player1.getName() + " has " + player1.getPoints() + " points");
            System.out.println(player2.getName() + " has " + player2.getPoints() + " points");
            System.out.println(player1.getName() + " rolls for " + player1roll + " x " + player1food.getDescription() + " (" + player1roll * player1food.getPoints() + ")");
            System.out.println(player2.getName() + " rolls for " + player2roll + " x " + player2food.getDescription() + " (" + player2roll * player2food.getPoints() + ")");

            if(player2food.getPoints() > player1food.getPoints()){
                System.out.println(player1.getName() + " loses " + (player2roll * player2food.getPoints() - player1roll * player1food.getPoints()) + " points ");
                int newpoints = player1.getPoints() - (player2roll * player2food.getPoints() - player1roll * player1food.getPoints());
                player1.setPoints(newpoints);
                rounds++;
            } else if(player2food.getPoints() < player1food.getPoints()) {
                System.out.println(player2.getName() + " loses " + (player1roll * player1food.getPoints() - player2roll * player2food.getPoints()) + " points ");
                int newpoints = player2.getPoints()- (player1roll * player1food.getPoints() - player2roll * player2food.getPoints());
                player2.setPoints(newpoints);
                rounds++;
            } else {
                System.out.println("Both values are equal! Nobody loses points!");
                rounds++;
            }
        }
    }
}
