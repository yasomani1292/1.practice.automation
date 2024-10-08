package JavaProgramsString;

import java.util.Scanner;

public class StringEndChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a first String");
		String s1 = scan.nextLine();
		System.out.println("Enter a second String");
		String s2 = scan.nextLine();
		
		int count=0;
		for(int i=s1.length()-1,j=s2.length()-1;j>=0;i--,j--)
		{
			if(s1.charAt(i)==s2.charAt(j)) {
				count++;
		}
		}
		
		if(s2.length()==count)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		scan.close();
	}

}
