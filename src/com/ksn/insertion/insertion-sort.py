
class InsertionSort:
    def __init__(self):
        pass

    def sort(self,arr):
        n = len(arr)
        for i in range(1,n):
            key = arr[i]
            j = i-1
            while j>=0 and arr[j] > key:
                arr[j+1] =arr[j]
                j = j-1

            arr[j+1] = key

insertionSort = InsertionSort();
arr = [2,4,7,3,2,7,5,89,44,66,20]
insertionSort.sort(arr)
print(arr)