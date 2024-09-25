package interviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatChar {

	public static Character firstNonRepeatingChar(String string)
	{
		Map<Character, Integer> charCounts = new HashMap<>();
		for(int i=0; i<string.length(); i++) {
			char c = string.charAt(i);
			charCounts.put(c, charCounts.getOrDefault(c, 0)+1);			
		}
		for(int i=0;i<string.length();i++) {
			char c = string.charAt(i);
			if(charCounts.get(c)==1)
			{
				return c;
			}
		}
			return null;
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));
        

	}

}
