import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1 = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the second number:");
        int num2 = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("What operation do you want to perform? (+, -, *, /)");
        String operation = scanner.nextLine();

        if (operation.equals("+")) {
            System.out.println("Result: " + (num1 + num2));
        } else if (operation.equals("-")) {
            System.out.println("Result: " + (num1 - num2));
        } else if (operation.equals("*")) {
            System.out.println("Result: " + (num1 * num2));
        } else if (operation.equals("/")) {
            System.out.println("Result: " + (num1 / num2));
        } else {
            System.out.println("Invalid operation.");
        }

        scanner.close();
    }
}
