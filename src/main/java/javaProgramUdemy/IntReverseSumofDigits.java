package javaProgramUdemy;

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		intrev();
		sumOfDigits();
		intrev2(123456);
		
	} 

}
