package exercises;

import java.util.Random;

public class Würfel {
    private Random würfel;

    public Würfel() {
        würfel = new Random();
    }

    public int werfen() {
        return würfel.nextInt(1, 7); // Rolls a number between 1 and 6
    }
}
