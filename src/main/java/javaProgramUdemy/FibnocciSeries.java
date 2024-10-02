package javaProgramUdemy;

import java.util.Scanner;

public class FibnocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENter the number");
		Scanner scan =  new Scanner(System.in);
		int num = scan.nextInt();
		int n1=0, n2=1, n3;
		System.out.print(n1 + "\t" + n2);
		for(int i=0; i<num; i++)
		{
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			
			System.out.print("\t" + n3);
		}
		
	}

}
