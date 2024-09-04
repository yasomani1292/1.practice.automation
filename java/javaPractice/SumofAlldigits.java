package javaPractice;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class SumofAlldigits {

	public static void sumdigit(int num)
	{
		int result = 0;
		while(num>0)
		{
			result += num%10;
			num = num/10;
		}
		System.out.println(result);
	}
	
	 static String input = "Login;Name;Email" + System.lineSeparator() +
			"peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator() +
			"james;Derek James;james@gmail.com" + System.lineSeparator() +
			"jackson;Walter Jackson;jackson@gmail.com" + System.lineSeparator() +
			"gregory;Mike Gregory;gregory@yahoo.com";
	
//	Which formats input data like this:
//	peterson ==> peterson@outlook.com
//
//	james ==> james@gmail.com
//
//	jackson ==> jackson@gmail.com
//
//	gregory ==> gregory@yahoo.com
	public static void stringFormat1(String input)
	{
		String result = "";
		String[] lines = input.split(System.lineSeparator());
		for(int i=1;i<lines.length;i++)
		{
			String[] words = lines[i].split(";");
			result = words[0]+ "==>" + words[2]+System.lineSeparator();
			System.out.println(result);
		}
		
	}
	
//	Chris Peterson (email: peterson@outlook.com)
	public static void stringFormat2(String input)
	{
		String result ="";
		String[] lines = input.split(System.lineSeparator());
		for(int i=1;i<lines.length;i++)
		{
			String[] words = lines[i].split(";");
			result = words[1]+ "(email:" + words[2] + ")"+System.lineSeparator();
			System.out.println(result);
		}
	}
	
	public static void firstCharToUpperCase(String text)
	{ char[] charArr = text.toCharArray();
	boolean found=false;
		for(int i=0; i<charArr.length;i++)
		{
			
			if(!found && Character.isLetter(charArr[0])) {
				charArr[i] = Character.toUpperCase(charArr[0]);
				found =true;
			}
			else if(Character.isWhitespace(charArr[i]))
			{
				found = false;
			}
		}
		System.out.println(String.valueOf(charArr));
		
	}
	
	public static String decimal2Roman(int number) {
		String[] roman = new String[] { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C" };
		int[] numArr = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100 };
		StringBuilder sb = new StringBuilder();
		for (int i = roman.length - 1; i >= 0; i--) {
			while (number >= numArr[i]) {
				sb.append(roman[i]);
				number -= numArr[i];
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumdigit(8345);
		stringFormat1(input);
		stringFormat2(input);
		firstCharToUpperCase("rose");
		System.out.println(decimal2Roman(8));
	}

}

