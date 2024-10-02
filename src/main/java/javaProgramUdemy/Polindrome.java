package javaProgramUdemy;

import java.util.Scanner;

import javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon;

public class Polindrome {

	public static void palindromeCheckInt(int num1)
	{ 	String num = String.valueOf(num1);
		StringBuffer sb = new StringBuffer(num); // String Buffer has the reverse inbuilt method
		String reverseNum =  sb.reverse().toString(); // It is giving the stringBuffer, So , we need to change into the String
		System.out.println(num.equals(reverseNum)?"It's a palindrome":"It's not a plaindrome");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindromeCheckInt(222);
		
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int digit, num = scan.nextInt(), result=0,temp;
		
		temp=num;
		while(num!=0)
		{
			digit = num%10;
			result = result*10+digit;
			num= num/10;
		}
		if(result== temp)
		{
			System.out.println("It's a palindrome");
		}
		else
		{
			System.out.println("It's not a palindrome");
		}
			
		scan.close();
	}

}
