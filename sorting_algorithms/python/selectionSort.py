def selection_sort(arr):
    # Traverse through the entire array.
    for i in range(len(arr)):
        # Find the index of the minimum element in the remaining unsorted part of the array.
        min_index = i
        for j in range(i + 1, len(arr)):
            if arr[j] < arr[min_index]:
                min_index = j
        
        # Swap the minimum element with the current element at index i.
        arr[i], arr[min_index] = arr[min_index], arr[i]

# Example usage:
arr = [38, 27, 43, 3, 9, 82, 10]
selection_sort(arr)
print(arr)


#SELECTION SORT

#Selection sort is a simple sorting algorithm that repeatedly finds the minimum element from the unsorted part of the array and moves it to the beginning. It has a time complexity of O(n^2) and is not suitable for large datasets, but it's easy to understand and implement.