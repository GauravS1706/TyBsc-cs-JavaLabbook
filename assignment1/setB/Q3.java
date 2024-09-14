/*
    Set B:
        c) Write a menu driven program to perform the following operations on multidimensional array ie matrix :
            i. Addition
            ii. Multiplication
            iii. Transpose of any matrix.
            iv. Exit
*/

package assignment1.setB;
import java.util.Scanner;

public class Q3 {

    /**
     * @param sc
     */
    public static void addMatrices(Scanner sc) {
        System.out.println("Enter dimensions of the matrices (rows and column): ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];
        int[][] result = new int[row][col];

        System.out.println("Enter element of 1st matrix");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter element of 2nd matrix");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Resultant matrix after addition");
        printMatrix(result);

    }

    public static void multiplyMatrices(Scanner sc) {
        System.out.println("Enter dimensions of the matrices (rows and column): ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];
        int[][] result = new int[row][col];

        System.out.println("Enter element of 1st matrix");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter element of 2nd matrix");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        System.out.println("Resultant matrix after addition");
        printMatrix(result);

    }

    public static void transposeMatrix(Scanner sc) {
        System.out.println("Enter dimensions of the matrices (rows and column): ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] matrix1 = new int[row][col];
        int[][] transpose = new int[row][col];

        System.out.println("Enter element of  matrix");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Before transpose");
        printMatrix(matrix1);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix1[i][j];
            }
        }
        System.out.println("Resultant matrix after addition");
        printMatrix(transpose);

    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Addition");
            System.out.println("2. Multiplication");
            System.out.println("3. Transpose");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addMatrices(sc);

                    break;
                case 2:
                    multiplyMatrices(sc);
                    break;
                case 3:
                    transposeMatrix(sc);
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
}
