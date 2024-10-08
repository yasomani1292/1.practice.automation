package interviewPrograms;

import java.util.ArrayList;
import java.util.List;

public class Capgemininterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int[] intArr = {3, 2, 5, -2, -5, -9}; // Input array

		        // Lists to store positive and negative numbers separately
		        List<Integer> positives = new ArrayList<>();
		        List<Integer> negatives = new ArrayList<>();

		        // Separate positive and negative numbers
		        for (int num : intArr) {
		            if (num > 0) {
		                positives.add(num);
		            } else {
		                negatives.add(num);
		            }
		        }

		        // Variables to iterate through the positive and negative lists
		        int posIndex = 0, negIndex = 0;
		        int totalCount = Math.min(positives.size(), negatives.size()) * 2;

		        // Print one positive followed by one negative number
		        for (int i = 0; i < totalCount; i++) {
		            if (i % 2 == 0 && posIndex < positives.size()) {
		                System.out.print(positives.get(posIndex++) + " ");
		            } else if (i % 2 != 0 && negIndex < negatives.size()) {
		                System.out.print(negatives.get(negIndex++) + " ");
		            }
		        }

		        // Print remaining positive or negative numbers if any
		        while (posIndex < positives.size()) {
		            System.out.print(positives.get(posIndex++) + " ");
		        }
		        while (negIndex < negatives.size()) {
		            System.out.print(negatives.get(negIndex++) + " ");
		        }
	}

}
