package javaPractice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumGenerate {
//	Recursive method // FActorials
	private static int findFactorial(int i) {
		if (i != 0) {
			return i * findFactorial(i - 1);
		} else
			return -1;
	}

	private static int findSum(int... inte) {
		int sum = 0;
		for (int intnum : inte) {
			sum += intnum;
		}
		return sum;
	}
	
	
	public static String[] filterWordsByLength(int minLength, String[] words) {
	    String[] filterdword= new String[words.length];
		for(int i=0; i<words.length;i++)
		{
		    if(words[i].length() >= minLength)
		    {
		        filterdword[i] = words[i];
		    }
		}
		
		
		return filterdword;
	}

	public static int[] generateRandomArray(int amountofElement)
	{  
	   Random r = new Random();
	   int[] array = new int[amountofElement];
	   for(int i=0; i<amountofElement; i++)
	   {
		   array[i] = r.nextInt(100)+1;
	   }
		System.out.println(Arrays.toString(array));
		return array;
	}
	public static int[] extendArray(int[] arr) {
		int newArrayLenght = arr.length * 2;
		int[] resultArray = Arrays.copyOf(arr, newArrayLenght);
		
		for (int i = arr.length; i < newArrayLenght; i++) {
			resultArray[i] = arr[i - arr.length] * 2;
		}
		
		return resultArray;
	}
	
	
	public static void main(String[] args) {
//		public static void main(String... args) {
		
		
		
		
		int x = Integer.MIN_VALUE; // 2147483647
		int n = -2147483647 -2;
		System.out.println(n);

		// TODO Auto-generated method stub
		System.out.println(findFactorial(3));
		System.out.println(findSum(1, 2, 3, 4, 5, 8, 9, 10));
		Random ran = new Random();
		
		System.out.println(ran.nextDouble());
		System.out.println(ran.nextLong());
		System.out.println(ran.nextFloat());
		System.out.println(ran.nextInt(100)); //0 to 99
		System.out.println(ran.nextInt(100)+1);
		
		//filter array
		String userInput = "manikandan yaso liya, melina ";
		String[] words = userInput.split("\\s+");
		String[] filteredWords = filterWordsByLength(5, words);
		System.out.println(Arrays.toString(filteredWords));
	
		
		
//		ran.ints(10, 20,30).forEach(d->System.out.println("sample " +d));
//		
//		String s = "the ??yaso!! mani.,   liya";
//		String s2 = "the??yaso!!mani.,liya";
//		System.out.println(Arrays.toString(s.split("[\\p{P}\\s]+")));
//		System.out.println(Arrays.toString(s2.split("[\\p{P}\\s]+")));
//		
//				int height = 2;
//				
//				 for(int i=0; i<=height; i++){
//				  for(int j=0; j<=i;j++)
//				 {
//				     System.out.print("*");
//				 }
//				  System.out.println();
//				 }
//				 
//				for(int j=height; j>=0;j--){
//				for(int k=0; k<j+1;k++)
//				{
//				    System.out.print("*");
//				}
//				System.out.println();
//		    }
//				
//				int[][] matrix = {
//						{1, 2, 3, 4, 5,},
//						{6, 7},
//						{8, 9, 10}
//				};
//				
//				for(int i = 0; i < matrix.length; i++) {
//					for (int j = 0; j < matrix[i].length; j++) {
//						System.out.print(matrix[i][j] + "\t");
//					}
//					System.out.println();
//				}
	}

}
