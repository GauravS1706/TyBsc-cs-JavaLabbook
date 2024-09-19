/*
    Set B:
          a) Create an abstract class “order” having members id,description.
             Create two subclasses “Purchase Order” and “Sales Order” having members
             customer name and Vendor name respectively.Define methods accept and display in all cases.
             Create 3 objects each of Purchase Order and Sales Order and accept and display details.
 */

package assignment3.setB;
import java.util.Scanner;

abstract class Order {
    protected int id;
    protected String description;

    public Order(int id, String description) {
        this.id = id;
        this.description = description;
    }

    abstract void accept();

    abstract void display();
}

class PurchaseOrder extends Order {
    private String customerName;


    public PurchaseOrder(int id, String description, String customerName) {
        super(id, description);
        this.customerName = customerName;
    }

    @Override
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Purchase Id");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Description");
        description = sc.nextLine();
        System.out.println("Enter Customer Name");
        customerName = sc.nextLine();

    }

    @Override
    void display() {
        System.out.println("Purchase Id : " + id + " | Description : " + description + " | Customer Name : " + customerName);
    }
}

class SalesOrder extends Order {
    private String vendorName;


    public SalesOrder(int id, String description, String vendorName) {
        super(id, description);
        this.vendorName = vendorName;
    }

    @Override
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sales Order Id");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Description");
        description = sc.nextLine();
        System.out.println("Enter Vendor Name");
        vendorName = sc.nextLine();

    }

    @Override
    void display() {
        System.out.println("Sales order Id : " + id + " | Description : " + description + " | Vendor Name : " + vendorName);
    }
}


public class Q1 {
    public static void main(String[] args) {
        int n = 3;
        PurchaseOrder[] purchaseOrders = new PurchaseOrder[n];
        SalesOrder[] salesOrders = new SalesOrder[n];

        for (int i = 0; i < n; i++) {
            purchaseOrders[i] = new PurchaseOrder(0, "", "");
            System.out.println("Enter Purchase Order Detail");
            purchaseOrders[i].accept();
        }
        for (int i = 0; i < n; i++) {
            salesOrders[i] = new SalesOrder(0, "", "");
            System.out.println("Enter Sales Order Details");
            salesOrders[i].accept();
        }
        System.out.println("=====================================================================================================================");
        for (PurchaseOrder p : purchaseOrders) {
            p.display();
        }

        for (SalesOrder s : salesOrders) {
            s.display();
        }
    }
}
