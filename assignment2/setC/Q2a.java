/*
      Set C:
        b)Create four member variables for Customer class.
        Assign public, private, protected and default access modifiers respectively
        to these variables. Try to access these variables from other classes
        (Same package and Different package)
 */

package assignment2.setC;
public class Q2a {
    public static void main(String[] args) {
        Q2Customer cust=new Q2Customer("John",101,"xyz@gamil.com","downtown");
        cust.display();
    }
}
