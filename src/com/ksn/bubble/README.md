#### Bubble sort



```
Bubble Sort is the simplest sorting algorithm that works by repeatedly 
swapping the adjacent elements if they are in wrong order.

```

#### Python code

```python

class BubbleSort:
    def __init__(self):
        pass

    def sort(self, arr):
            n = len(arr)
            for i in range(0, n):
                for j in range(0, n-i-1):
                    if arr[j] > arr[j+1]:
                        #swap
                        temp = arr[j]
                        arr[j] = arr[j+1]
                        arr[j+1] = temp


bubbleSort =  BubbleSort()
arr = [2,3,5,7,9,3,5,89,44]
bubbleSort.sort(arr);
print(arr)

```

#### Java code:

```java

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
```






