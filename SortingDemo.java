import java.util.*;

/**
  establishes the selection sort algorithm by
sorting an array that i dilled with arbitray numbers
*/

public class SortingDemo {
	public static void main(String[] args) {
		
		int[] a1 = ArrayUtil.randomIntArray(100, 1000);
		int[] a2 = a1.clone();
		int[] a3 = a1.clone();
		
		int[] b1 = ArrayUtil.randomIntArray(1000, 1000);
		int[] b2 = b1.clone();
		int[] b3 = b1.clone();
		
		int[] c1 = ArrayUtil.randomIntArray(10000, 1000);
		int[] c2 = c1.clone();
		int[] c3 = c1.clone();
		
		int[] d1 = ArrayUtil.randomIntArray(100000, 1000);
		int[] d2 = d1.clone();
		int[] d3 = d1.clone();
		
		int[] e1 = ArrayUtil.randomIntArray(1000000, 1000);
		int[] e2 = e1.clone();
		int[] e3 = e1.clone();
		
		//  measuring the elapsed time
		StopWatch timer = new StopWatch();
		
		// begginers method of sorting
		System.out.println();
		
		timer.start();
		SelectionSorter.sort(a1);
		timer.stop();
		System.out.println(a1.length + " items with the SelectionSort - " + timer.getElapsedTime());
		timer.reset();
		
		timer.start();
		SelectionSorter.sort(b1);
		timer.stop();
		System.out.println(b1.length + " items with the SelectionSort - " + timer.getElapsedTime());
		timer.reset();
		
		timer.start();
		SelectionSorter.sort(c1);
		timer.stop();
		System.out.println(c1.length + " items with the SelectionSort - " + timer.getElapsedTime());
		timer.reset();
		
		timer.start();
		SelectionSorter.sort(d1);
		timer.stop();
		System.out.println(d1.length + " items with the SelectionSort - " + timer.getElapsedTime());
		timer.reset();
		
		timer.start();
		SelectionSorter.sort(e1);
		timer.stop();
		System.out.println(e1.length + " items with the SelectionSort - " + timer.getElapsedTime());
		timer.reset();
		
		// secondary sorting method 
		System.out.println();
		
		timer.start();
		MergeSorter.sort(a2);
		timer.stop();
		System.out.println(a1.length + " items with the MergeSort - " + timer.getElapsedTime());
		timer.reset();
		
		timer.start();
		MergeSorter.sort(b2);
		timer.stop();
		System.out.println(b1.length + " items with the MergeSort - " + timer.getElapsedTime());
		timer.reset();
		
		timer.start();
		MergeSorter.sort(c2);
		timer.stop();
		System.out.println(c1.length + " items with the MergeSort - " + timer.getElapsedTime());
		timer.reset();
		
		timer.start();
		MergeSorter.sort(d2);
		timer.stop();
		System.out.println(d1.length + " items with the MergeSort - " + timer.getElapsedTime());
		timer.reset();
		
		timer.start();
		MergeSorter.sort(e2);
		timer.stop();
		System.out.println(e1.length + " items with the MergeSort - " + timer.getElapsedTime());
		timer.reset();
		
		// third sorting method 
		System.out.println();
		
		timer.start();
		Arrays.sort(a3);;
		timer.stop();
		System.out.println(a1.length + " items with the Arrays.sort - " + timer.getElapsedTime());
		timer.reset();
		
		timer.start();
		Arrays.sort(b3);
		timer.stop();
		System.out.println(b1.length + " items with the Arrays.sort - " + timer.getElapsedTime());
		timer.reset();
		
		timer.start();
		Arrays.sort(c3);
		timer.stop();
		System.out.println(c1.length + " items with the Arrays.sort - " + timer.getElapsedTime());
		timer.reset();
		
		timer.start();
		Arrays.sort(d3);
		timer.stop();
		System.out.println(d1.length + " items with the Arrays.sort - " + timer.getElapsedTime());
		timer.reset();
		
		timer.start();
		Arrays.sort(e3);
		timer.stop();
		System.out.println(e1.length + " items with the Arrays.sort - " + timer.getElapsedTime());
		timer.reset();
		
	}
}