package exercises;

import java.util.Scanner;

public class Verzweigung01 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein: ");
        int zahl = myScanner.nextInt();
        if (zahl % 2 == 0){
            System.out.println(zahl + " ist eine gerade Zahl!");
        } else {
            System.out.println(zahl + " ist eine ungerade Zahl!");
        }
    }
}
