package app.coffee;

public class Cappuccino implements Coffee {
    @Override
    public void brew() {
        System.out.println("Fuel for thoughts is on the way");
        System.out.println("Your Cappuccino is ready. Enjoy:)");
    }
}
