/*
    Set C:
            b) Write a menu driven program to perform the following operations on 2D array:
                i. Sum of diagonal elements
                ii. Sum of upper diagonal element
                iii. Sum of lower diagonal elements
                iv. Exit
*/


package assignment1.setC;
import java.util.Scanner;

/**
 * @author Gaurav Shimpi
 * @version 1.0
 */
public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of matrix eg-3,4,5..");
        int n = sc.nextInt();
//		accepting size of 2D matrix from user
        int[][] matrix = new int[n][n];
//		int matrix[][]={{ 1 ,2 ,3},{4,5,6},{7,8,9}};
        System.out.println("Enter element of matrix");
//		accepting element of matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Display Matrix");
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
        Q2 q = new Q2();
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Sum of Matrix Diagonal");
            System.out.println("2. Sum of Matrix Upper Diagonal");
            System.out.println("3. Sum of Matrix Lower Diagonal");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Sum of Matrix Diagonal is : " + q.sumOfDiagonal(matrix));
                    break;
                case 2:
                    System.out.println("Sum of Matrix Upper Diagonal is : " + q.sumOfUpperDiagonal(matrix));
                    break;
                case 3:
                    System.out.println("Sum of Matrix Lower Diagonal is : " + q.sumOfLowerDiagonal(matrix));
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();

    }

    public int sumOfDiagonal(int[][] matrix) {
        int n = matrix.length;
        int sum = 0;
//		rows of matrix
        for (int i = 0; i < n; i++) {
//			columns of matrix
            for (int j = 0; j < n; j++) {
//				eg 3x3 matrix i=1 j=1 ,i=2 j=2,i=3 j=3
                if (i == j) {
//					adding element of matrix at [i][j] position only if condition satisfied
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public int sumOfUpperDiagonal(int[][] matrix) {
        int n = matrix.length;
        int sum = 0;
//		row of matrix
        for (int i = 0; i < n; i++) {
//			columns of matrix
            for (int j = i; j < n; j++) {
//			eg of 3x3 matrix sum of upper diagonal i=0,j=0,i=0,j=1,i=0 j=2; i=1 j=1 ,i=1 j=2; i=2 j=2
//				loop will run until 2 length of each row is 3 and loop start from 0 ie 0 1 2 3
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public int sumOfLowerDiagonal(int[][] matrix) {
        int n = matrix.length;
        int sum = 0;
//		row of matrix
        for (int i = 0; i < n; i++) {
//			column of matrix
            for (int j = 0; j <= i; j++) {
//			eg of 3x3 matrix sum of upper diagonal i=0,j=0,i=1,j=0,i=1 j=1 ;i=2 j=0 ,i=2 j=1; i=2 j=2
//				loop will run until 2 length of each row is 3 and loop start from 0 ie 0 1 2 3
                sum += matrix[i][j];
            }
        }
        return sum;
    }

}
