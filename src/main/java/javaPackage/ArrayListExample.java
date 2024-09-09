package javaPackage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Comparable> list =new ArrayList<Comparable>();
		list.add("string");
		list.add(1);
		
		for(Object i : list)
		{
			System.out.println(i);
		}
		
		List<String> li2= new ArrayList<>();
		li2.add("string");
//		li2.add(1);
		
		List<Integer> li3  = new ArrayList<>(Arrays.asList(3,2,6,7));
		
		System.out.println(list);
		li2 = new LinkedList<>();
		
		
		
	}

}
