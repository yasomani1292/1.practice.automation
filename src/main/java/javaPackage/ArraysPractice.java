package javaPackage;

import java.util.Arrays;

public class ArraysPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 10,8, 6,4 };

		int[][] mularr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println(arr[0]);
		System.out.println(mularr[0][0]);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Arrays.fill(arr, 2);
		System.out.println(Arrays.toString(arr));
		Arrays.fill(arr, 2 , 4 ,6);
		System.out.println(Arrays.toString(arr));
		
		 easyWayToMethod();
		

	}

	public static void easyWayToMethod() {
		int a = 10;
		 int b=20;	
		 int sum = a+b;
		System.out.println(sum);
		 System.out.println(sum*2);
	}

}
