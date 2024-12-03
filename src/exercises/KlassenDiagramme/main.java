package exercises.KlassenDiagramme;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(new Player("Alice"));
        players.add(new Player("Bob"));
        players.add(new Player("Charlie"));

        DiceGame game = new DiceGame(players);
        game.start();
    }
}
