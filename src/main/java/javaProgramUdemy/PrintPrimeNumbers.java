package javaProgramUdemy;

public class PrintPrimeNumbers {

	public static void printPrimeNum()
	{ 	int start =1;
		int end =25;
		for(int i=1; i<=25;i++)
		{ int count=0;
			if(i>1)
			{
			
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.println(i);
			}	
		}		
		}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPrimeNum();
		
	}

}
