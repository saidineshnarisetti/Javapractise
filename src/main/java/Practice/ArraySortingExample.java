package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraySortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] numbers = {5, 2, 8, 1, 7};

		 Arrays.sort(numbers);
	        System.out.println("Ascending Order: " + Arrays.toString(numbers));

	        Integer[] boxedNumbers = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
	        Arrays.sort(boxedNumbers, Comparator.reverseOrder());
	        System.out.println("Descending Order: " + Arrays.toString(boxedNumbers));

	}

}
