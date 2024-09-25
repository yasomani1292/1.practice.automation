package interviewPrograms;

import java.util.HashSet;
import java.util.Set;

public class LongConsecutiveSequence {

	public static int longestConsecutiveSequence(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
 
        int longestStreak = 0;
 
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
 
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
 
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
 
        return longestStreak;
    }
	public static void main(String[] args) {
        testLongestConsecutiveSequence("Consecutive Integers", new int[] {1, 2, 3, 4, 5}, 5);
        testLongestConsecutiveSequence("No Sequence", new int[] {1, 3, 5, 7, 9}, 1);
        testLongestConsecutiveSequence("Duplicates", new int[] {1, 2, 2, 3, 4}, 4);
        testLongestConsecutiveSequence("Negative Numbers", new int[] {1, 0, -1, -2, -3}, 5);
        testLongestConsecutiveSequence("Empty Array", new int[] {}, 0);
        testLongestConsecutiveSequence("Multiple Sequences", new int[] {1, 2, 3, 10, 11, 12, 13}, 4);
        testLongestConsecutiveSequence("Unordered Elements", new int[] {5, 1, 3, 4, 2}, 5);
        testLongestConsecutiveSequence("Single Element", new int[] {1}, 1);
        testLongestConsecutiveSequence("All Identical Elements", new int[] {2, 2, 2, 2, 2}, 1);
    }
    
       private static void testLongestConsecutiveSequence(String title, int[] nums, int expected) {
        System.out.println("Test: " + title);
        System.out.print("Testing array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    
        int result = longestConsecutiveSequence(nums);
        System.out.println("Expected longest streak: " + expected);
        System.out.println("Actual longest streak: " + result);
    
        if (result == expected) {
            System.out.println("PASS\n");
        } else {
            System.out.println("FAIL\n");
        }
    }

}



    


	


/*Set: Longest Consecutive Sequence ( ** Interview Question)
Given an unsorted array of integers, write a function that finds the length of the  longestConsecutiveSequence (i.e., a sequence of integers in which each element is one greater than the previous element).

Use sets to optimize the runtime of your solution.

Input: An unsorted array of integers, nums.

Output: An integer representing the length of the longest consecutive sequence in nums.

Example:



Input: int[] nums = [100, 4, 200, 1, 3, 2]
 
Output: 4
 
Explanation: The longest consecutive sequence in the input array is [4, 3, 2, 1], and its length is 4.

*/





