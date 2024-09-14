/*
    Set C:
          a) Write a program to accept n names of country and display them in descending order.

*/
package assignment1.setC;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number How many Countries you want to store ");

        int n = sc.nextInt();
        sc.nextLine();
//		Assigned length of the array from user		
        String[] country = new String[n];
        System.out.println("Enter Countries Name");
//		adding data to array
        for (int i = 0; i < n; i++) {
            country[i] = sc.nextLine();
        }

        Arrays.sort(country, Collections.reverseOrder());
        System.out.println("Countries in desceding Order");
        for (String s : country) {
            System.out.print(s + " ");
        }
        sc.close();
    }
}
