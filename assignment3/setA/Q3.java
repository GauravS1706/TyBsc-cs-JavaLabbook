/*
    Set A:
         c) Define an interface “Operation” which has methods area(),volume().
            Define a constant PI having a value 3.142.Create a class cylinder
            which implements this interface (members – radius, height)
            Create one object and calculate the area and volume.
 */

package assignment3.setA;
import java.util.Scanner;

interface Operation{
     public void area();
     public void volume();
    final double pi=Math.PI;
}
class Cylinder implements Operation{
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {

        this.radius = radius;
        this.height = height;
    }

    @Override
    public void area() {
        double cal=2*pi*radius*radius+2*pi*radius*height;
        System.out.println("area of Circle : "+cal);
    }

    @Override
    public void volume() {
        double cal=pi*radius*(2*height);
        System.out.println("Volume of Circle : "+cal);
    }

}



public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius and height of cylinder");
        double r= sc.nextDouble();
        double h=sc.nextDouble();
        Cylinder cylinder=new Cylinder(r,h);
        cylinder.area();
        cylinder.volume();
    }
}
