package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "anand";
		String[] s1 = s.split("");
		List<String> arrList = new ArrayList<>(Arrays.asList(s1));
		Set<String> setArr = new HashSet<>(Arrays.asList(s1));

		for (String set : setArr) {
			System.out.println("The string repeated count is " + set + " - " + Collections.frequency(arrList, set));
		}
		String name = "anand is an engineer";
		int totallenghth = name.length();
		System.out.println(totallenghth);
		int remaininglength = name.replaceAll("an", "").length();
		System.out.println(remaininglength);
		String remainChar = name.replaceAll("an", "");
		System.out.println(remainChar);
		System.out.println((totallenghth - remaininglength) / 2);

//		Getting particular digit value	
		String msg = "please enter the0 value ofOTP 678907 will 678904 expire 678997 within 5 seconds";
//			msg.replaceAll("[^0-9]{6}" , "");
		System.out.println(msg.replaceAll("\\d{6}", ""));

		Pattern pattern = Pattern.compile("([0-9]{6})");
		Matcher matcher = pattern.matcher(msg);

		if (matcher.find()) {
			System.out.println(matcher.groupCount());
			System.out.println(matcher.group());
		}

	}

}
