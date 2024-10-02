package JavaProgramsString;

import java.util.Scanner;

public class StringReverseTwoWays {
	
	public static void isPalindrome(String input)
	{
		String temp = "";
		
		 for(int i=input.length()-1; i>=0; i--)
		 {
			 temp+= input.charAt(i);
		 }
		if(temp.equals(input))
		{
			System.out.println("It's a palindrome");
		}
		else
		{
			System.err.println("It's not a palindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPalindrome("malayalam");
		System.out.println("Enter a String to reverse");
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		String output = "";
		
	for(int i = input.length()-1; i>=0; i--)
	{
		output+= input.charAt(i);
	}
		System.out.println(output);
		
		System.out.println(new StringBuffer(input).reverse());
		
		scan.close();
	}
	
}
