/*
 Set C:
        b)Create four member variables for Customer class.
        Assign public, private, protected and default access modifiers respectively
        to these variables. Try to access these variables from other classes
        (Same package and Different package)
 */
package assignment2.setC.DiffPack;
import assignment2.setC.Q2Customer;

public class Q2a {
    public static void main(String[] args) {
        Q2Customer customer = new Q2Customer("Jane Doe", 67890, "jane@example.com", "456 Elm St");
        customer.display();
    }
}
