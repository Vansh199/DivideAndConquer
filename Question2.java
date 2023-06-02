import java.util.*;
//time complexity:O(n)
//space complexity:O(1)

public class Question2 {
    public static void partition(int[] a)
    {
        int pIndex = 0;
 
        // each time we find a negative number, `pIndex` is incremented,
        // and that element would be placed before the pivot
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] < 0)    // pivot is 0
            {
                swap(a, i, pIndex);
                pIndex++;
            }
        }
    }
 
    public static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {19,-20,7,-4,-13,11,-5,3};
 
        partition(arr);
        System.out.println(Arrays.toString(arr));
    }
}
