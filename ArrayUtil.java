// CPSC_1110_Ch14_E1,E14_Morris.java - Fulfills Requirements for Big java 7 Ch 14 Ex 1 and 14.
// Author: Markintus Morris 
// Date: 25-July-2021
import java.util.Random;
public class ArrayUtil {

	private static Random generator = new Random();
	//what it does: This class contains utility methods for array manipulation
	//how it works: creates an arry filled with random values 

	public static int[] randomIntArray(int length, int n) {
		int[] a = new int[length];
		for (int i = 0; i < a.length; i++) {
			a[i] = generator.nextInt(n);
		}
		return a;
	}
	public static void swap(int[] a, int i, int j) {
		//what it does:Swaps two entries of an array.
		//how it works: takes each element from array a separatelyso the loop body can use that variable /array element.
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
