package javaProgramUdemy;

public class DuckNumber {
	public static void ducknumCheck(int num)
	{
		
		boolean isDuckNum = false;
		while(num!=0)
		{ 
			 int digit = num%10;
			 if(digit==0)
			 {
				 isDuckNum=true;
				 break;
			 }
			num =num/10;			
		}
		System.out.println("is Duck Num : " + isDuckNum);
	}
	
	public static void main(String[] args) {
		ducknumCheck(4898797);	
	}
	
}
