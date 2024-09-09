package javaPackage;

import java.util.Scanner;

public class ReadFromConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter any String : ");
		String word = sc.next();
		System.out.println("You have Entered this String : " + word);
		System.out.println("Please enter any Ineger value : ");
		int intVal = sc.nextInt();
		System.out.println("You have entered the int value : " + intVal);
		
		
//		TRiangle Area
		Scanner sc2 = new Scanner(System.in);
		
		System.err.println("Enter the A side of triangle value : ");
		Double a = sc2.nextDouble();
		System.err.println("Enter the b side of triangle value : ");
		Double b = sc2.nextDouble();
		System.err.println("Enter the c side of triangle value : ");
		Double c = sc2.nextDouble();
		
		Double p = (a+b+c)/2;
		
		Double areaofTriangle = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println("Area of Triangle is : " + areaofTriangle);
		
//		Circle circumference
		Scanner sc3 = new Scanner(System.in);
		
		System.err.println("Enter the radius of circle : ");
		Double r = sc3.nextDouble();
		Double circleCircum = 2* (Math.PI) *r;
		System.out.println("Circle circumference is : " + circleCircum);
		
		
		
	}

}
