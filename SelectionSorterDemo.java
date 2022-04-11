
import java.util.Arrays;
// CPSC_1110_Ch14_E1_Morris.java - Fulfills Requirements for Big java 7 Ch 14 Ex 1.
// Author: Markintus Morris 
// Date: 25-July-2021

public class SelectionSorterDemo {

	//what it does: prints sorting
	//how it works:runs standard out stream method to show the sprting before and after
	public static void main(String[] args) {
		int[] a = ArrayUtil.randomIntArray(20, 100);
		System.out.println("Array before sorting: ");
		System.out.println(Arrays.toString(a));
		SelectionSorter.sort(a);
		System.out.println("Array after sorting: ");
		System.out.println(Arrays.toString(a));

	}

}
