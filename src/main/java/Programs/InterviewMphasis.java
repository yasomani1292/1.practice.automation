package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class InterviewMphasis {

	 public static String compressString(String input) {
//	     //		Input = "aabbacdcc"  => output => a2b2acdc2
		 
		 StringBuilder result = new StringBuilder(); // To store the compressed result
	        int count = 1; // To count occurrences of characters

	        // Traverse the input string
	        for (int i = 0; i < input.length(); i++) {
	            // If the current character is the same as the next one, increment the count
	            if (i < input.length() - 1 && input.charAt(i) == input.charAt(i + 1)) {
	                count++;
	            } else {
	                // Append the current character to the result
	                result.append(input.charAt(i));
	                // If count is greater than 1, append the count as well
	                if (count > 1) {
	                    result.append(count);
	                }
	                // Reset count for the next character
	                count = 1;
	            }
	        }

	        return result.toString();
	    }
	 public static void reverseAString()
	 {  //output:aidnI evoL I
		 String input = "I\"Love\"India\"";
			String output = "";

			String[] chars = input.split("");
			for (int i = chars.length - 1; i >= 0; i--) {
				output += chars[i];
			}
			System.out.println(output.replace("\"", " ").trim());
			
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aabbacdcc";
        String compressedString = compressString(input);
        System.out.println(compressedString); // Output: a2b2acdc2
        reverseAString();
    
		
//		String str1 = "Hello";
//	    String str2 = "ello";
//	    String str3 = new String("Hello");
//	 
//	    System.out.println(str1 == str2); 
//	    System.out.println(str2 == str3);  
//	 
//	    System.out.println(str1.equals(str2));  
//	    System.out.println(str1.equals(str3)); 
//		
//	    List<char[]> arrList = Arrays.asList(str1.toCharArray());
//		List<String> arrList =  new ArrayList<>(arrays.asString(charr));

//		for(String  : set)
//		{
//		Collections.frequency("repeated count of an"+ arrList, singleVal);
//		}

				

		

		   
		    
		        
		
				
	}

}
