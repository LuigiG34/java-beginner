import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // // Scanner is used to read user input from the console. It provides various methods to read different types of data, such as nextInt() for integers, nextLine() for strings, etc.
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the first number:");
        // int num1 = scanner.nextInt();
        // scanner.nextLine(); // Consume the newline character

        // System.out.print("Enter the second number:");
        // int num2 = scanner.nextInt();
        // scanner.nextLine(); // Consume the newline character

        // System.out.print("What operation do you want to perform? (+, -, *, /)");
        // String operation = scanner.nextLine();

        // if (operation.equals("+")) {
        //     System.out.println("Result: " + (num1 + num2));
        // } else if (operation.equals("-")) {
        //     System.out.println("Result: " + (num1 - num2));
        // } else if (operation.equals("*")) {
        //     System.out.println("Result: " + (num1 * num2));
        // } else if (operation.equals("/")) {
        //     System.out.println("Result: " + (num1 / num2));
        // } else {
        //     System.out.println("Invalid operation.");
        // }

        // scanner.close();



        // // Arrays
        // char vowels[] = {'i', 'o', 'a', 'e', 'u'};

        // Arrays.sort(vowels);

        // char key = 'o';

        // // int startIndex = 1;
        // // int endIndex = 4;
        // // int foundItemIndex = Arrays.binarySearch(vowels, startIndex, endIndex, key);

        // int foundItemIndex = Arrays.binarySearch(vowels, key); // Only works on sorted arrays
        // // If the item is not found, the method returns a negative value indicating the insertion point

        // System.out.println(Arrays.toString(vowels));
        // System.out.println("The index of " + key + " is: " + foundItemIndex);


        // Arrays.fill(vowels, 'x'); // Fills the entire array with the specified value
        // System.out.println(Arrays.toString(vowels));


        // int numbers[] = {1, 2, 3, 4, 5};
        // int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length); // Creates a copy of the array

        // // if we do copyOfNumbers = numbers; // This will not create a copy, but rather a reference to the same array, so changes to one will affect the other
        // // copyOfRange can be used to copy a specific range of the array

        // System.out.println("Original array: " + Arrays.toString(numbers));
        // System.out.println("Copy of the array: " + Arrays.toString(copyOfNumbers));

        // System.out.println("Are the two arrays equal? " + Arrays.equals(numbers, copyOfNumbers)); // Checks if the two arrays are equal, == won't work because it checks for reference equality, not content equality


        
        // for(int number = 1; number <= 10; number++) {
        //     for (int multiplier = 1; multiplier <= 10; multiplier++) {
        //         System.out.printf("%d x %d = %d \n", number, multiplier, number * multiplier);
        //     }
        //     System.out.println(); // Print a new line after each table
        // }


        // int number = 5;
        // int multiplier = 1;

        // while (multiplier <= 10) {
        //     System.out.printf("%d x %d = %d \n", number, multiplier, number * multiplier);
        //     multiplier++;
        // }

        // int number2 = 5;
        // int multiplier2 = 1;
        // do {
        //     System.out.printf("%d x %d = %d \n", number2, multiplier2, number2 * multiplier2);
        //     multiplier2++;
        // } while (multiplier2 <= 10);



        ArrayList<Integer> numberList = new ArrayList<Integer>(); // ArrayList is a resizable array, it can grow and shrink in size dynamically
        numberList.add(1); // Adds an element to the end of the list
        numberList.add(2);
        numberList.add(3);

        numberList.add(1, 4); // Adds an element at a specific index, in this case it will add 4 at index 1 and shift the rest of the elements to the right
        System.out.println("Number list: " + numberList);

        numberList.remove(2); // Removes the element at the specified index, in this case it will remove the element at index 2 which is 3
        System.out.println("Number list after removal: " + numberList);

        numberList.set(2, Integer.valueOf(30)); // Sets the element at the specified index to the specified value, in this case it will set the element at index 2 to 30
        System.out.println("Number list after setting value: " + numberList);

        numberList.sort(Comparator.naturalOrder()); // Sorts the list in natural order (ascending), we can also use Comparator.reverseOrder() for descending order
        System.out.println("Number list after sorting: " + numberList);


        numberList.forEach(number -> {
            numberList.set(numberList.indexOf(number), number * 2); // This will set each number in the list to its double, forEach is a method that takes a lambda expression and applies it to each element in the list
        });

        System.out.println("Number list after doubling: " + numberList);

    }
}
