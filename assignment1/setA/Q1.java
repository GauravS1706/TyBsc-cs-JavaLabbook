/*
Set A
	a) Using javap, view the methods of the following classes from the lang package: java.lang.Object , 
	java.lang.String and java.util.Scanner. and also Compile sample program 8. Type the following command
	and view the bytecodes. javap -c MyClass.
	Compile the Program:
	javac assignment1/setA/Q1.java
	
	Run the Program with Arguments:
	java assignment1.setA.Q1 5
	Output:
	0
	5
	
	Run the Program without Arguments:
	java assignment1.setA.Q1
	Output:
	Insufficient arguments
*/

package assignment1.setA;


public class Q1 {
	int num;

	public Q1() {
		num=0;
	}

	public Q1(int num) {

		this.num = num;
	}

	public static void main(String[] args) {
		
		Q1 q= new Q1();
		if(args.length>0)
		{
			int n= Integer.parseInt(args[0]);
			Q1 q2=new Q1(n);
			System.out.println(q.num);
			System.out.println(q2.num);
		}
		else {
			System.out.println("Insufficent arguments");
		}
	}

}
