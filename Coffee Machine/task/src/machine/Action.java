package machine;

public class Action {
    static void action(String action) {
        switch (action) {
            case "fill":
                Filler.fill();
                break;
            case "take":
                Taker.take();
                break;
            case "buy":
                Buyer.buy();
                break;
            case "remaining":
                Printer.printState();
                break;
        }
    }
}
