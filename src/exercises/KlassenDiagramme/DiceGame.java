package exercises.KlassenDiagramme;

import exercises.Dice01.Dice;

import java.util.ArrayList;
import java.util.Scanner;

public class DiceGame {
    private final DiceCup diceCup;
    private final ArrayList<Dice> dices;
    private final ArrayList<Player> players;
    private final Scanner scanner;
    private int numberOfActivePlayers;

    public DiceGame(ArrayList<Player> players) {
        this.diceCup = new DiceCup();
        this.dices = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            this.dices.add(new Dice(i));
        }
        this.players = players;
        this.scanner = new Scanner(System.in);
        this.numberOfActivePlayers = players.size();
    }

    public void start() {
        System.out.println("Das Spiel beginnt! Drücke bitte Enter, um deinen Zug zu beginnen.");
        scanner.nextLine();
        while (numberOfActivePlayers > 0) {
            for (Player player : players) {
                if (player.isActive()) {
                    move(player);
                }
            }
        }
        System.out.println("Das Spiel ist vorbei!");
        announceWinner();
    }

    public void move(Player player) {
        System.out.println(player.getName() + " ist am Zug. Bitte drücke Enter, um zu würfeln.");
        scanner.nextLine();
        diceCup.rollTheDices(dices);

        int totalScore = 0;
        for (Dice dice : dices) {
            totalScore += dice.getValue();
        }
        System.out.println(player.getName() + " hat " + totalScore + " Punkte geworfen.");
        player.setScore(player.getScore() + totalScore);

        System.out.println("Möchtest du weiterspielen? (ja/nein)");
        String decision = scanner.nextLine().trim().toLowerCase();
        if (decision.equals("nein")) {
            player.setActive(false);
            numberOfActivePlayers--;
        }
    }

    private void announceWinner() {
        Player winner = null;
        int highestScore = 0;
        for (Player player : players) {
            System.out.println(player.getName() + " hat insgesamt " + player.getScore() + " Punkte.");
            if (player.getScore() > highestScore && highestScore <= 50) {
                highestScore = player.getScore();
                winner = player;
            }
        }

        if (winner != null) {
            System.out.println("Der Gewinner ist " + winner.getName() + " mit " + highestScore + " Punkten!");
        } else {
            System.out.println("Es gibt keinen Gewinner.");
        }
    }
}