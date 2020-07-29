import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        long f = sc.nextLong();
        String op = sc.next();
        long s = sc.nextLong();
        switch(op) {
            case "+":
                System.out.println(f + s);
                break;
            case "-":
                System.out.println(f - s);
                break;
            case "*":
                System.out.println(f * s);
                break;
            case "/":
                if (s == 0L) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(f / s);
                }
                break;
            default:
                System.out.println("Unknown operator");
        }
        
    }
}
