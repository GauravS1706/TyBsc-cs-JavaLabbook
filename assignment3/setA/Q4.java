/*
     Set A:
           d) Write a program to find the cube of given number using function interface.
 */

package assignment3.setA;
import java.util.Scanner;
import java.util.function.Function;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");

        int n=sc.nextInt();

        Function<Integer,Integer> cubeFunction=(Integer x)->x*x*x;
        int cube=cubeFunction.apply(n);
        System.out.println("The cube of "+n+" is : "+cube);

    }

}
