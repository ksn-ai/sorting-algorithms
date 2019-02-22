#### Bubble sort



```
Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.

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






