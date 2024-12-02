package exercises.Dice01;

public class DiceGame {
    public static void main(String[] args){
        Dice dice1 = new Dice(1);
        Dice dice2 = new Dice(2);
        Dice dice3 = new Dice(3);
        Dice dice4 = new Dice(4);
        Dice dice5 = new Dice(5);

        dice1.rollTheDice();
        System.out.println("Die " + dice1.getId() + " rolls: " + dice1.getValue());
        dice2.rollTheDice();
        System.out.println("Die " + dice2.getId() + " rolls: " + dice2.getValue());
        dice3.rollTheDice();
        System.out.println("Die " + dice3.getId() + " rolls: " + dice3.getValue());
        dice4.rollTheDice();
        System.out.println("Die " + dice4.getId() + " rolls: " + dice4.getValue());
        dice5.rollTheDice();
        System.out.println("Die " + dice5.getId() + " rolls: " + dice5.getValue());

    }
}
