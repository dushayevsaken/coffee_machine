import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        if (!isWeekend) System.out.println(n >= 10 && n <= 20);
        else System.out.println(n >= 15 && n <= 25);
    }
}