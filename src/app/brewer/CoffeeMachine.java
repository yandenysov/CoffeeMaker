package app.brewer;

import app.coffee.Coffee;

public class CoffeeMachine {
    private Coffee coffee;

    public void setCoffeeType(Coffee coffee) {this.coffee = coffee;}

    public void brew() {coffee.brew();}
}
