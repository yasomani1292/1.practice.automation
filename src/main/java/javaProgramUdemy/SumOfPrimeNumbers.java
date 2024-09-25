package javaProgramUdemy;

public class SumOfPrimeNumbers {

	public static void sumOfPrimeNumbers(int num) {
		// find the sum of prime digit number 6789 => now we are Spliting the number, 
//		1-9 what are the prime numbers are there 2,3,5,7 check if the numbers are there in the
//		splited digits then go for sum
		
		int digit =0;
		int sum=0;
		while(num != 0)
		{
			digit = num%10;
			if(digit==2 || digit ==3 || digit==5 || digit==7)
				{
				sum =digit+sum;
				}
			num=num/10;
		}
		System.out.println("Sum of prime digits : "+ sum);
		
		
	}
	
	public static void sumOfMultiplesOfThree(int num) {	
		int digit =0;
		int sum=0;
		while(num != 0)
		{
			digit = num%10;
			if(digit%3==0)
				{
				sum =digit+sum;
				}
			num=num/10;
		}
		System.out.println("Sum of multiples of 3 digits : "+ sum);
		
	}
	
	public static void countOfDigits(int num)
	{
		int count=0;
		while(num !=0 )
		{   count++;
			num=num/10;	
		}
		System.out.println("count Of Digits : "+ count);
	}
	
	public static void countTheNumberOfTimesAGivenDigitsOccurs(int num, int givenNum)
	{
		int count=0;
		int digit =0;
		while(num != 0)
		{	digit = num%10;
			num=num/10;
			if(digit==givenNum)
				count++;
		}
		System.out.println("count The Number GivenDigitsOccurs : " + count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumOfPrimeNumbers(35);
		sumOfMultiplesOfThree(368);
		countOfDigits(568798276);
		countTheNumberOfTimesAGivenDigitsOccurs(45677777, 7);
		
		
	}

}
