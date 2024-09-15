/*
    Set C :
        a)Write a package for String operation which has two classes Con and Comp.
          Con class has to concatenates two strings and comp class compares two strings.
          Also display proper message on execution.
 */

package assignment2.setC;
import java.util.Scanner;

class ConCat
{
    public void concatenate(String s1,String s2)
    {
        String s3=s1.concat(s2);
        System.out.println("String after Concatenation : "+s3);
    }

}
class Compare {
    public void compare(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
    }
}
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter String 1");
        String str1=sc.nextLine();
        System.out.println("Enter String 2");
        String str2=sc.nextLine();

        ConCat con=new ConCat();
        con.concatenate(str1,str2);

        System.out.println("Enter String 1");
        String s1=sc.nextLine();
        System.out.println("Enter String 2");
        String s2=sc.nextLine();
        Compare comp=new Compare();
        comp.compare(s1,s2);
    }
}
