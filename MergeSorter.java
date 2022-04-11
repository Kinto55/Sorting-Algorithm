    /**
    The sort method of this class sorts an array, using the merge
    sort algorithm.
    */
    public class MergeSorter
    {
    /**
    Sorts an array, using merge sort.
    @param a the array to sort
    */
    public static void sort(int[] a)
    { 
    if (a.length <= 1) { return; }
    int[] first = new int[a.length / 2];
    int[] second = new int[a.length - first.length];
    // Copies the first half of a into first, same with the secondary array
    for (int i = 0; i < first.length; i++) 
    { 
    first[i] = a[i]; 
    }
    for (int i = 0; i < second.length; i++) 
    { 
    second[i] = a[first.length + i]; 
    }
    sort(first);
    sort(second);
    merge(first, second, a);
    }
    /**
    Merges two sorted arrays into another sorted array.
    @param first 
    @param second 
    @param a tells which array to merge
    */
    private static void merge(int[] first, int[] second, int[] a)
    { 
    // Next element to consider in the first array
    int iFirst = 0;
    // Next element to consider in the second array 
    int iSecond = 0; 
    int j = 0; 

    while (iFirst < first.length && iSecond < second.length)
    { 
    if (first[iFirst] < second[iSecond])
    { 
    a[j] = first[iFirst];
    iFirst++;
    }
    else
    { 
    a[j] = second[iSecond];
    iSecond++;
    }
    j++;
    }
    // Note that only one the loops copies entry
    // Copy any remaining entries 
    while (iFirst < first.length) 
    { 
    a[j] = first[iFirst]; 
    iFirst++; j++;
    }
    // Copy any remaining entries of the second half
    while (iSecond < second.length) 
    { 
    a[j] = second[iSecond]; 
    iSecond++; j++;
    }
    }
    }