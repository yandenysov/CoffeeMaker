package app.coffee;

public class Latte implements Coffee{
    @Override
    public void brew() {
        System.out.println("Milky wonder is inbound, brace yourself for impact!");
        System.out.println("Your Latte is ready. Enjoy :)");
    }
}
