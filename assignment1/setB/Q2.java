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

