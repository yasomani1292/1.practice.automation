package javaProgramUdemy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindMissingNumbers {

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
		missingNumbers(new int[] {1,6,8,3} , 10);
	}
}
