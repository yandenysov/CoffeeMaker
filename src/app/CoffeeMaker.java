package app;

import app.brewer.CoffeeMachine;
import app.coffee.Cappuccino;
import app.coffee.Espresso;
import app.coffee.Latte;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CoffeeMaker {
    static CoffeeMachine coffeeMachine = new CoffeeMachine();
    public static void main(String[] args) {processRequest(getOption());}

    private static int getOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Choose a drink:
                1 - Espresso
                2 - Cappuccino
                3 - Latte
                """);

        int option = 0;
        try {
            option = scanner.nextInt();
            while (option < 1 || option > 3) {
                System.out.println("Invalid input. Please try typing '1'/'2'/'3' for your chosen option again");
                option = scanner.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: try entering a single digit for your chosen option");
        }
        return option;
    }

    private static void processRequest(int option) {
        switch (option) {
            case 1 -> makeEspresso();
            case 2 -> makeCappuccino();
            case 3 -> makeLatte();
            default -> System.out.println("Error when processing your request. Please restart and try again");
        }
    }

    private static void makeEspresso() {
        coffeeMachine.setCoffeeType(new Espresso());
        coffeeMachine.brew();
    }
    private static void makeCappuccino() {
        coffeeMachine.setCoffeeType(new Cappuccino());
        coffeeMachine.brew();
    }
    private static void makeLatte() {
        coffeeMachine.setCoffeeType(new Latte());
        coffeeMachine.brew();
    }
}
