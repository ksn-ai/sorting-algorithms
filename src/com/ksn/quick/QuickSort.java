package com.ksn.quick;

import java.util.Arrays;
import java.util.stream.IntStream;

public class QuickSort {

    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */
    int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int pIndex = (low); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {


                // swap arr[i] and arr[j]
                int temp = arr[pIndex];
                arr[pIndex] = arr[j];
                arr[j] = temp;

                pIndex++;
            }
        }

        // swap arr[pIndex] and arr[high] (or pivot)
        int temp = arr[pIndex];
        arr[pIndex] = arr[high];
        arr[high] = temp;

        return pIndex;
    }


    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pIndex = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pIndex-1);
            sort(arr, pIndex+1, high);
        }
    }


    public static void main(String args[])
    {
        int arr[] = {10, 7, 8, 9, 1, 5,34,12,4,7,41};
        int n = arr.length;

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n-1);

        IntStream intStream = Arrays.stream(arr);
        intStream.forEach(x -> System.out.println(x));
    }
}
