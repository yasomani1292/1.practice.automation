package javaProgramUdemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntReverseSumofDigits {
	
	public static void intrev()
	{
       int digit=0;
		
		int input =12345;
		
		while(input!=0)
		{ 
			digit = input%10;
			System.out.print(digit);
			input =input/10;			
		}
		System.out.println();
	}

	public static void intrev2(int input)
	{
       int digit=0;
       int result=0;
		
		while(input!=0)
		{ 
			digit = input%10;
			result = result*10+digit;
			input =input/10;			
		}
		System.out.println("int rev is: " + result);
	}
	
	public static void sumOfDigits() {
		int digit=0;
		int sum=0;
		int input =12345;
		
		while(input!=0)
		{ 
			digit = input%10;
			sum= digit+sum;
			input =input/10;			
		}
		System.out.println("Total sum is : " + sum);
		
	}
	
	public static void missingNumbers(int[] arr, int n)
	{ 	
		List<Integer>listInt = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
//		for(int num : arr)
//		{
//			listInt.add(Integer.valueOf(num));	
//		}	
		for(int i=1; i<=n; i++)
		{
			if(!listInt.contains(i))
			{
				System.out.println("Missing numbers : " +i);
			}
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		intrev();
		sumOfDigits();
		intrev2(123456);
		missingNumbers(new int [] {1,2,3,4,8,9} , 10);
		
	} 

}
