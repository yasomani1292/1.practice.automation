package javaProgramUdemy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "capgemini";
		 Map<Character, Integer> dupe = new HashMap<>();
		  char[] splitletter = input.toCharArray();
		   for(Character letter: splitletter )
		   {
			   if(dupe.containsKey(letter))
			   {
				   dupe.put(letter, dupe.get(letter) +1);
			   }
			   else
			   {
				   dupe.put(letter, 1);
			   }
			   
		   }
		   for(Entry<Character, Integer> keyval: dupe.entrySet()) {
				System.out.println(keyval);
			}
		  
	}

}
