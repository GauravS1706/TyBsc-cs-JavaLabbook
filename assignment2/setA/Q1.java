/*
    Set A
        a) Create an employee class(id,name,deptname,salary). Define a default and parameterized constructor.
           Use ‘this’ keyword to initialize instance variables. Keep a count of objects created. Create objects
           using parameterized constructor and display the object count after each object is created.
          (Use static member and method). Also display the contents of each object.
*/


package assignment2.setA;
import static assignment2.setA.Employee.getCount;

class Employee{
    private  int empId;
    private String  empName;
    private String  empDeptName;
    private double  empSalary;
    private static int cnt=0;

    //    default Constructor
    public Employee() {
        this.empId = 0;
        this.empName = "Unknown";
        this.empDeptName = "Unknown";
        this.empSalary = 0.0;
    }

    //    Parametrized Constructor
    public Employee(int empId,String empName,String empDeptName,double empSalary)
    {
        this.empId=empId;
        this.empName=empName;
        this.empDeptName=empDeptName;
        this.empSalary=empSalary;
        cnt++;
    }

    public void display()
    {
        System.out.println(empId +" "+ empName+" "+ empDeptName+" "+ empSalary);

    }

    // Static method to get the current object count
    public static void getCount() {
        System.out.println("Object count : "+cnt);
    }
}
public class Q1 {

    public static void main(String[] args) {
        Employee q= new Employee(101, "Gaurav","Devloper",50000);
        q.display();
        getCount();
        Employee q1= new Employee(102, "Shri","tester",45000);
        q1.display();
        getCount();
        Employee q2= new Employee(103, "John","Designer",40000);
        q2.display();;
        getCount();
    }
}
