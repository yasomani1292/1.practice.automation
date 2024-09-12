package Programs;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Year");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year%4==0 && year%100!=0 || year%400==0)
		{
			System.out.println("It's a leap year: "+ year );
		}
		else {
			System.out.println("It's not a leap year: "+ year );
		}
		sc.close();
	}

}
