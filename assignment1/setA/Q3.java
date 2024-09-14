/*
 Set:A
        c) Write a menu driven program to perform the following operations
        i. Calculate the volume of cylinder. (hint : Volume: π × r² × h)
        ii. Find the factorial of given number.
        iii. Check the number is Armstrong or not.
        iv. Exit
*/

package assignment1.setA;
import java.util.Scanner;

public class Q3 {

    public static float vol(float r, float h) {
        final float pi = (float) Math.PI;
        float volume = pi * r * r * h;
        return volume;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static boolean isArmstrong(int n) {
        int temp = n;
        int sum = 0, cnt = 0;

        while (temp != 0) {
            int rem = temp % 10;
            cnt++;
            temp /= 10;
        }
        int tem = n;
        while (tem != 0) {
            int rem = tem % 10;
            sum = sum + (int) Math.pow(rem, cnt);
            tem /= 10; // Corrected this line
        }

        return n == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Enter 1 to calculate volume of cylinder");
            System.out.println("2. Enter 2 to find factorial of given number");
            System.out.println("3. Enter 3 to check whether given number is Armstrong or not");
            System.out.println("4. Enter 0 to exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter radius of Cylinder ");
                    float r = sc.nextFloat();
                    System.out.println("Enter height of Cylinder");
                    float h = sc.nextFloat();
                    System.out.println("Volume of Cylinder of radius " + r + " and height " + h + " is : " + vol(r, h));
                    break;
                case 2:
                    System.out.println("Enter number to find its Factorial");
                    int n = sc.nextInt();
                    System.out.println("Factorial of given number " + n + " is : " + factorial(n));
                    break;
                case 3:
                    System.out.println("Enter number to check whether it is Armstrong or not");
                    int x = sc.nextInt();
                    boolean arm = isArmstrong(x);
                    System.out.println(arm ? "The given number is Armstrong " : "Not an Armstrong number");
                    break;
                case 0:
                    System.out.println("Exited !...");
                    break;
                default:
                    System.out.println("Invalid number, enter from 0 to 3 only");
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}
