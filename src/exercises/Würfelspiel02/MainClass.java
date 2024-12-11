package exercises.Würfelspiel02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Dice> dice = new ArrayList<Dice>();
    private static int points = 0;
    private static int rounds = 1;

    public static void main(String[] args){
        for(int i = 1; i<=5; i++){
            dice.add(new Dice());
        }
        while(true){
            int totalCorners = 0;
            for(Dice die : dice){
                ShapeSymbol rolledShape = die.rollTheDice();
                totalCorners += rolledShape.getCorners();
            }
            System.out.println("Do you think the total numbers of corners is larger than 12?");
            String answer = scanner.nextLine();

            boolean isGreaterThan12 = totalCorners > 12;
            if((answer.equalsIgnoreCase("Yes") && isGreaterThan12) ||
                    (answer.equalsIgnoreCase("No") && !isGreaterThan12)){
                System.out.println("Correct! You gain a point.");
                points++;} else { System.out.println("Wrong!"); }

            System.out.println("Points: " + points);

            System.out.println("Would you like to keep playing?");
            String response = scanner.nextLine();
            if(response.equalsIgnoreCase("No")){
                break;
            }
        }


    }
}
