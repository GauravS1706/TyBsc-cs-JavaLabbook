/*
    Set C:
            c) Write a program to display the 1 to 15 tables.
                ( 1 * 1 = 1    2 * 1 = 2    15 * 1 = 15
                  1 * 2 = 2    2 * 2 = 4    15 * 2 = 30
                  1 * 3 = 3    2 * 3 = 6    15 * 3 = 45
                  …........    .........    ...........
                  1 * 10 = 10  2 * 10 = 20  15 * 10 = 150 )
*/

package assignment1.setC;
import java.util.Scanner;

public class Q3 {

    public void tables(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<11;j++)
            {
                System.out.printf("%d x %d = %d\n", i, j, i * j);

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number from tables");
        int n=sc.nextInt();
        Q3 q=new Q3();
        q.tables(n);
        sc.close(); //closing resources
    }
}
