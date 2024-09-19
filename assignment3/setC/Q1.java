/*
    Set C
        a) Create an interface Department containing attributes deptName and deptHead.
           It also has abstract methods for printing the attributes. Create a class hostel containing
           hostelName, hostelLocation and numberOfRooms. The class contains method printing
           the attributes. Then write Student class extending the Hostel class and implementing the
           Department interface. This class contains attributes studentName, regNo, electiveSubject
           and avgMarks. Write suitable printData method for this class. Also, implement the abstract
           methods of the Department interface. Write a driver class to test the Student class.
           The program should be menu-driven containing the options:
                i.   Admit new student
                ii.  Migrate a student
                iii. Display details of a student
        For the third option, a search is to be made on the basis of the entered registration Number.
 */

package assignment3.setC;
import java.util.Scanner;

interface Department {

   String deptName="Computer Science";
   String deptHead="JP sir";
    abstract void  printDeptDetails();
}

class Hostel{
    public String hostelName;
    public String hostelLocation;
    public int numOfRooms;

    public Hostel(String hostelName, String hostelLocation, int numOfRooms) {
        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.numOfRooms = numOfRooms;
    }

    public void printHostelDetails(){
        System.out.println("Hostel Name : "+hostelName+" | Hostel Location " +
                " : "+" | Number of Rooms : "+numOfRooms);
    }

}
class Students extends Hostel implements Department{
    public int regNo;
    public String studentName;
    public String electiveSubject;
    public   float avgMarks;

    public Students(String hostelName, String hostelLocation, int numOfRooms, int regNo, String studentName, String electiveSubject, float avgMarks) {
        super(hostelName, hostelLocation, numOfRooms);
        this.regNo = regNo;
        this.studentName = studentName;
        this.electiveSubject = electiveSubject;
        this.avgMarks = avgMarks;
    }


    @Override
    public void printDeptDetails() {
        System.out.println("Department Name : "+deptName+" | Department Head : "+deptHead);
    }

    public void printStudentDetails()
    {
        System.out.println("Registration Number : "+regNo+" | Student Name : "+studentName+"" +
                "  | Elective Subject : "+electiveSubject+" "+" | Average Marks : "+avgMarks);

        System.out.println("=============================================================================================================================================================================");
        printHostelDetails();
        System.out.println("=============================================================================================================================================================================");
        printDeptDetails();
    }

}
//Driver Class
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter number of Students");
//        int n=sc.nextInt() ;
//        sc.nextLine();
        Students[] students=new Students[100];
        int studentCount=0;
        while(true)
        {
            System.out.println("Welcome");
            System.out.println("1. Enter 1 to Add new Student");
            System.out.println("2. Enter 2 to Migrate a Student");
            System.out.println("3. Enter 3 to Display Student Details");
            System.out.println("0. Enter 0 to exit Program");
           int choice=sc.nextInt();
           sc.nextLine();
           switch (choice)
           {
               case 1:
                   System.out.println("Enter Registration Number");
                   int regNo=sc.nextInt();
                   sc.nextLine();
                   System.out.println("Enter Student Name");
                   String name=sc.nextLine();
                   System.out.println("Enter Elective Subject");
                   String electiveSubject=sc.nextLine();
                   System.out.println("Enter Student Average marks");
                   float avgMarks=sc.nextFloat();
                   sc.nextLine();
                   System.out.println("Enter Hostel Name");
                   String hostelName=sc.nextLine();
                   System.out.println("Enter Hostel Location");
                   String hostelLocation=sc.nextLine();
                   System.out.println("Enter room number");
                   int roomNum=sc.nextInt();
                   sc.nextLine();
                   students[studentCount++]=new Students(hostelName,hostelLocation,roomNum,regNo,name,electiveSubject,avgMarks);
                   System.out.println("Student Add Successfully........");
                   break;

               case 2:
                   System.out.println("Enter Student Registration Number  to migrate");
                   int migrateRegistrationNum=sc.nextInt();
                   sc.nextLine();
                   boolean found =false;
                   for(int i=0;i<studentCount;i++)
                   {
                       if(students[i].regNo==migrateRegistrationNum)
                       {
                           System.out.println("Enter New Hostel Name");
                           students[i].hostelName=sc.nextLine();
                           System.out.println("Enter new Hostel Location");
                           students[i].hostelLocation=sc.nextLine();
                           System.out.println("Enter new Room Number");
                           students[i].numOfRooms=sc.nextInt();
                           sc.nextLine();
                           System.out.println("Student Migrate Successfully......");
                           found=true;
                           break;
                       }
                   }
                   if(!found)
                   {
                       System.out.println("Student Not Found !!!");
                   }
                   break;
               case 3:
                   System.out.println("Enter Registration Number");
                   int search=sc.nextInt();
                   sc.nextLine();
                   found=false;
                   for(int i=0;i<studentCount;i++)
                   {
                       if(students[i].regNo==search)
                       {
                           students[i].printStudentDetails();
                           found=true;
                           break;
                       }
                   }
                   if (!found)
                   {
                       System.out.println("Student Not Found !!!");

                   }
                   break;
               case 0:
                   System.out.println("Exited.................");
                   sc.close();
                   return;
               default:
                   System.out.println("Invalid Choice ! Please Try Again");

           }
        }
    }
}
