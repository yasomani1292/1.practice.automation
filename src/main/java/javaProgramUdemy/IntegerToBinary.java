package javaProgramUdemy;

import java.util.Scanner;

import org.apache.log4j.nt.NTEventLogAppender;

public class IntegerToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Integer to binary int is 7 
		 * 7%2 ==> 1
		 * 3%2 ==> 1  
		 * 1%2 ==> 1
		 * 0.5  
		 *  Now the binary number need to store From last = ans is =>111 
		 *   */
		System.out.println("ENter the number");
		Scanner scan =  new Scanner(System.in);
		int num = scan.nextInt();
//		int[] storeBinary = new int[10];
//		int i=0;
//		while (num!=0)
//		{
//			storeBinary[i] = num%2;
//			num = num/2;
//			i++;
//		}
//		for(int j= i-1; j>=0;j--)
//		{
//			System.out.print(storeBinary[j]);
//		}
//		Second way
		System.out.println(Integer.toBinaryString(num));
		scan.close();
		
	}

}
