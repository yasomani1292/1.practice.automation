package mani;

import java.util.Arrays;

public class ArrayRottate {

	public static int[] rotate_IntermediateArray(int[] arr, int order) {
		if (arr == null || order < 0) {
			throw new IllegalArgumentException("Illegal argument!");
		}
		if (order > arr.length)
			order = order % arr.length;

		int[] result = new int[arr.length];
		for (int i = 0; i < order; i++)
			result[i] = arr[arr.length - order + i];

		for (int i = order, j = 0; i < arr.length; i++, j++)
			result[i] = arr[j];
		return result;
	}

	public static int[] rotate_Bubble(int[] arr, int order) {
		if (arr == null || order < 0) {
			throw new IllegalArgumentException("Illegal argument!");
		}
		if (order > arr.length)
			order = order % arr.length;

		for (int i = 0; i < order; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
				System.out.println(Arrays.toString(arr));
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(rotate_IntermediateArray(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3)));
		System.out.println(Arrays.toString(rotate_Bubble(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3)));

	}

}
