package machine;

public class Taker {
    static void take() {
        System.out.println("I gave you $" + CoffeeMachine.money);
        CoffeeMachine.money = 0;
        System.out.println();
        System.out.println("Write action (buy, fill, take, remaining, exit):");
    }
}
