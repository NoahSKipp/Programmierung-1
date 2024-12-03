package exercises.Dice01;

import java.util.Random;

public class Dice {
    private final int id;
    private int value;

    public Dice(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public int getValue(){
        return value;
    }
    public void rollTheDice(){
        Random random = new Random();
        value = random.nextInt(1, 7);
    }
}
