package machine;

public class Printer {
    static void printState() {
        System.out.println("The coffee machine has:");
        System.out.println(CoffeeMachine.water + " of water");
        System.out.println(CoffeeMachine.milk + " of milk");
        System.out.println(CoffeeMachine.beans + " of coffee beans");
        System.out.println(CoffeeMachine.cups + " of disposable cups");
        System.out.println("$" + CoffeeMachine.money + " of money");

        System.out.println();
        System.out.println("Write action (buy, fill, take, remaining, exit):");
    }
}
