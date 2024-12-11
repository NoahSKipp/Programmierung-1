package exercises.Würfelspiel04;

import java.util.Random;

public class AmountDice {
    public int rollTheDice(){
        Random randomm = new Random();
       return randomm.nextInt(1,7);
    }
}
