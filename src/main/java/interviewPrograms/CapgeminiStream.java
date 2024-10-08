package interviewPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CapgeminiStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr ={2,3,4,-5,-6,-7};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.sort(list);
        System.out.println(list);
        for(int i=0, j=list.size()-1; i<=3; i++,j--)
        {
        	System.out.printf("%d %d ", list.get(j), list.get(i));
        }  
	}

}
