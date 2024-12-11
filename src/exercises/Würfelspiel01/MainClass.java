package exercises.Würfelspiel01;

import java.util.Scanner;

public class MainClass {
    private static Player player1;
    private static Player player2;
    private static Scanner scanner = new Scanner(System.in);
    private static WeaponDice weaponDice = new WeaponDice();

    public static void main(String[] args){
        System.out.println("Player 1, please enter your name!");
        Player player1 = new Player(scanner.next(), 10);

        System.out.println("Player 2, please enter your name!");
        Player player2 = new Player(scanner.next(), 10);

        while(player1.getPoints() > 0 && player2.getPoints() > 0){

        System.out.println("Points " + player1.getName() + " : " + player1.getPoints());
        System.out.println("Points " + player2.getName() + " : " + player2.getPoints());

        weaponDice.rollTheDice();
        String weaponForPlayer1 = weaponDice.getRolledWeapon();
        int weaponPowerPlayer1 = weaponDice.getRolledWeaponPower();
        System.out.println("Weapon for " + player1.getName() + " : " + weaponForPlayer1);

        weaponDice.rollTheDice();
        String weaponForPlayer2 = weaponDice.getRolledWeapon();
        int weaponPowerPlayer2 = weaponDice.getRolledWeaponPower();
        System.out.println("Weapon for " + player2.getName() + " : " + weaponForPlayer2);

        System.out.println("- - - - - - - - -");
        System.out.println("Battle Phase");
        System.out.println("- - - - - - - - -");

        if(weaponPowerPlayer1 > weaponPowerPlayer2){
            System.out.println(player2.getName() + " attacks " + player1.getName() + " with their " + weaponForPlayer2 + "!" + " It's not very effective.");
            System.out.println(player1.getName() + " attacks " + player2.getName() + " with their " + weaponForPlayer1 + "!" + " It's very effective and deals " + (weaponPowerPlayer1 - weaponPowerPlayer2) + " damage points!");
        player2.reducePoints(weaponPowerPlayer1 - weaponPowerPlayer2);}

        else if (weaponPowerPlayer2 > weaponPowerPlayer1) {
            System.out.println(player1.getName() + " attacks " + player2.getName() + " with their " + weaponForPlayer1 + "!" + " It's not very effective.");
            System.out.println(player2.getName() + " attacks " + player1.getName() + " with their " + weaponForPlayer2 + "!" + " It's very effective and deals " + (weaponPowerPlayer2 - weaponPowerPlayer1) + " damage points!");
        player1.reducePoints(weaponPowerPlayer2 - weaponPowerPlayer1);}


        else if (weaponPowerPlayer2 == weaponPowerPlayer1) {
            System.out.println("Both players charge at each other, roaring into glorious battle, only to both slip and lose their weapons. Should've worn better footwear!");}


        }
        if(player1.getPoints() <= 0){
        System.out.println("Congratulations, " + player2.getName() + "! " + " You've won!");}
        else if(player2.getPoints() <= 0){
            System.out.println("Congratulations, " + player1.getName() + "! " + " You've won!");}
        else{
            System.out.println("Congratulations! You've both failed miserably.");

        }


    }
    }
