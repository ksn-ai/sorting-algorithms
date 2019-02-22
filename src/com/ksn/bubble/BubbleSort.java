package com.ksn.bubble;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BubbleSort {

    public void sort(int arr[]){

        for(int i=0; i<arr.length-1;i++){
            for(int j= 0 ;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    //swap element
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String ...s){
        BubbleSort bubbleSort = new BubbleSort();
        int arr[] = {3,2,6,5,8,923,6,34,12,65,3};
        bubbleSort.sort(arr);

        IntStream intStream = Arrays.stream(arr);
        intStream.forEach(x -> System.out.println(x));

    }
}
