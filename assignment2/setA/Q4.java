/*
    Set A:
          d) Write a java program that take input as a person name in the format of first,
             middle and last name and then print it in the form last, first and middle name,
             where in the middle name first character is capital letter.
 */

package assignment2.setA;
import java.util.Scanner;

public class Q4 {
    private static String firstName;
    private static String middleName;
    private static String lastName;

    public Q4(String firstName,String middleName,String lastName){
        this.firstName=firstName;
        this.middleName= middleName.substring(0, 1).toUpperCase() + middleName.substring(1).toLowerCase();
        this.lastName=lastName;

    }
    public void display()
    {
        System.out.println(lastName+" "+firstName+" "+middleName);
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your First Name");
        String fName= sc.nextLine();
        System.out.println("Enter your Middle Name");
        String mName=sc.nextLine();
        System.out.println("Enter your Last name");
        String lName=sc.nextLine();

        Q4 q=new Q4(fName,mName,lName);
        q.display();
    }
}
