package Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class PracticeProgram {

//	Integer[] what = Arrays.stream( data ).boxed().toArray( Integer[]::new );
//	Integer[] ever = IntStream.of( data ).boxed().toArray( Integer[]::new );
//
//	// To boxed list
//	List<Integer> you  = Arrays.stream( data ).boxed().collect( Collectors.toList() );
//	List<Integer> like = IntStream.of( data ).boxed().collect( Collectors.toList() );
	
	// String Reverse
	public void revStr() {
		String reversedstr = "";
		String s = "RahulShettyAcademy";
		String[] strArr = s.split("");
		for (int i = strArr.length - 1; i >= 0; i--) {
			reversedstr = reversedstr.concat(strArr[i]);
		}
		System.out.println(reversedstr);
	}

//	Swap string
	public void swapString() {
		String s1 = "yaso";
		String s2 = "mani";
		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		System.out.println(s1);
		System.out.println(s2);

	}

	// Sort Array

	public void sortArray() {
		int[] arr = { 56, 12, 23, 45, 112 };

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		Integer[] coll = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		List<Integer> liint = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Arrays.sort(coll, Collections.reverseOrder());
		System.out.println("Coll output" + Arrays.toString(coll));

	}

//	Finding a key using linear search

	public int findElement(int[] arr, int key) {

		int n = arr.length;
		for (int i = 0; i <= n - 1; i++) {
			if (arr[i] == key) {
				return i;
			}

		}

		return -1;
	}

//	Finding a key using binary search
	public void findElementBinary() {
		boolean flag = false;
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int key = 6;
		int l = 0;
		int h = arr.length;

		while (l <= h) {
			int m = (l + h) / 2;
			if (arr[m] == key) {
				System.out.println("Element found position" + m);
				flag = true;
				break;
			} else if (arr[m] < key) {
				l = m + 1;

			} else if (arr[m] > key) {
				h = m - 1;
			}

		}
		if (flag == false) {
			System.out.println("Element not found..");
		}
	}

//	 find min and max
	public void findminAndMax() {
		int[] a = { 10, 20, 1, 34, 7 };
		int min = a[0];
		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		System.out.println(max);

		for (int j = 1; j < a.length; j++) {
			if (a[j] < min) {
				min = a[j];
			}
		}
		System.out.println(min);
	}

//	 Fibnocci 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc

	public void fibnocciSeries() {
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		System.out.print(n1 + " " + n2);
		for (int i = 0; i < 10; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
		System.out.println();
	}

	public void printStarTriangle() {
		for (int i = 1; i < 5; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	public void printStarPyramid(int row) {
		for (int i = 0; i < row; i++) {
			for (int k = row - i-1; k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}
	}

	public void printStarPyramid2(int row) {
		for (int i = 0; i < row; i++) {
			
//			System.out.printf("5%s", row, "*");
			
			String pattern = "%" + (row - i) * 2 + "s";
			String patternStar = "%" + (i + 1) + "s";
			System.out.println(pattern);
			System.out.printf(pattern, "");
			String.format("%" + i+1 + "d", 0).replace("0", "* ");
			
//			for (int k = row - i-1; k > 0; k--) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j <= i; j++) {
//				System.out.print("* ");
//			}
			System.out.println();

		}
	}
	
	public void getduplicateInegerfrequency(int[] arr)
	{
		List<int[]> list = Arrays.asList(arr);
		
		List<Integer> listInte  = Arrays.stream( arr ).boxed().collect( Collectors.toList() );
		Set<Integer> setInte = Arrays.stream(arr).boxed().collect(Collectors.toSet());
		
		for(Integer set:setInte) {
			if((Collections.frequency(listInte, set))>1){
		System.out.println("Duplicate count is "+ set + " : " +(Collections.frequency(listInte, set)));
	}
		}
	}
	
	public void getduplicateInegerMap(Integer[] arr)
	{
		Map<Integer,Integer>  map = new HashMap<>();
		
		for(Integer num : arr) {
		if(map.containsKey(num))
		{
			map.put(num, map.get(num)+1);
		}
		else
		{
			map.put(num, 1);
		}
		if(map.get(num)>1)
		{
			System.out.println(num);
		}
		}
		for(Entry<Integer, Integer> keyval: map.entrySet()) {
			System.out.println(keyval);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeProgram practiceProgram = new PracticeProgram();
		practiceProgram.revStr();

		practiceProgram.swapString();
		practiceProgram.sortArray();
		practiceProgram.findElement(new int[] { 2, 87, 24, 67, 45 },67);

		int position = practiceProgram.findElement(new int[] { 2, 87, 24, 67, 45 }, 67);
		if (position == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element fount at :" + (position + 1));
		}

		practiceProgram.findElementBinary();
		practiceProgram.findminAndMax();
		practiceProgram.fibnocciSeries();
		practiceProgram.printStarTriangle();
		practiceProgram.printStarPyramid(5);
		practiceProgram.printStarPyramid2(5);
		practiceProgram.getduplicateInegerfrequency(new int [] {2,5,6,2,4,5,4});
		practiceProgram.getduplicateInegerMap(new Integer [] {2,5,6,2,4,5,4});
	}

}
