package machine;

public class Filler {
    static void fill() {
        System.out.println("Write how many ml of water do you want to add:");
        CoffeeMachine.state = State.FILL_WATER;
    }

    static void fillWater(int waterFill) {
        CoffeeMachine.water += waterFill;
        System.out.println("Write how many ml of milk do you want to add:");
        CoffeeMachine.state = State.FILL_MILK;
    }

    static void fillMilk(int milkFill) {
        CoffeeMachine.milk += milkFill;
        System.out.println("Write how many grams of coffee beans do you want to add:");
        CoffeeMachine.state = State.FILL_BEANS;
    }

    static void fillBeans(int beanFill) {
        CoffeeMachine.beans += beanFill;
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        CoffeeMachine.state = State.FILL_CUPS;
    }

    static void fillCups(int cupsFill) {
        CoffeeMachine.cups += cupsFill;
        CoffeeMachine.state = State.MAIN;
        System.out.println();
        System.out.println("Write action (buy, fill, take, remaining, exit):");
    }
}
