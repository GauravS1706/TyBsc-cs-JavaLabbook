/*
  Set:A
      d) Write a program to accept the array element and display in reverse order.
*/

package assignment1.setA;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = sc.nextInt();
        sc.nextLine();//consume new line
        int arr[] = new int[n];
        System.out.println("Enter elements of Array ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before Reverse Order");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Array After  Reverse Order");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }
}

