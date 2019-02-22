package com.ksn.selection;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SelectionSort {

    public void sort(int [] arr){
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String ...s) {

        SelectionSort selectionSort = new SelectionSort();

        int arr[] = {3,2,6,5,8,923,6,34,12,65,3};
        selectionSort.sort(arr);

        IntStream intStream = Arrays.stream(arr);
        intStream.forEach(x -> System.out.println(x));

    }
}
