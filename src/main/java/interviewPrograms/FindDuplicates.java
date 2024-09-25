package interviewPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicates {

	
	 public static List<Integer> findDuplicates(int[] nums)
	    {  
	    Map<Integer, Integer> numCounts = new HashMap<>();
	 
	    for (int num : nums) {
	        numCounts.put(num, numCounts.getOrDefault(num, 0) + 1);
	    }
	 	    List<Integer> duplicates = new ArrayList<>();
	 	    for (Map.Entry<Integer, Integer> entry : numCounts.entrySet()) {
	        if (entry.getValue() > 1) {
	            duplicates.add(entry.getKey());
	        }
	    }
	 
	    // Return the ArrayList of duplicate integers.
	    return duplicates;
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
	        List<Integer> duplicates = findDuplicates(nums);
	        System.out.println(duplicates); 
	       

	}

}
