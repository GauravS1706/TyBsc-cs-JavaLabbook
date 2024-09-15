/*
    Set A:
        c) Write a java program to accept 5 numbers using
           command line arguments sort and display them.

           Run cmd on cmd or terminal
           To Compile code:
                javac Q3.java
           To Run Program using arguments
                java Q3 1 5 3 2 4
            Output :
                   Sorted Number   1 2 3 4 5

                    OR
                java SortNumbers 34 12 5
            Output:
                  Please provide exactly 5 numbers as command line arguments.

 */
package assignment2.setA;
import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        if (args.length != 5) {
            System.out.println("Please enter exactly 5 numbers.");
            return;
        }

        // Convert command line arguments to integers
        int[] numbers = new int[5];
        try {
            for (int i = 0; i < 5; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers.");
            return;
        }

        // Sort the numbers
        Arrays.sort(numbers);

        // Display the sorted numbers
        System.out.println("Sorted numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
