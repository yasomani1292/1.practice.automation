package interviewPrograms;
import java.util.HashSet;
import java.util.Set;

public class HasUniqueChars {
	public static boolean hasUniqueChars(String string) {
        // Create a set to store unique characters
        Set<Character> charSet = new HashSet<>();
 
        // Iterate through each character in the string
        for (char ch : string.toCharArray()) {
            // Check if the character is already in the set
            if (charSet.contains(ch)) {
                return false;
            }
            // Add the character to the set
            charSet.add(ch);
        }
 
        // If no duplicates found, return true
        return true;
    }
	
	public static void main(String[] args) {
        System.out.println(hasUniqueChars("abcdefg")); // should return true
        System.out.println(hasUniqueChars("hello")); // should return false
        System.out.println(hasUniqueChars("")); // should return true
        System.out.println(hasUniqueChars("0123456789")); // should return true
        System.out.println(hasUniqueChars("abacadaeaf")); // should return false

        /*
            EXPECTED OUTPUT:
            ----------------
            true
            false
            true
            true
            false
            
        */
        
    }
}

/*Set: Has Unique Chars ( ** Interview Question)
Write a Java program to determine if a given string contains all unique characters or not.

Implement a method called hasUniqueChars that takes a single argument, a string, and returns a boolean value.

The method should return true if all characters in the input string are unique and false if there are any duplicate characters.

Method signature: public static boolean hasUniqueChars(String string)

Input:

A string string



Output:

A boolean value indicating whether the input string contains all unique characters or not.



Example:



System.out.println(hasUniqueChars("abcdefg")); // should return true
System.out.println(hasUniqueChars("hello")); // should return false
System.out.println(hasUniqueChars("")); // should return true
System.out.println(hasUniqueChars("0123456789")); // should return true
System.out.println(hasUniqueChars("abacadaeaf")); // should return false
*/
