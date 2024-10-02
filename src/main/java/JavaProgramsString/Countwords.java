package JavaProgramsString;

import java.util.Scanner;

public class Countwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String to count words");
		Scanner scan =  new Scanner(System.in);
		String input = scan.nextLine();
		int count=0;
		for(int i=0; i<input.length(); i++)
		{
			if(Character.isWhitespace(input.charAt(i))) 
				count++;
		}
		System.out.println(count+1);
	}

}
