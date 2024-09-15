/*
    Set A:
          b) Define Student class(roll_no, name, percentage) to create n objects of the
             Student class. Accept details from the user for each object. Define a static
             method “sortStudent” which sorts the array on the basis of percentage.
*/

package assignment2.setA;
import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student> {
    private int studentRollNo;
    private String studentName;
    private float studentPercentage;

    // Parameterized Constructor
    public Student(int rollNo, String name, float percentage) {
        this.studentRollNo = rollNo;
        this.studentName = name;
        this.studentPercentage = percentage;
    }

    // Getters and Setters
    public int getStudentRollNo() {
        return studentRollNo;
    }

    public void setStudentRollNo(int studentRollNo) {
        this.studentRollNo = studentRollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public float getStudentPercentage() {
        return studentPercentage;
    }

    public void setStudentPercentage(float studentPercentage) {
        this.studentPercentage = studentPercentage;
    }

    // Override compareTo method to define natural ordering on the basis of student percentage
    @Override
    public int compareTo(Student other) {
        return Float.compare(other.getStudentPercentage(), this.studentPercentage); // Descending order
    }

    // Display method
    public void display() {
        System.out.println("Roll No: " + studentRollNo + ", Name: " + studentName + ", Percentage: " + studentPercentage);
    }

    // Static method to sort students by percentage
    public static void sortStudent(Student[] students) {
        Arrays.sort(students);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter roll number for student " + (i + 1) + ": ");
            int rollNo = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.print("Enter name for student " + (i + 1) + ": ");
            String name = sc.nextLine();

            System.out.print("Enter percentage for student " + (i + 1) + ": ");
            float percentage = sc.nextFloat();
            sc.nextLine(); // Consume newline

            students[i] = new Student(rollNo, name, percentage);
        }

        // Sort students by percentage
        Student.sortStudent(students);

        // Display sorted students
        System.out.println("\nStudents sorted by percentage:");
        for (Student stud : students) {
            stud.display();
        }

        sc.close();
    }
}
