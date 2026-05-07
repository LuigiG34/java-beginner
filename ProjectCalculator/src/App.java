import java.util.Arrays;
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



        // Arrays
        char vowels[] = {'i', 'o', 'a', 'e', 'u'};

        Arrays.sort(vowels);

        char key = 'o';

        // int startIndex = 1;
        // int endIndex = 4;
        // int foundItemIndex = Arrays.binarySearch(vowels, startIndex, endIndex, key);

        int foundItemIndex = Arrays.binarySearch(vowels, key); // Only works on sorted arrays
        // If the item is not found, the method returns a negative value indicating the insertion point

        System.out.println(Arrays.toString(vowels));
        System.out.println("The index of " + key + " is: " + foundItemIndex);


        Arrays.fill(vowels, 'x'); // Fills the entire array with the specified value
        System.out.println(Arrays.toString(vowels));


        int numbers[] = {1, 2, 3, 4, 5};
        int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length); // Creates a copy of the array

        // if we do copyOfNumbers = numbers; // This will not create a copy, but rather a reference to the same array, so changes to one will affect the other
        // copyOfRange can be used to copy a specific range of the array

        System.out.println("Original array: " + Arrays.toString(numbers));
        System.out.println("Copy of the array: " + Arrays.toString(copyOfNumbers));

        System.out.println("Are the two arrays equal? " + Arrays.equals(numbers, copyOfNumbers)); // Checks if the two arrays are equal, == won't work because it checks for reference equality, not content equality
    }
}
