/*
    Set B:
         b) Write a program to using marker interface create a class product(product_id, product_name, product_cost, product_quantity)
            define a default and parameterized constructor. Create objects of class product and display the contents of each object
            and Also display the object count.
 */

package assignment3.setB;


interface  MyMakerInterface{}

class Product implements MyMakerInterface{

    private int productId;
    private  String productName;
    private float productCost;
    private int productQuantity;
    public static int cnt=0;

    public Product(){
        this.productId = productId;
        this.productName = productName;
        this.productCost = productCost;
        this.productQuantity = productQuantity;
        cnt++;
    }

    public Product(int productId, String productName, float productCost, int productQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.productCost = productCost;
        this.productQuantity = productQuantity;
        cnt++;
    }
    public void display(){
        System.out.println("Product ID : "+productId+" "+" | Product Name : " +productName+" "+
                " | Product Cost : "+productCost+" | Product Quantity : "+productQuantity);
    }
    public static void getObjectCount()
    {
        System.out.println("Object Count is : "+cnt);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Product p=new Product(1,"Laptop ",45000.32f,10);
        Product p1=new Product(2,"Phones ",15000.50f,20);
        Product p2=new Product(3,"Speaker",5000.00f,30);

        p.display();
        System.out.println("-----------------------------------------------------------------------------");
        p1.display();
        System.out.println("------------------------------------------------------------------------------");
        p2.display();
    }
}
