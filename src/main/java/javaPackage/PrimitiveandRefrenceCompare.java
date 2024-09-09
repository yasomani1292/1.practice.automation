package javaPackage;

import java.util.Arrays;

public class PrimitiveandRefrenceCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 128;
		int i2 = 128;
		System.out.println("i==i2 ->" + (i==i2));//true
		
		Integer i3 =128;
		Integer i4 =128;
		System.out.println("i3==i4 ->" + (i3==i4)); //false//Because integer pool size(-128 to 128)
		
		Integer i5 =127;
		Integer i6 = 127;
		System.out.println("i5==i6 ->" + (i5==i6));//true
		
		Integer i7 = new Integer(127);
		Integer i8 = new Integer(127);
		System.out.println("i7==i8 ->" + (i7==i8));//false
		
//		Above one is deprecated new way of declaring a object is below
		Integer i9 = Integer.valueOf(127);
		Integer i10 = Integer.valueOf(127);
		System.out.println("i9==i10 ->" + (i9==i10));//true// because effective way of storing
//		the Integer object and It's pointing the same reference point So, It's true. 
		
//		If you want to compare only values means you can use Integer equals method
		System.out.println("i7.equals(i8) ->" + (i7.equals(i8))); //true
		
//		Arrays also a refrences
		int[] arr = {1,2,3};
		int[] arr2 = {1,2,3};
		System.out.println("arr==arr2 ->" + (arr==arr2));//false
		System.out.println("arr.equals(arr2) ->" + (arr.equals(arr2)));//false because we are comparing 
//		two Int here not arrays SO we are getting false
		System.out.println("Arrays.equals(arr,arr2) ->" + Arrays.equals(arr, arr2));//true
	}

}
