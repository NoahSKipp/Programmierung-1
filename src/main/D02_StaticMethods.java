package main;

import util.Calculator;
import util.Printer;

public class D02_StaticMethods {

  public static void main(String[] args) {

    Printer.printHelloWorld();
    Printer.printHelloWorld();
    Printer.printHelloWorld();
    Printer.printText("Winter");
    Printer.printText("is");
    Printer.printText("Coming");

    int result = Calculator.add(4, 2);
    System.out.println(result);

  }

}
