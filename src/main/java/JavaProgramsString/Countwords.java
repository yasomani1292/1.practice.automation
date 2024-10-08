package JavaProgramsString;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Countwords {
	
	public static void reversewords()
	{
		String input ="yaso 123456 manikandan";
		String removenum =input.replaceAll("\\d", "");
		System.out.println(removenum);
		String temp="";
		String[] s = removenum.split(" ");
		for(int i=s.length-1; i>=0; i--)
		{
			temp+=s[i];
		}	
		System.out.println(temp);	
	}

	public static void programSplitString() {
		String s = "anand is an engineer";
//		String[] splitStr =s.split("an");
//		System.out.println(Arrays.toString(splitStr));
		String s2 =s.replaceAll("an", "1");
		char[] s3 =  s2.toCharArray();
//		System.out.println(s2.toCharArray());
//		Character[] chList = Arrays.stream(s3).boxed().toArray(Character::new);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		programSplitString();
		reversewords();
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
