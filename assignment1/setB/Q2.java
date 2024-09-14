/*
    Set B:
        b) Define a class MyNumber having one private int data member. Write a default constructor to initialize
           it to 0 and another constructor to initialize it to a value (Use this). Write methods isNegative, isPositive, 
           isZero, isOdd, isEven. Create an object in main. Use command line arguments to pass a value to the object
           (Hint : convert string argument to integer) and perform the above tests. Provide javadoc comments for all constructors 
           and methods and generate the html help file.
          
           Compile the Program:
                javac assignment1/setA/MyNumber.java
            
           Generate Javadoc:
                javadoc -d doc assignment1/setA/MyNumber.java
                This command will generate the Javadoc HTML files in a directory named doc.
           Running the Program
           Compile the Program:
                javac assignment1/setA/MyNumber.java
            
            Run the Program with Arguments:
                java assignment1.setA.MyNumber 5
                Example Output:
                Number: 5
                Is Negative: false
                Is Positive: true
                Is Zero: false
                Is Odd: true
                Is Even: false
            
            Run the Program without Arguments:
                java assignment1.setA.MyNumber
                Example Output:
                Insufficient arguments

*/
package assignment1.setB;
public class Q2 {

    private int num;

    /**
     * Default constructor that initializes the number to 0.
     */
    public Q2() {
        this.num = 0;
    }

    /**
     * Constructor that initializes the number to a specified value.
     *
     * @param num the value to initialize the number to
     */
    public Q2(int num) {
        this.num = num;
    }

    /**
     * Checks if the number is negative.
     *
     * @return true if the number is negative, false otherwise
     */
    public boolean isNegative() {
        return num < 0;
    }

    /**
     * Checks if the number is positive.
     *
     * @return true if the number is positive, false otherwise
     */
    public boolean isPositive() {
        return num > 0;
    }

    /**
     * Checks if the number is zero.
     *
     * @return true if the number is zero, false otherwise
     */
    public boolean isZero() {
        return num == 0;
    }

    /**
     * Checks if the number is odd.
     *
     * @return true if the number is odd, false otherwise
     */
    public boolean isOdd() {
        return num % 2 != 0;
    }

    /**
     * Checks if the number is even.
     *
     * @return true if the number is even, false otherwise
     */
    public boolean isEven() {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            int n = Integer.parseInt(args[0]);
            Q2 myNumber = new Q2(n);
            System.out.println("Number: " + n);
            System.out.println("isNegative: " + myNumber.isNegative());
            System.out.println("isPositive: " + myNumber.isPositive());
            System.out.println("isZero: " + myNumber.isZero());
            System.out.println("isOdd: " + myNumber.isOdd());
            System.out.println("isEven: " + myNumber.isEven());
        } else {
            System.out.println("Insufficient arguments");
        }
    }
}

