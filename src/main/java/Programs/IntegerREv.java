package Programs;

import java.util.Scanner;

public class IntegerREv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Integer"); 
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int digit;
		while(num!=0)
		{
			digit = num%10;
			System.out.print(digit);
			num=num/10;
		}
		
		sc.close();
		
		
	}

}
