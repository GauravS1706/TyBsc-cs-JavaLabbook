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
