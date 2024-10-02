package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class InterviewMphasis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "anand is an engineer";
		String[] strarr = s.split("an"); 
		System.out.println(Arrays.toString(strarr));
		
		
		String str1 = "Hello";
	    String str2 = "ello";
	    String str3 = new String("Hello");
	 
	    System.out.println(str1 == str2); 
	    System.out.println(str2 == str3);  
	 
	    System.out.println(str1.equals(str2));  
	    System.out.println(str1.equals(str3)); 
		
	    List<char[]> arrList = Arrays.asList(str1.toCharArray());
//		List<String> arrList =  new ArrayList<>(arrays.asString(charr));
            
//		for(String  : set)
//		{
//		Collections.frequency("repeated count of an"+ arrList, singleVal);
//		}
//
	}

}
