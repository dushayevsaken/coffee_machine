import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n != 1) {
            System.out.print(n + " ");
            if (n % 2 == 0) n /= 2;
            else n = 3 * n + 1;
        }
        System.out.print(n + " ");

    }
}