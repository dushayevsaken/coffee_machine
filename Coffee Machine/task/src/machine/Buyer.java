package machine;

public class Buyer {
    static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        CoffeeMachine.state = State.BUY;
    }

    static void buy(String coffee) {
        int espressoWater = 250;
        int espressoBeans = 16;
        int espressoPrice = 4;

        int latteWater = 350;
        int latteMilk = 75;
        int latteBeans = 20;
        int lattePrice = 7;

        int cappuccinoWater = 200;
        int cappuccinoMilk = 100;
        int cappuccinoBeans = 12;
        int cappuccinoPrice = 6;

        switch (coffee) {
            case "1":
                buy(espressoWater, 0, espressoBeans, espressoPrice);
                break;
            case "2":
                buy(latteWater, latteMilk, latteBeans, lattePrice);
                break;
            case "3":
                buy(cappuccinoWater, cappuccinoMilk, cappuccinoBeans, cappuccinoPrice);
                break;
            case "back":
                break;
        }
        CoffeeMachine.state = State.MAIN;
        System.out.println("Write action (buy, fill, take, remaining, exit):");
    }

    static void buy(int neededWater, int neededMilk, int neededBeans, int price) {
        if (CoffeeMachine.water < neededWater) {
            System.out.println("Sorry, not enough water!");
            return;
        }
        if (CoffeeMachine.milk < neededMilk) {
            System.out.println("Sorry, not enough milk!");
            return;
        }
        if (CoffeeMachine.beans < neededBeans) {
            System.out.println("Sorry, not enough coffee beans!");
            return;
        }
        if (CoffeeMachine.cups < 1) {
            System.out.println("Sorry, not enough disposable cups!");
            return;
        }

        System.out.println("I have enough resources, making you a coffee!");
        CoffeeMachine.water -= neededWater;
        CoffeeMachine.milk -= neededMilk;
        CoffeeMachine.beans -= neededBeans;
        CoffeeMachine.cups--;
        CoffeeMachine.money += price;
    }
}
