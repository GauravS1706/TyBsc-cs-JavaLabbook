/*
    Set C:
        b)Create four member variables for Customer class.
        Assign public, private, protected and default access modifiers respectively
        to these variables. Try to access these variables from other classes
        (Same package and Different package)
 */

package assignment2.setC;
public class Q2Customer {
    public String name;
    private int id;
    protected String mail;
    String Address;

    public Q2Customer(String name, int id, String mail, String address) {
        this.name = name;
        this.id = id;
        this.mail = mail;
        Address = address;
    }
    public void display()
    {
        System.out.println(id+" "+name+" "+mail+" "+Address);
    }

}