package exercises;

import java.util.Scanner;

public class ConsoleInput01 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter another number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Your result is: " + sum);

    }
}
