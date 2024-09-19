/*
    Set A:
          b) Define an abstract class Staff with protected members id and name.
             Define a parameterized constructor. Define one subclass OfficeStaff with member department.
             Create n objects of OfficeStaff and display all details.
 */

package assignment3.setA;
import java.util.Scanner;

abstract class Staff{
    protected  int id;
    protected String name;

    public Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }
    abstract void display();
}
class OfficeStaff extends  Staff{
    private String dept;

    public OfficeStaff(int id, String name,String dept) {
        super(id, name);
        this.dept=dept;
    }
    @Override
    public void display()
    {
        System.out.println("Id : "+id+" | Name : "+name +" | Department : "+dept);

    }
}
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Staff");
        int n=sc.nextInt();
//        OfficeStaff os=new OfficeStaff();
        OfficeStaff os[]=new OfficeStaff[n];
//        String arr[]=new String[n];
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter Staff Details : "+
       " "+ (i+1));
            System.out.print("Enter Id: ");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter name : ");
            String name=sc.nextLine();
            System.out.println("Enter Department : ");
            String dept=sc.nextLine();

            os[i]=new OfficeStaff(id,name,dept);
        }
        for (OfficeStaff officeStaff:os)
        {
            officeStaff.display();
        }
    }
}
