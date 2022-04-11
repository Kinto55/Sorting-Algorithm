// CPSC_1110_Ch14_E1_Morris.java - Fulfills Requirements for Big java 7 Ch 14 Ex 1.
// Author: Markintus Morris 
// Date: 25-July-2021

public class SelectionSorter {
	//what it does:Sorts an array, using selection sort
	//how it works: includes parameters as values to find and sort the largest tail range of the array
	public static void sort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int maxPos = maximumPosition(a, i);
			ArrayUtil.swap(a, maxPos, i);
		}
	}

	private static int maximumPosition(int[] a, int from) {
		//what it does:Finds the largest element in a tail range of the array.
		//how it works:maxpos now contains the (first) index of the largest value
		int maxPos = from;
		for (int i = from + 1; i < a.length; i++) {
			if (a[i] > a[maxPos]) {
				maxPos = i;
			}
		}
		return maxPos;
	}

}
