/*
    Set B:
         a) Write a Java program to create a Package “SY” which has a class SYMarks (members – ComputerTotal, MathsTotal, and ElectronicsTotal).
          Create another package TY which has a class TYMarks (members – Theory, Practicals).
          Create n objects of Student class (having rollNumber, name, SYMarks and TYMarks).
          Add the marks of SY and TY computer subjects and calculate the Grade (‘A’ for >= 70, ‘B’ for >= 60 ‘C’ for >= 50 , Pass Class for > =40 else ‘FAIL’)
          and display the result of the student in proper format.
 */

package assignment2.setB;
import assignment2.setB.Sy.SyMarks;
import assignment2.setB.Ty.TyMarks;
import java.util.Scanner;

public class Q1 {
    private final int rollNo;
    private String name;
    private final SyMarks syMarks;
    private final TyMarks tyMarks;

    public Q1(int rollNo, String name, SyMarks syMakrs, TyMarks tyMarks) {
        this.rollNo = rollNo;
        this.syMarks = syMakrs;
        this.tyMarks = tyMarks;
        this.name = name;
    }

    public void display() {
        float totalComputer = syMarks.computerTotal + tyMarks.theroy + tyMarks.pratical;
        float totalMath = syMarks.mathTotal + tyMarks.pratical + tyMarks.theroy;
        float totalElectronics = syMarks.electronicTotal + tyMarks.theroy + tyMarks.pratical;
        String grade = calculateGrade(totalComputer);
        System.out.println("rollNo " + rollNo + " " + "Total Computer Marks " + totalComputer + " " + "Grade " + grade);
        String grade1 = calculateGrade(totalMath);
        System.out.println("rollNo " + rollNo + " " + "Total Math Marks " + totalMath + " " + "Grade " + grade);
        String grade3 = calculateGrade(totalElectronics);
        System.out.println("rollNo " + rollNo + " " + "Total Electonics Marks " + totalElectronics + " " + "Grade " + grade);

    }

    public String calculateGrade(float totalmarks) {
        if (totalmarks >= 70) {
            return "A";
        } else if (totalmarks >= 60 || totalmarks < 70) {
            return "B";
        } else if (totalmarks >= 50 || totalmarks < 60) {
            return "C";
        } else if (totalmarks >= 40 || totalmarks < 50) {
            return "D";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Students");
        int n = sc.nextInt();
        ;
        Q1[] student = new Q1[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll Number: ");
            int rollNumber = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("SY Marks (Computer, Maths, Electronics): ");
            float computerTotal = sc.nextFloat();
            float mathsTotal = sc.nextFloat();
            float electronicsTotal = sc.nextFloat();
            System.out.print("TY Marks (Theory, Practicals): ");
            float theory = sc.nextFloat();
            float practicals = sc.nextFloat();

            SyMarks syMarks1 = new SyMarks(computerTotal, mathsTotal, electronicsTotal);
            TyMarks tyMarks1 = new TyMarks(theory, practicals);

            student[i] = new Q1(rollNumber, name, syMarks1, tyMarks1);


        }
        System.out.println("Student Details");
        for (Q1 s : student) {
            s.display();
            System.out.println();
        }


    }
}
