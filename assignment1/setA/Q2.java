/*
Set A
	b) Write a program to calculate perimeter and area of rectangle.
	(hint : area = length * breadth , perimeter=2*(length+breadth))
*/



package assignment1.setA;

import java.util.Scanner;

public class Q2 {
	// method using static and return statement
	public static float perimeter(float length, float breadth) {
		float peri = 2f * (length + breadth);
		return peri;
	}

//	method using non static and void 
	public void area(float length, float breadth) {
		float a = length * breadth;
		System.out.println("area of rectangle of length " + length + " and " + breadth + " is : " + a);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		float l = sc.nextFloat();
		System.out.println("Enter breadth");
		float b = sc.nextFloat();

		System.out.println("Perimeter of rectangle of length " + l + " and breadth " + b + " is : " + perimeter(l, b));

		Q2 q = new Q2();
		q.area(l, b);
		sc.close();
	}
}
