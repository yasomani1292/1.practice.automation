package Programs;

import java.util.Scanner;

public class EvenOrAdd {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Num");
		try (Scanner sc = new Scanner(System.in);){
		int num = sc.nextInt();
		if(num<=0)
		{
//			System.out.println("It's not a valid Num: " + num);
			throw new IllegalArgumentException("It's not a valid Num: " + num);
		}
		else
		{
			if(num%2==0)
			{
				System.out.println("It's a even number: " + num);
			}
			else
			{
				System.out.println("It's odd number: " + num);
			}
		}
		}
	}

}
