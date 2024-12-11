package exercises.Würfelspiel02;

import java.util.Random;

public class Dice {
    public ShapeSymbol rollTheDice(){
        Random random = new Random();
        int roll = random.nextInt(3);
        if(roll == 0) {
            roll = 4; // SQUARE
        }else if(roll == 1) {
            roll = 3; // TRIANGLE
        } else if (roll == 2) {
            roll = 0; // CIRCLE
        }

        for(ShapeSymbol shape : ShapeSymbol.values()){
            if (shape.getCorners() == roll){
                return shape;
            }
        }
        throw new IllegalStateException("No matching shape found for roll: " + roll);
    }
}
