package machine;

import java.util.Scanner;

enum State {
    MAIN, FILL_WATER, FILL_MILK, FILL_BEANS, FILL_CUPS, BUY
}

public class CoffeeMachine {
    static int money = 550;
    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;

    static State state = State.MAIN;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String command = scanner.next();

        while (!command.equals("exit")) {
            switch (state) {
                case MAIN:
                    Action.action(command);
                    break;
                case BUY:
                    Buyer.buy(command);
                    break;
                case FILL_WATER:
                    Filler.fillWater(Integer.parseInt(command));
                    break;
                case FILL_MILK:
                    Filler.fillMilk(Integer.parseInt(command));
                    break;
                case FILL_BEANS:
                    Filler.fillBeans(Integer.parseInt(command));
                    break;
                case FILL_CUPS:
                    Filler.fillCups(Integer.parseInt(command));
                    break;
            }
            command = scanner.next();
        }
    }
}
