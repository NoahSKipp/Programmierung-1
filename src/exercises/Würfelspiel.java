package exercises;

public class Würfelspiel {
    public static void main(String[] args) {
        Player player1 = new Player("Hans");
        Player player2 = new Player("Lisa");

        Würfel würfel = new Würfel();

        int wurfPlayer1 = würfel.werfen();
        int wurfPlayer2 = würfel.werfen();

        System.out.println(player1.getName() + " würfelt: " + wurfPlayer1);
        System.out.println(player2.getName() + " würfelt: " + wurfPlayer2);

        if (wurfPlayer1 > wurfPlayer2) {
            System.out.println(player1.getName() +  " hat gewonnen!");
            player1.setScore(+1);
        } else if (wurfPlayer2 > wurfPlayer1) {
                System.out.println(player2.getName() + " hat gewonnen!");
                player2.setScore(+1);
        } else {
            System.out.println("Unentschieden!");
        }
    }
}
