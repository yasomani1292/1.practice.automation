package javaPackage;
import java.util.HashMap;
import java.util.Map;

public class ItemInCommon {
	public static boolean itemInCommon(int[] arr1, int[] arr2) {
		Map<Integer, Boolean> items = new HashMap<>();

		for (int key : arr1) {
			items.put(key, true);
		}

		for (int key : arr2) {
			if (items.get(key) != null) return true;
		}
		return false;
	}

	public static boolean itemInCommon2(int[] array1, int[] array2) {
        for (int i : array1) {
            for (int j : array2) {
                if (i == j) return true;
            }
        }
        return false;
    }

	
	public static void main(String[] args) {

		int[] arr1 = { 1, 3, 5 };
		int[] arr2 = { 2, 3, 6 };
		System.out.println(itemInCommon(arr1, arr2));
		System.out.println("method2"+ itemInCommon2(arr1, arr2));

	}

}
