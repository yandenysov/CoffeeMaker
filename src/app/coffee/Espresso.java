package app.coffee;

public class Espresso implements Coffee {
    @Override
    public void brew() {
        System.out.println("Espresso is brewing, come take a cookie with it");
        System.out.println("Your Espresso is ready. Enjoy :)");
    }
}
