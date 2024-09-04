package javaPractice;

import java.util.Arrays;
import java.util.OptionalInt;

public class MethodsPracticeAllPrograms {
	
	public static int findMax(int[] intArr)
	{
		int max = intArr[0];
		 for(int num:intArr)
		 {
			 if(num > max)
			 {
				 max =num;
			 }
		 }
		return max;
	}
	
	public static int findMax2(int[] intArr)
	{
		return Arrays.stream(intArr).max().getAsInt();
	}
	 public static int[] changeStingToIntArr(String[] strArr)
	 {
		 return Arrays.stream(strArr).mapToInt(s->Integer.valueOf(s)).toArray();
	 }
	 
	 public static void drawrectangle(int height, int width)
	 {
		 for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					if (j == 0 || j == width - 1 || i == 0 || i == height -1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
					
				}
				System.out.println();
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,6,7 , 8 ,2,3,4,5};
		int [] arr2 = {2,4,1};
		String[] strArr = {"1","3","7","3"};
		System.out.println(findMax(arr));
		System.out.println(findMax2(arr2));
		System.out.println(Arrays.toString(changeStingToIntArr(strArr)));
		drawrectangle(4, 10);
		
	}

}
