// CPSC_1110_Ch14_E4_Morris.java - Fulfills Requirements for Big java 7 Ch 14 Ex 4.
// Author: Markintus Morris 
// Date: 25-July-2021
import java.util.Arrays;

public class MergeSortDemo {

	public static void main(String[] args) {
		//what it does:This program demonstrates the merge sort algorithm 
		//how it works: by sorting an array that is filled with random numbers.
		String[] str = {"Ball","Apple","Banana","Yellow","Cat","Toy"};
		System.out.println("Array before sorting: ");
		System.out.println(Arrays.toString(str));
		MergeSorter.sort(str);
		System.out.println("Array after sorting: ");
		System.out.println(Arrays.toString(str));

	}

}
