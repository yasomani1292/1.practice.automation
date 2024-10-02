package javaProgramUdemy;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num to check Armstrong number");
		int num = scan.nextInt();
		 int temp = num,  sum=0,  digit;
		 
		 while(num!=0)
		 {
			 digit = num%10;
			 sum+= digit * digit * digit;
			 num= num/10;
		 }
		
		System.out.println(temp == sum);
	}

}
