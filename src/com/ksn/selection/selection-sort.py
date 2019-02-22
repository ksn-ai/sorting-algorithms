
class SelectionSort:
    def __init__(self):
        pass

    def sort(self, arr):
        n = len(arr)
        #One by one move boundary of unsorted subarray
        for i in range(0, n-1):
            #Find the minimum element in unsorted array
            min_idx = i
            for j in range(i+1, n):
                if arr[j] < arr[min_idx]:
                    min_idx = j

            #Swap the found minimum element with the first elem
            temp = arr[min_idx]
            arr[min_idx] = arr[i]
            arr[i] = temp


selectionSort = SelectionSort()
arr = [3,4,6,3,7,89,23,12,54]
selectionSort.sort(arr)
print(arr)