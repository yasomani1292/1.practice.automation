package interviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {

	public static int[] subarraySum(int[] nums, int target) {
	    // Create a HashMap to store cumulative sum and index
	    Map<Integer, Integer> sumIndex = new HashMap<>();
	    // Initialize the HashMap with 0 sum and index -1
	    sumIndex.put(0, -1);
	    // Initialize the current sum to 0
	    int currentSum = 0;
	 
	    // Iterate through the input array
	    for (int i = 0; i < nums.length; i++) {
	        // Calculate the cumulative sum
	        currentSum += nums[i];
	        // Check if the required subarray sum exists
	        if (sumIndex.containsKey(currentSum - target)) {
	            // Return the start and end indices of the subarray
	            return new int[]{sumIndex.get(currentSum - target) + 1, i};
	        }
	        // Store the current sum and its index in the HashMap
	        sumIndex.put(currentSum, i);
	    }
	 
	    // Return an empty array if no subarray is found
	    return new int[]{};
	}
	public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int target1 = 9;
        int[] result1 = subarraySum(nums1, target1);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]");

        int[] nums2 = {-1, 2, 3, -4, 5};
        int target2 = 0;
        int[] result2 = subarraySum(nums2, target2);
        System.out.println("[" + result2[0] + ", " + result2[1] + "]");

        int[] nums3 = {2, 3, 4, 5, 6};
        int target3 = 3;
        int[] result3 = subarraySum(nums3, target3);
        System.out.println("[" + result3[0] + ", " + result3[1] + "]");

        int[] nums4 = {};
        int target4 = 0;
        int[] result4 = subarraySum(nums4, target4);
        System.out.println("[]");
        
        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 3]
            [0, 3]
            [1, 1]
            []
    
        */
        
    }

	
}

/*HT: Subarray Sum ( ** Interview Question)
Given an array of integers nums and a target integer target, write a method called subarraySum that finds the indices of a contiguous subarray in nums that add up to the target sum using a hash table (HashMap).

Your function should take two arguments:

nums: an array of integers representing the input array

target: an integer representing the target sum


Your function should return a list of two integers representing the starting and ending indices of the subarray that adds up to the target sum. If there is no such subarray, your function should return an empty list.

For example:



int[] nums = [1, 2, 3, 4, 5]
int target = 9
int[] result1 = subarraySum(nums1, target1);
 
// This should print [1, 3]
System.out.println("[" + result1[0] + ", " + result1[1] + "]");


Note that there may be multiple subarrays that add up to the target sum, but your method only needs to return the indices of any one such subarray. Also, the input array may contain both positive and negative integers.

*/