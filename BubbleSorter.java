// CPSC_1110_Ch14_E1_Morris.java - Fulfills Requirements for Big java 7 Ch 14 Ex 13.
// Author: Markintus Morris 
// Date: 25-July-2021


public class BubbleSorter {
	//what it does: Modify the selection sort algorithm to sort an array of integers
	//how it works: executes loops till end of array

	public static void sort(int[] arr) {
		int n = arr.length;
		int temp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
